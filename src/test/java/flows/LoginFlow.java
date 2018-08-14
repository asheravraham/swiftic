package flows;

import Utils.Base;
import com.aventstack.extentreports.ExtentReports;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.xml.sax.SAXException;
import pages.mainPage;

import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;



public class LoginFlow extends Base {

    public static WebDriver driver;



//    public LoginFlow() {
//        super (driver);
//    }

    @BeforeClass
    public static void startSession() throws SAXException, ParserConfigurationException, jdk.internal.org.xml.sax.SAXException, IOException {
        System.setProperty ("webdriver.chrome.driver","C:\\SeleniumDrivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get ("https://www.swiftic.com/");
        driver.manage ().window ().maximize ();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        extent = new ExtentReports ();
        WebDriverWait wait = new WebDriverWait(driver, 30);
        mp = PageFactory.initElements (driver, mainPage.class);


    }
//
//    @Test
//    public void loginTest() throws IOException, InterruptedException
//    {
//
//        mp.createbutton.click ();
//
//
//
//    }



}
