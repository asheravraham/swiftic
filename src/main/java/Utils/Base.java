package Utils;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import jdk.internal.org.xml.sax.SAXException;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.w3c.dom.Document;
import pages.FeaturesPage;
import pages.LoginPage;
import pages.mainPage;
import pages.wizard;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;
import java.util.concurrent.TimeUnit;


public class Base
{
    protected static WebDriver driver;
    protected static ExtentReports extent;
    protected static ExtentTest test;
    protected static mainPage mp;
    protected static LoginPage lp;
    protected static wizard wz;
    protected static FeaturesPage fp;
    protected static String PropFIlePath = "C:\\workspace\\swiftic\\env.properties";
//    public  Actions actions = new Actions (driver);


    Random rndNum = new Random ();

    public static void  initHub(boolean isPermissionTag){
        try {
            LoginLogoutService l= new LoginLogoutService();
            driver =  l.performLogin(isPermissionTag);
            AssetService.setDriver(driver);
            Navigator.setDriver(driver);
            Navigator.selectApplicationFromEnv();
        } catch (Exception e) {
            takeScreenShotAfterFailLogin(e);
        }
    }

    private static void takeScreenShotAfterFailLogin(Exception e) {
        DateFormat df = new SimpleDateFormat ("ddMMyyyyHHmmss");
        String data = df.format(new Date ());
        ScreenShotTaker.takeScreenShot("initFlow_" + data, log4j);
        log4j.error(e.getMessage(),e);
        e.printStackTrace();
        Assert.fail(e.getMessage());
    }

    public static String CaptureScreen(WebDriver driver, String ScreenShotsPath) {

        TakesScreenshot sc = (TakesScreenshot)driver;
        File scShot = sc.getScreenshotAs(OutputType.FILE);
        File oDest  = new File(ScreenShotsPath+".jpg");
        return ScreenShotsPath+".jpg";
    }

    //Read data from XML file
    public static String getData ( String path,String prop ) throws ParserConfigurationException, SAXException, IOException, org.xml.sax.SAXException
    {

        File envProp = new File(path);

        DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();

        DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();

        Document doc = dBuilder.parse(envProp);

        doc.getDocumentElement().normalize();

        return doc.getElementsByTagName(prop).item(0).getTextContent();

    }


    // select Values method
    public void selectValues(WebElement elementToselect)
    {

//        actions.moveToElement(elementToselect).click().build().perform();

    }

    // mouse hover method
    public void hover(WebElement elementToselect)
    {
//        actions.moveToElement(elementToselect).build().perform();

    }



//    public Base(WebDriver driver){
//        try {
//            this.driver=driver;
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }


    public boolean IsDisplayed(WebElement WebElement) {
        try {
            WebElement.isDisplayed();
            return true;
        } catch (Exception e) {
            /* כתיבה לדוח שהאלמנט לא מוצג */
            e.printStackTrace();
        }

        return false;
    }


    public  boolean IsSelected(WebElement WebElement) {
        try {
            return WebElement.isSelected();

        } catch (Exception e) {
            /* כתיבה לדוח שהאלמנט לא נבחר כבר */
            e.printStackTrace();
        }

        return false;
    }



    public static boolean IsElemenetExists(WebElement webElement) {
        try {

            if (webElement != null) {
                return true;
            }

        } catch (Exception e) {
            /* כתיבה לדוח שהאלמנט לא נמצא */
            e.printStackTrace();
        }

        return false;
    }

    public static boolean IsEnabled(WebElement webElement) {
        try {
            webElement.isEnabled();
            return true;
        } catch (Exception e) {
            /* כתיבה לדוח שהאלמנט לא נמצא */
            e.printStackTrace();
        }

        return false;
    }




    public String GetAttribute(WebElement webElement) {
        String attribute = null;
        try {
            attribute = webElement.getAttribute("value");

        } catch (Exception e) {
            /* כתיבה לדוח שהאלמנט לא נמצא */
            e.printStackTrace();
        }

        return attribute;
    }

    public static void ScorllToElement(WebElement element) {
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);


    }

    public static void Search(String text, WebElement clickBotunElemenet, WebElement textboxElement) {
        try {
            textboxElement.sendKeys(text);
            clickBotunElemenet.click();
        } catch (Exception e) {
            e.printStackTrace();

        }


    }

    public static void HomePageIcon(WebElement iconHomePage) {
        try {
            iconHomePage.click();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public static void ClosePopup(WebElement icon_X) {
        try {
            icon_X.click();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public static void IconPlus(WebElement icon_plus) {
        try {
            icon_plus.click();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public static void IconPlus(WebElement icon_plus, int count) {
        try {
            int i;
            for (i = 0; i < count; i++)

                icon_plus.click();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public boolean waitForPageLoad(int waitTimeInSec,
                                   ExpectedCondition<Boolean>... conditions) {
        boolean isLoaded = false;
        Wait<WebDriver> wait = new FluentWait(driver)
                .withTimeout(waitTimeInSec, TimeUnit.SECONDS)
                .ignoring(StaleElementReferenceException.class)
                .pollingEvery(2, TimeUnit.SECONDS);
        for (ExpectedCondition<Boolean> condition : conditions) {
            isLoaded = wait.until(condition);
            if (isLoaded == false) {
                //Stop checking on first condition returning false.
                break;
            }
        }
        return isLoaded;


    }



    public void pause(Integer milliseconds){
        try {
            TimeUnit.MILLISECONDS.sleep(milliseconds);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


    public static void ClickOnElement(WebElement webElement)
    {
        IsElemenetExists(webElement);
        ScorllToElement(webElement);
        try {
            webElement.click();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    public static void ClickOnElementWithJavaScript(WebElement webElement)
    {
        IsElemenetExists(webElement);
        ScorllToElement(webElement);
        try {
            webElement.click();
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            ((JavascriptExecutor)driver).executeScript("agruments[0].click();",webElement  );
        } catch (Exception eX) {
            eX.printStackTrace();

        }


    }

    private static Object getDriver() {
        return getDriver();
    }


    //go to another page
    public static void Pagination()
    {
        try {
            String currentWindow =driver.getWindowHandle();
            for (String windowHandel:driver.getWindowHandles())
            {
                if (windowHandel.compareTo(currentWindow)!=0)
                {driver.switchTo().window(windowHandel);}
            }
        } catch (Exception e) {
            driver.switchTo().window(driver.getWindowHandles().iterator().next());
        }


    }

    public static boolean IsExistPopupAlert()
    {
        try {
            driver.switchTo().alert();
            return true;
        } catch (NoAlertPresentException e) {
            return false;
        }
    }

    public static boolean CloseExistPopupAlert()
    {
        try {
            driver.switchTo().alert().accept();
            return true;
        } catch (NoAlertPresentException e) {
            return false;
        }
    }

    public static boolean PopupAlertContainsText(String text)
    {
        try {
            Alert alert= driver.switchTo().alert();
            return alert.getText().contains(text);
        } catch (NoAlertPresentException e) {
            return false;
        }
    }



    public static boolean MaximizWindow()
    {
        try {
            driver.manage().window().maximize();
        } catch (Exception e) {
            return false;
        }
        return true;

    }

    public static boolean WaitDocumentLoading()
    {
        try {
            driver.manage().timeouts().pageLoadTimeout(3, TimeUnit.MINUTES);
            return true;
        } catch (Exception e) {
            return false;
        }

    }







}
