import Pages.LoginPage;
import Pages.ShopPage;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class LoginTest {
    WebDriver driver = new ChromeDriver();

    @Test

    public void loginToSauceDemo() {
        driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com/");
        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
        new LoginPage(driver).login("standard_user", "secret_sauce");
        Assertions.assertTrue(new ShopPage(driver).isShopPage());
        driver.quit();

    }

}
