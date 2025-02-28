package TrendTest;

import Pages.TrendPage;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.ConfigReader;
import utilities.Driver;

public class NegativeTrendTest {
    private String User;
    //This is a wrong test area
    @Test
    public void wrongUser() throws InterruptedException {
        TrendPage trendPage=new TrendPage();

        Driver.getDriver().get(ConfigReader.getProperty("trendURL"));
        TrendPage.cookies.click();

        TrendPage.searchBox.sendKeys("Kahvaltı tabağı",Keys.ENTER);
        TrendPage.favorite.click();

        Thread.sleep(1000);
        TrendPage.email.sendKeys(ConfigReader.getProperty("WrongUser"));
        TrendPage.password.sendKeys(ConfigReader.getProperty("Password"));
        TrendPage.loginButton.click();

        Assert.assertTrue(TrendPage.failedLogin.isDisplayed());
        System.out.println("Giriş başarılı değil");
        Driver.quitDriver();

    }

    @Test
    public void wrongPassword() throws InterruptedException {
        TrendPage trendPage=new TrendPage();

        Driver.getDriver().get(ConfigReader.getProperty("trendURL"));
        TrendPage.cookies.click();

        TrendPage.searchBox.sendKeys("Kahvaltı tabağı",Keys.ENTER);
        TrendPage.favorite.click();

        Thread.sleep(1000);
        TrendPage.email.sendKeys(ConfigReader.getProperty("User"));
        TrendPage.password.sendKeys(ConfigReader.getProperty("WrongPassword"));
        TrendPage.loginButton.click();

        Assert.assertTrue(TrendPage.failedLogin.isDisplayed());
        System.out.println("Giriş başarılı değil");
        Driver.quitDriver();


    }
}
