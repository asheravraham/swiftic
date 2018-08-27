package flows;

import Utils.Base;
import com.aventstack.extentreports.ExtentReports;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.xml.sax.SAXException;
import pages.FeaturesPage;
import pages.LoginPage;
import pages.mainPage;
import pages.wizard;

import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import java.util.UUID;
import java.util.concurrent.TimeUnit;


public class LoginFlow extends Base {

    String uuid = UUID.randomUUID().toString();




    @BeforeClass
    public static void startSession() throws SAXException, ParserConfigurationException, jdk.internal.org.xml.sax.SAXException, IOException {
        System.setProperty ("webdriver.chrome.driver","C:\\SeleniumDrivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get ("https://www.swiftic.com/");
        driver.manage().deleteAllCookies();
        driver.manage ().window ().maximize ();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        extent = new ExtentReports ();
        mp = PageFactory.initElements (driver, mainPage.class);
        lp = PageFactory.initElements (driver, LoginPage.class);
        wz = PageFactory.initElements (driver, wizard.class);
        fp = PageFactory.initElements (driver, FeaturesPage.class);



    }

    @Test
    public void loginTest() throws IOException, InterruptedException {
        try {
            WebDriverWait wait = new WebDriverWait(driver, 30);

            //step1 - sign up with email
            lp.createbutton.click ();
            lp.signUpEmail.isDisplayed ();
            lp.signUpEmail.sendKeys (uuid+"@test.com");
            lp.signUpPassword.sendKeys ("1q2w3e4r");
            lp.rePassword.sendKeys ("1q2w3e4r");
            lp.joinButton.click ();

            //step 2 - insert application data
            wz.facebookUrl.sendKeys ("CNN");
            wz.appNameField.sendKeys ("TestCnnApp");
            wz.facebookNext.click ();// need to wait about 20 sec and handle with some un expected popups

            //step 3 - add new feature
            wait.until(ExpectedConditions.visibilityOf (wz.startButton));
            wz.startButton.click ();
            wz.step1XButton.click ();
            Thread.sleep(2000);

//            fp.addFeatureButton.click ();(
            wait.until(ExpectedConditions.visibilityOf (fp.callUsFeature));
            fp.callUsFeature.click ();
            fp.phoneNumberField.sendKeys ("12345677777");
            fp.saveFaetureButton.click ();
            fp.doneEditing.click ();
            fp.saveDialogButton.click ();

            //choose plan screen
            driver.switchTo ().frame(fp.iframe);

            fp.yearly.click ();

            //buy now page/Iframe
            fp.fullName.sendKeys ("Asher Test");
            fp.phoneNumber.sendKeys ("123456789");
            fp.creditCardNumber.sendKeys ("4580458045804580");
            fp.securityCode.sendKeys ("123");
            Thread.sleep (2000);
            fp.checkBoxStoreMyCard.click ();
            Thread.sleep (2000);
            fp.payButton.click ();




        } catch (Exception err) {
            System.out.println ("aaa " +  err);



        }
    }
    @AfterClass
    public static void closeSession()
    {
//        driver.quit ();
    }}
