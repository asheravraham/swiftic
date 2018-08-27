package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class wizard
{

    //Tab 1 "name"
    @FindBy(how = How.ID, using = "txtAppName")
    public WebElement appNameField;

    @FindBy(how = How.ID, using = "btnAppNameNext")
    public WebElement appNameNext;

    //Tab 2 "content" facebookfllow
    @FindBy(how = How.ID, using = "txtFacebookUrl1")
    public WebElement facebookUrl;

    @FindBy(how = How.XPATH, using = "//*[@id=\"btnFacebookUrlCreate1\"]")
    public WebElement facebookNext;

    @FindBy(how = How.ID, using = "btnGoWebsiteUrl5")
    public WebElement clickherebttn1;

    @FindBy(how = How.XPATH, using = "back medium-font xh-highlight")
    public WebElement facebookBack;

    @FindBy(how = How.CLASS_NAME, using = "ui-autocomplete ui-front ui-menu ui-widget ui-widget-content ui-corner-all")
    public WebElement autocomplete;

    //Tab 2 "content" websitefllow
    @FindBy(how = How.ID, using = "txtWebsiteUrl")
    public WebElement websiteUrl;

    @FindBy(how = How.ID, using = "btnWebsiteUrlNext")
    public WebElement websiteUrlNext;

    @FindBy(how = How.ID, using = "btnNoWebsiteUrl")
    public WebElement clickherebttn2;

    @FindBy(how = How.XPATH, using = "*//div[4]/div/a")
    public WebElement websiteBack;

    @FindBy(how = How.ID, using = "tourStepContainer")
    public WebElement welcomeDialog;

    @FindBy(how = How.XPATH, using = "//*[@id=\"step_0\"]/div/div[3]/div[2]")
    public WebElement startButton;

    @FindBy(how = How.CSS, using = "#step_1 > div > div.close")
    public WebElement step1XButton;







}
