package flows;

import Utils.Base;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
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
import java.util.concurrent.TimeUnit;

import static org.junit.Assert.fail;
import static services.UIDebugLogger.log4j;

public class SignInFlow extends Base
{
    protected static WebDriver driver;
    protected static ExtentReports extent;
    protected static ExtentTest test;
    protected static mainPage mp;
    protected static wizard wz;
    protected static FeaturesPage fp;
//    protected static String PropFIlePath = "C:\\workspace\\swiftic\\env.properties";


    @BeforeClass
    public static void startSession() throws SAXException, ParserConfigurationException, jdk.internal.org.xml.sax.SAXException, IOException
    {
        Base.selectDriver();
        driver = new ChromeDriver ();
        driver.get ("https://www.swiftic.com/");
        driver.manage ().window ().maximize ();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        mp = PageFactory.initElements (driver, mainPage.class);
        lp = PageFactory.initElements (driver, LoginPage.class);
        wz = PageFactory.initElements (driver, wizard.class);
        fp = PageFactory.initElements (driver, FeaturesPage.class);
    }

    @Test
    public void signInTest()throws IOException, InterruptedException
    {
      try{

          WebDriverWait wait = new WebDriverWait(driver, 10);
          wait.until (ExpectedConditions.visibilityOf (mp.signInButton));
          //step1 - sign in with email
          mp.signInButton.click ();
          lp.signInUserName.sendKeys ("asher@test.com");
          lp.signInPassword.sendKeys ("aa2009");
          lp.signInButton.click ();
          Thread.sleep (20000);

            }

      catch (Exception err) {
          log4j.error(err.getMessage(), err);
          Base.CaptureScreen (driver, "C:\\workspace\\swiftic\\screenshots\\screenshot");
          fail ("Test fail see error description");
      }

      catch(AssertionError asrerr) {
          log4j.error ("Assert Failed: " + asrerr.getMessage ());
          Base.CaptureScreen (driver, "C:\\workspace\\swiftic\\screenshots\\screenshot");
          fail("Assertion Fail see description");
      }


    }

    @AfterClass
    public  static void closeSession()
    {
        Actions actions = new Actions(driver);
        actions.moveToElement (lp.userMail).moveToElement (lp.logoutButton).click ().build ().perform ();
        log4j.info ("logout button successfully clicked");
        driver.quit ();
    }
}
