package flows;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import org.openqa.selenium.WebDriver;
import pages.FeaturesPage;
import pages.mainPage;
import pages.wizard;

public class TestBase
{
    protected static WebDriver driver;
    protected static ExtentReports extent;
    protected static ExtentTest test;
    protected static mainPage mp;

    protected static wizard wz;
    protected static FeaturesPage fp;
    protected static String PropFIlePath = "C:\\workspace\\swiftic\\env.properties";
}
