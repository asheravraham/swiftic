package services;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.LocalFileDetector;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

public class LoginLogoutService
{
    private static String OS = System.getProperty("os.name").toLowerCase();
//    public static final Logger log4j = Logger.getLogger(BaseService.class);
    public static final String resourcesDir = "src" + File.separator + "main"+ File.separator +"resources"+ File.separator;


    public WebDriver performLogin(boolean isPermissionTag) throws InterruptedException {
        WebDriver driver;
        WebDriverWait driverWait;
        DesiredCapabilities dc;
        try {
            selectDriver();

            String className = this.getClass().getName();
            String OS = System.getProperty("os.name").toLowerCase();
            dc = WebDriverConfiguration.getDesiredCapabilities( OS,className);

            Map<String, Object> prefs = new HashMap<String, Object> ();
            File file = new File(resourcesDir + "downloads");
            prefs.put("download.default_directory",  file.getAbsolutePath());
            ChromeOptions options = new ChromeOptions();
            options.setExperimentalOption("prefs", prefs);
            dc.setCapability(ChromeOptions.CAPABILITY, options);


            if(Boolean.valueOf(PropsReader.getPropValuesForEnv("use.selenium.grid")).booleanValue()) {
                String nodeUrl = PropsReader.getPropValuesForEnv("remote.node.url");
                System.out.println("selecting selenium grid");
                driver = new RemoteWebDriver (new URL (nodeUrl), dc);
                ((RemoteWebDriver)driver).setFileDetector(new LocalFileDetector ());
            } else {
                driver = new ChromeDriver (dc);
            }
            driver.manage().timeouts().pageLoadTimeout(120, TimeUnit.SECONDS);
            if(OS.equalsIgnoreCase("linux")){
                driver.manage().window().setSize(new Dimension (1600, 1024));
            }else {
                driver.manage().window().maximize();
            }

            String email = PropsReader.getPropValuesForEnv("user");
            String pass = PropsReader.getPropValuesForEnv("password");
            if (isPermissionTag){
                email = PropsReader.getPropValuesForHub("user.permission");
                pass = PropsReader.getPropValuesForHub("password.permission");
            }

            String hubURL = PropsReader.getPropValuesForEnv("HubURL");
            System.out.println("before url up: "+ hubURL);
            driver.get(hubURL);
            System.out.println("after url up");
            driverWait = new WebDriverWait(driver, 60);
            driverWait.until(ExpectedConditions.visibilityOfElementLocated(BaseLoginPage.EMAIL));
            WebElement login = driver.findElement(BaseLoginPage.EMAIL);
            login.sendKeys(email);
            TimeUnit.SECONDS.sleep(1);
            WebElement password = driver.findElement(BaseLoginPage.PASSWORD);
            password.sendKeys(pass);
            TimeUnit.SECONDS.sleep(1);
            WebElement loginButton = driver.findElement(BaseLoginPage.LOGIN);
            loginButton.click();
            TimeUnit.SECONDS.sleep(5);
            waitForLoad(driver,driverWait);
            //wait until logout label is visible - the page was loaded
            driverWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"header\"]")));
            System.out.println("finished login");
            return driver;

        } catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }



    public static void waitForLoad(WebDriver driver,WebDriverWait webDriverWait) throws InterruptedException{

        boolean loading = true;
        long timeoutCounter = 0;

        while (loading && (timeoutCounter <= BaseService.TIMEOUT_FOR_PAGE_LOAD_WAIT_SEC)) {
            TimeUnit.SECONDS.sleep(1);
            try {
                driver.findElement(By.id("loading-bar"));
            } catch (NoSuchElementException e) {
                webDriverWait.until((ExpectedCondition) wd ->
                        ((JavascriptExecutor) driver).executeScript("return document.readyState").equals("complete"));
                loading = false;
            }
            timeoutCounter++;
        }
    }

    public  WebDriver performLogin() throws InterruptedException{

        return performLogin(false);

    }


    public void selectDriver(){
        if(OS.contains(Platform.WINDOWS.name().toLowerCase())){
            System.setProperty("webdriver.chrome.driver", "chromeDriver\\chromedriverWindows.exe");
        }else if(OS.contains(Platform.MAC.name().toLowerCase())) {
            System.setProperty("webdriver.chrome.driver", "chromeDriver/chromedriverMac");
        }else{//LINUX
            System.setProperty("webdriver.chrome.driver", "/usr/bin/chromedriver");
            System.setProperty("webdriver.chrome.logfile", "/home/ubuntu/chromedriver.log");
            System.setProperty("webdriver.chrome.verboseLogging", "true");
        }
    }

    public void performLogout (WebDriver driver){

        driver.close();
        driver.quit();

    }


    public static String getOS() {
        return OS;
    }

    private static class WebDriverConfiguration {



        public static DesiredCapabilities getDesiredCapabilities(String platformName, String className){

            DesiredCapabilities dc = DesiredCapabilities.chrome();

            if(Platform.LINUX.toString().contains(platformName.toUpperCase())){
                dc.setPlatform(Platform.LINUX);

            }else if(platformName.contains("win")){

                dc.setPlatform(Platform.WINDOWS);

            }else if(platformName.contains(Platform.MAC.getPartOfOsName()[0])){

                dc.setPlatform(Platform.MAC);
            }
            System.out.println("Platform:" + dc.getPlatform().name());
            dc.setBrowserName(DesiredCapabilities.chrome().getBrowserName());
            System.out.println("Browser name: " + dc.getBrowserName());

            return dc;
        }

    }
}
