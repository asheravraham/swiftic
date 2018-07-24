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
    @FindBy(how = How.XPATH, using = "//*[@id=\"editor\"]/div[6]/div/a")
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



    // need to continue the page elements identification inside the features!
    //after selecting all feature option






}
