package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShopPage {

    WebDriver driver;

    @FindBy(id = "shopping_cart_container")

    WebElement shopCart;

    public ShopPage(WebDriver driver) {

        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public boolean isShopPage() {
        return shopCart.isDisplayed();

    }

}
