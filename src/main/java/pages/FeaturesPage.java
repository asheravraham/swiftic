package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class FeaturesPage extends  Utils.Base
{
    // default feature Tab
    @FindBy(how = How.XPATH, using = "//*[@id=\"wizard_menu\"]/a[1]/span")
    public WebElement appFeaturesTab;
    // style Tab
    @FindBy(how = How.XPATH, using = "//*[@id=\"wizard_menu\"]/a[2]/span")
    public WebElement styleAndNavigationTab;
    // pluse icon on the top right corner
    @FindBy(how = How.XPATH, using = "//*[@id=\"my_pages\"]/div/a[1]")
    public WebElement plusIcon;
    // left arrow
    @FindBy(how = How.XPATH, using = "//*[@id=\"my_pages\"]/div/a[2]")
    public WebElement navigateLeft;
    // right arrow
    @FindBy(how = How.XPATH, using = "//*[@id=\"my_pages\"]/div/a[3]")
    public WebElement navigateRight;

    @FindBy(how = How.XPATH, using = "//*[@id=\"pages_list_container\"]/ul/li[1]/a/span[2]")
    public WebElement feature_1;

    @FindBy(how = How.XPATH, using = "//*[@id=\"pages_list_container\"]/ul/li[2]/a/span[2]")
    public WebElement feature_2;

    @FindBy(how = How.XPATH, using = "//*[@id=\"pages_list_container\"]/ul/li[3]/a/span[2]")
    public WebElement feature_3;

    @FindBy(how = How.XPATH, using = "//*[@id=\"pages_list_container\"]/ul/li[4]/a/span[2]")
    public WebElement feture_4;

    @FindBy(how = How.XPATH, using = "//*[@id=\"pages_list_container\"]/ul/li[5]/a")
    public WebElement feature_5;
    //add feature button
    @FindBy(how = How.CLASS_NAME, using = "//*[@id=\"editor\"]/div[6]/div/a")
    public WebElement addFeatureButton;

    //add feature categories "Recommended"
    @FindBy(how = How.XPATH, using = "//*[@id=\"pages_list\"]/div/div/ul/li[1]/a")
    public WebElement Recommended;

    //category "Recommended " --> callus
    @FindBy(how = How.XPATH, using = "//*[@id=\"pages_list\"]/ul/li[1]/a/div[1]")
    public WebElement callUsFeature;

    //category "Recommended " --> contact us
    @FindBy(how = How.XPATH, using = "//*[@id=\"pages_list\"]/ul/li[2]/a/div[1]")
    public WebElement contactUsFeature;

    //category "Recommended " --> map
    @FindBy(how = How.XPATH, using = "//*[@id=\"pages_list\"]/ul/li[3]/a/div[1]")
    public WebElement mapFeature;

    //category "Recommended " --> photos
    @FindBy(how = How.XPATH, using = "//*[@id=\"pages_list\"]/ul/li[4]/a/div[1]")
    public WebElement photosFeature;

    //category "Recommended " --> form
    @FindBy(how = How.XPATH, using = "//*[@id=\"pages_list\"]/ul/li[5]/a/div[1]")
    public WebElement formFeature;

    //category "Recommended " --> coupons
    @FindBy(how = How.XPATH, using = "//*[@id=\"pages_list\"]/ul/li[6]/a/div[1]")
    public WebElement couponsFeature;

    //category "Recommended " --> scratchCard
    @FindBy(how = How.XPATH, using = "//*[@id=\"pages_list\"]/ul/li[7]/a/div[1]")
    public WebElement scratchCardFeature;

    //category "Recommended " --> loyaltyCards
    @FindBy(how = How.XPATH, using = "//*[@id=\"pages_list\"]/ul/li[8]/a/div[1]")
    public WebElement loyaltyCardsFeature;

    //category "Recommended " --> facebookFeature
    @FindBy(how = How.XPATH, using = "//*[@id=\"pages_list\"]/ul/li[9]/a/div[1]")
    public WebElement facebookFeature;

    //category "Recommended " --> custom Feature
    @FindBy(how = How.XPATH, using = "//*[@id=\"pages_list\"]/ul/li[10]/a/div[1]")
    public WebElement customFeature;

    //category "Recommended " --> liveAlbumFeature
    @FindBy(how = How.XPATH, using = "//*[@id=\"pages_list\"]/ul/li[11]/a/div[1]")
    public WebElement liveAlbumFeature;



    //add feature categories "Loyalty"
    @FindBy(how = How.XPATH, using = "//*[@id=\"pages_list\"]/div/div/ul/li[2]/a")
    public WebElement loyaltyCategory;

    //category "Loyalty " --> couponsFeature
    @FindBy(how = How.XPATH, using = "//*[@id=\"pages_list\"]/ul/li[1]/a/div[1]")
    public WebElement couponsFeature2;

    //category "Loyalty " --> scratchCardFeature
    @FindBy(how = How.XPATH, using = "//*[@id=\"pages_list\"]/ul/li[2]/a/div[1]")
    public WebElement scratchCardFeature2;

    //category "Recommended " --> loyaltyCards
    @FindBy(how = How.XPATH, using = "//*[@id=\"pages_list\"]/ul/li[3]/a/div[1]")
    public WebElement loyaltyCardsFeature2;




    //add feature categories "Sales"
    @FindBy(how = How.XPATH, using = "//*[@id=\"pages_list\"]/div/div/ul/li[3]/a")
    public WebElement salesCategory;

    //category "sales" --> store
    @FindBy(how = How.XPATH, using = "//*[@id=\"pages_list\"]/ul/li[4]/a/div[1]")
    public WebElement storeFeature;



    //add feature categories "Contact"
    @FindBy(how = How.XPATH, using = "//*[@id=\"pages_list\"]/div/div/ul/li[4]/a")
    public WebElement contactCategory;

    //category "Contact" --> Call Us
    @FindBy(how = How.XPATH, using = "//*[@id=\"pages_list\"]/ul/li[1]/a/div[1]")
    public WebElement callus2;

    //category "Contact" --> Contact Us
    @FindBy(how = How.XPATH, using = "//*[@id=\"pages_list\"]/ul/li[2]/a/div[1]")
    public WebElement contactUs2;

    //category "Contact" --> Map
    @FindBy(how = How.XPATH, using = "//*[@id=\"pages_list\"]/ul/li[3]/a/div[1]")
    public WebElement map2;

    //category "Contact" --> Email Us
    @FindBy(how = How.XPATH, using = "//*[@id=\"pages_list\"]/ul/li[4]/a/div[1]")
    public WebElement emailUsFeature;

    //category "Contact" --> Form
    @FindBy(how = How.XPATH, using = "//*[@id=\"pages_list\"]/ul/li[5]/a/div[1]")
    public WebElement form2;

    //category "Contact" --> About Us
    @FindBy(how = How.XPATH, using = "//*[@id=\"pages_list\"]/ul/li[6]/a/div[1]")
    public WebElement aboutUs;

    //category "Contact" --> bookAnAppointment
    @FindBy(how = How.XPATH, using = "//*[@id=\"pages_list\"]/ul/li[7]/a/div[1]")
    public WebElement bookAnAppointment;



    //add feature categories "Engagement"
    @FindBy(how = How.XPATH, using = "//*[@id=\"pages_list\"]/div/div/ul/li[5]/a")
    public WebElement engagementCategory;

    //category "Engagement" --> facebook
    @FindBy(how = How.XPATH, using = "//*[@id=\"pages_list\"]/ul/li[1]/a/div[1]")
    public WebElement facebook2;

    //category "Contact" --> instagramFeature
    @FindBy(how = How.XPATH, using = "//*[@id=\"pages_list\"]/ul/li[2]/a/div[1]")
    public WebElement instagramFeature;

    //category "Contact" --> twitterFeature
    @FindBy(how = How.XPATH, using = "//*[@id=\"pages_list\"]/ul/li[3]/a/div[1]")
    public WebElement twitterFeature;

    //category "Contact" --> eventsFeature
    @FindBy(how = How.XPATH, using = "//*[@id=\"pages_list\"]/ul/li[4]/a/div[1]")
    public WebElement eventsFeature;

    //category "Contact" --> newsFeature
    @FindBy(how = How.XPATH, using = "//*[@id=\"pages_list\"]/ul/li[5]/a/div[1]")
    public WebElement newsFeature;

    //category "Contact" --> form3
    @FindBy(how = How.XPATH, using = "//*[@id=\"pages_list\"]/ul/li[6]/a/div[1]")
    public WebElement form3;

    //category "Contact" --> videoFeature
    @FindBy(how = How.XPATH, using = "//*[@id=\"pages_list\"]/ul/li[7]/a/div[1]")
    public WebElement videoFeature;

    //category "Contact" --> photos2
    @FindBy(how = How.XPATH, using = "//*[@id=\"pages_list\"]/ul/li[8]/a/div[1]")
    public WebElement photos2;

    //All features button
    @FindBy(how = How.XPATH, using = "//*[@id=\"pages_list\"]/div/div[1]/ul/li[6]/a")
    public WebElement allFeaturesButton;

    @FindBy(how = How.XPATH, using = "//*[@id=\"editor\"]/div[6]/div/a")
    public WebElement createFeatureButton;

    @FindBy(how = How.XPATH, using = "//*[@id=\"step_0\"]/div/div[3]/div[2]/button[2]")
    public WebElement tourStepPopUp;

    @FindBy(how = How.XPATH, using = "//*[@id=\"step_1\"]/div/div[1]")
    public WebElement closepopup;

    @FindBy(how = How.XPATH, using = "//*[@id=\"app_nav\"]/div[2]/div[1]/section[2]/div/a[2]")
    public WebElement saveFaetureButton;

    @FindBy(how = How.XPATH, using = "//*/section[3]/div/a/span")
    public WebElement doneEditing;

//    @FindBy(how = How.XPATH, using = "/html/body/div[6]/div/div/div/div/div[2]/div/a[2]")
//    public WebElement saveDialogButton;

    @FindBy(how = How.XPATH, using = "//*[2]/input")
    public WebElement phoneNumberField;

    @FindBy(how = How.XPATH, using = "//*/section[2]/div/a[1]")
    public WebElement discard;

    @FindBy(how = How.XPATH, using = "//*/section[2]/div/a[2]")
    public WebElement saveFeature;

//    @FindBy(how = How.XPATH, using = "close_popup ng-scope")
//    public WebElement exitEditor;


    // need to continue the page elements identification inside the features!
    //after selecting all feature option

    //choose plan screen
    @FindBy(how = How.XPATH, using = "//*div[1]/div[5]/div[1]")
    public WebElement letsGoButton;

    //payment details
    @FindBy(how = How.XPATH, using = "//*[@id=\"plimusShopperInfoFullName\"]")
    public WebElement fullName;

    @FindBy(how = How.XPATH, using = "//*[@id=\"plimusShopperInfoPhone\"]")
    public WebElement phoneNumber;

    @FindBy(how = How.XPATH, using = "//*[@id=\"plimusCreditCardNumber\"]")
    public WebElement creditCardNumber;

    @FindBy(how = How.XPATH, using = "//*[@id=\"plimusCreditCardSecurityCode\"]")
    public WebElement securityCode;

    @FindBy(how = How.XPATH, using = "//*[@id=\"checkoutButton\"]/span")
    public WebElement payButton;

    @FindBy(how = How.XPATH, using = "//*[@id=\"oldcpIframe\"]")
    public WebElement iframe;

    @FindBy(how = How.XPATH, using = "//*[@id=\"wrap\"]/div/div[2]/div[1]/div[3]/div[2]")
    public WebElement yearly;

    @FindBy(how = How.ID, using = "id3a")
    public WebElement checkBoxStoreMyCard;

    @FindBy(how = How.XPATH, using = "//*[@id=\"plimusFeedback\"]/div/div/ul/li/span")
    public WebElement payMethodError;



}
