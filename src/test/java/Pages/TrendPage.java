package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class TrendPage {

    public TrendPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy (xpath = "//*[@id='onetrust-reject-all-handler']")
    public static WebElement cookies;

    @FindBy(xpath = "//*[@class='V8wbcUhU']")
    public static WebElement searchBox;

    @FindBy(xpath = "//*[@class='fvrt-btn']")
    public static WebElement favorite;

    @FindBy(xpath = "//*[@id='login-email']")
    public static WebElement email;

    @FindBy(xpath = "//*[@id='login-password-input']")
    public static WebElement password;

    @FindBy(xpath = "//*[@class='q-primary q-fluid q-button-medium q-button submit']")
    public static WebElement loginButton;

    @FindBy(xpath = "//*[@class='i-heart-orange hover-icon']")
    public static WebElement favoriteButton;

    @FindBy(xpath = "//*[@class='basket-button']")
    public static WebElement basketButton;

    @FindBy(xpath = "//*[@class='link account-basket']")
    public static WebElement cart;

    @FindBy(xpath = "//*[@class='ty-link-btn-primary']")
    public static WebElement confirmCart;

    @FindBy(xpath = "//*[@class='ty-button ty-secondary ty-pass-continue-without-add']")
    public static WebElement passButton;

    @FindBy(xpath = "//*[@class='q-primary q-fluid q-button-medium q-button submit']")
    public static WebElement failedLogin;


}
