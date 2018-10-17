package flows;

import Utils.Base;
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

import static org.junit.Assert.fail;
import static services.UIDebugLogger.log4j;


public class LoginFlow extends Base {

    String uuid = UUID.randomUUID().toString();

    @BeforeClass
    public static void startSession() throws SAXException, ParserConfigurationException, jdk.internal.org.xml.sax.SAXException, IOException {

        Base.selectDriver();
        driver = new ChromeDriver();

        driver.get ("https://www.swiftic.com/");
        driver.manage().deleteAllCookies();
        driver.manage ().window ().maximize ();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        mp = PageFactory.initElements (driver, mainPage.class);
        lp = PageFactory.initElements (driver, LoginPage.class);
        wz = PageFactory.initElements (driver, wizard.class);
        fp = PageFactory.initElements (driver, FeaturesPage.class);




    }

    @Test
    public void SanityTest() throws IOException, InterruptedException {
        try {

            WebDriverWait wait = new WebDriverWait(driver, 30);
            wait.until (ExpectedConditions.visibilityOf (lp.createbutton));
            //step1 - sign up with email
            lp.createbutton.click ();
            log4j.info ("create button clicked");
            wait.until (ExpectedConditions.visibilityOf (lp.signUpEmail));
            lp.signUpEmail.sendKeys (uuid+"@test.com");
            Thread.sleep(2000);
            lp.signUpPassword.sendKeys ("1q2w3e4r");
            Thread.sleep(2000);
            lp.rePassword.sendKeys ("1q2w3e4r");
            wait.until (ExpectedConditions.visibilityOf (lp.joinButton));
            lp.joinButton.click ();
            log4j.info ("Join button clicked");

            //step 2 - insert application data
            wz.facebookUrl.sendKeys ("CNN");
            wz.appNameField.sendKeys ("TestCnnApp");
            wz.facebookNext.click ();// need to wait about 20 sec and handle with some un expected popups

            log4j.info ("FB page was inserted");
            Thread.sleep(5000);
            //step 3 - add new feature
            Thread.sleep(2000);
            wz.startButton.click ();
            wait.until(ExpectedConditions.visibilityOf (wz.step1XButton));
            wz.step1XButton.click ();
            Thread.sleep(2000);
            wait.until(ExpectedConditions.visibilityOf (fp.callUsFeature));
            fp.callUsFeature.click ();
            fp.phoneNumberField.sendKeys ("12345677777");
            fp.saveFaetureButton.click ();
            log4j.info ("Feature was added ");
            Thread.sleep(2000);
            fp.doneEditing.click ();

            Thread.sleep(2000);
            //choose plan screen
            driver.switchTo ().frame(fp.iframe);
            Thread.sleep(2000);
            fp.yearly.click ();
            log4j.info (" plan was selected");

            //buy now page/Iframe
            fp.fullName.sendKeys ("Asher Test");
            fp.phoneNumber.sendKeys ("123456789");
            fp.creditCardNumber.sendKeys ("4580458045804580");
            fp.securityCode.sendKeys ("123");
            Thread.sleep (2000);
            fp.checkBoxStoreMyCard.click ();
            Thread.sleep (2000);
            fp.payButton.click ();
            log4j.info ("pay flow ");

        } catch (Exception err) {
            log4j.error(err.getMessage(), err);
            Base.CaptureScreen (driver, "C:\\Test\\swifticscreenshots\\screenshot");
            fail ("Test fail see error description");
        }

        catch(AssertionError asrerr) {
            log4j.error ("Assert Failed: " + asrerr.getMessage ());
            Base.CaptureScreen (driver, "C:\\Test\\swifticscreenshots\\screenshot");
            fail("Assertion Fail see description");
        }
    }
    @AfterClass
    public static void closeSession()
    {
        driver.quit ();
    }}
