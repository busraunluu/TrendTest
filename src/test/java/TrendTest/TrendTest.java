package TrendTest;

import Pages.TrendPage;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import utilities.ConfigReader;
import utilities.Driver;

public class TrendTest {

    private String User;

    @Test
    public void test() throws InterruptedException {
        TrendPage trendPage=new TrendPage();
        //TrendPage i kullanabilmek için obje olarak tanımlıyoruz.

        Driver.getDriver().get(ConfigReader.getProperty("trendURL"));
        //Siteyi belirlenen tarayıcıyı kullanarak açar.

        Thread.sleep(1000);
        //tıklamayı görmesi için 1 saniyelik zaman atıyoruz.

        TrendPage.cookies.click();
        //Sayfada çıkan çerezleri kabul etmeden devam eder.

        Thread.sleep(1000);
        TrendPage.searchBox.sendKeys("Kahvaltı tabağı",Keys.ENTER);
        //Sitede arama kutusuna "Kahvaltı tabağı" yazar ve aratır.

        Thread.sleep(1000);
        TrendPage.favorite.click();
        //Üstte cıkan ilk ürün icin favori tusu tıklanır

        Thread.sleep(1000);
        TrendPage.email.sendKeys(ConfigReader.getProperty("User"));
        TrendPage.password.sendKeys(ConfigReader.getProperty("Password"));
        TrendPage.loginButton.click();
        //Gerçek kullanıcı girişi yapar ve login olur.

        Thread.sleep(1000);
        TrendPage.favoriteButton.click();
        //Favorilerim alanına tıklanır

        Thread.sleep(1000);
        TrendPage.basketButton.click();
        //Favoride bulunan ürünü sepete ekler

        Thread.sleep(1000);
        TrendPage.cart.click();
        //Sepetim butonuna tıklar

        TrendPage.confirmCart.click();
        //sepeti onayla butonuna tıklar

        TrendPage.passButton.click();
        //Teklifi kabul etmeden geçer ve ödeme sayfasına ilerler.

    }
}
