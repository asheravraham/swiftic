package pages;

import Utils.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage extends Base{


    @FindBy(how = How.ID, using = "menu-item-17422")
    public WebElement createbutton;

    @FindBy(how = How.CSS, using = "#joinUserName")
    public WebElement signUpEmail;

    @FindBy(how = How.XPATH, using = "//*[@id=\"registerForm\"]/div[2]/div/div/input")
    public WebElement signUpPassword;

    @FindBy(how = How.XPATH, using = "//*[@id=\"repassword\"]")
    public WebElement rePassword;

    @FindBy(how = How.XPATH, using = "//*[@id=\"registerForm\"]/div[4]/div/button")
    public WebElement joinButton;

    @FindBy(how = How.XPATH, using = "//*[@id=\"userName\"]")
    public WebElement signInUserName;

    @FindBy(how = How.XPATH, using = "//*[@id=\"password\"]")
    public WebElement signInPassword;

    @FindBy(how = How.XPATH, using = "//*[3]/div/button/span")
    public WebElement signInButton;

    @FindBy(how = How.XPATH, using = "//*/section/ul/li[1]/a")
    public WebElement userMail;

    @FindBy(how = How.XPATH, using = "//*/section/ul/li[3]/a")
    public WebElement logoutButton;
}
