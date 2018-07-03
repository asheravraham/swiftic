package pages;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;


public class mainPage extends Utils.Base
{
    @FindBy(how = How.ID, using = "menu-item-17422")
    public WebElement createbutton;

    @FindBy(how = How.ID, using = "chosen_language")
    public WebElement chosen_language;

    @FindBy(how = How.ID, using = "chosen_language")
    public WebElement language_1;

    @FindBy(how = How.ID, using = "chosen_language")
    public WebElement language_2;

    @FindBy(how = How.ID, using = "chosen_language")
    public WebElement language_3;

    @FindBy(how = How.ID, using = "chosen_language")
    public WebElement language_4;

    @FindBy(how = How.ID, using = "chosen_language")
    public WebElement language_5;

}

