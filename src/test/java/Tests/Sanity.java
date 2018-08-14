package Tests;

import Utils.Base;
import com.aventstack.extentreports.ExtentReports;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.xml.sax.SAXException;
import pages.FeaturesPage;
import pages.mainPage;
import pages.wizard;

import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class Sanity extends Base
{


    @BeforeClass
    public static void startSession() throws SAXException, ParserConfigurationException, jdk.internal.org.xml.sax.SAXException, IOException {
        System.setProperty ("webdriver.chrome.driver","C:\\SeleniumDrivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get ("https://www.swiftic.com/");
        driver.manage ().window ().maximize ();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        extent = new ExtentReports ();
        mp = PageFactory.initElements(driver, mainPage.class);
        fp = PageFactory.initElements (driver, FeaturesPage.class);
        wz = PageFactory.initElements (driver, wizard.class);
        WebDriverWait wait = new WebDriverWait(driver, 30);

    }
//Need to improve the test!!!
    @Test
    public void test() throws IOException, InterruptedException {
//        try {


        Actions actions = new Actions(driver);
        WebDriverWait wait = new WebDriverWait(driver, 90);
        mp.createbutton.click ();
//        test.log(PASS, "Create button was clicked");
//        Thread.sleep(3000);
        wait.until (ExpectedConditions.visibilityOf (wz.appNameField));
        wz.appNameField.sendKeys ("CNN");
        wz.appNameNext.click ();
//            test.log(PASS, "AppName next button was clicked");
//            Thread.sleep(3000);
        wait.until (ExpectedConditions.visibilityOf (wz.facebookUrl));
        wz.facebookUrl.sendKeys ("CNN");
        wz.facebookNext.click ();
//            test.log(PASS, " FB Next button was clicked");
//            Thread.sleep(3000);
//        actions.click ().moveToElement (wz.startButton).click ().build ().perform ();

        wait.until (ExpectedConditions.visibilityOf (fp.addFeatureButton));
        fp.tourStepPopUp.click ();
        fp.closepopup.click ();
//
//        Alert popup = driver.switchTo().alert();
//        popup.accept ();
//        if ( fp.addFeatureButton.isEnabled () )
//        {
//                fp.addFeatureButton.click ();
//        }

//            test.log(PASS, "Feature Create button was clicked");
            Thread.sleep(3000);
        wait.until (ExpectedConditions.visibilityOf (fp.mapFeature));
        fp.mapFeature.click ();
        fp.doneEditing.click ();
        Thread.sleep (10000);
//        fp.saveBut.click ();
//        fp.createFeatureButton.click ();

//        }
//        catch (Exception exseptionErr){
//            test.log(FAIL, "Test Failed: "+ exseptionErr.getMessage());

//            test.addScreenCaptureFromPath (CommonFunctions.CaptureScreen(driver,"C:\\Test")));
    }


    @AfterClass
    public static void closeSession(){
//        extent.flush();
        driver.quit ();
//        extent.close();
    }
}
