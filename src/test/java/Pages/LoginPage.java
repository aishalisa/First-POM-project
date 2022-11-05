package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    WebDriver driver;

    @FindBy(name = "user-name")

    WebElement userNameInput;

    @FindBy(name = "password")

    WebElement passwordInput;

    @FindBy(name = "login-button")

    WebElement loginButton;

    public LoginPage(WebDriver driver) {

        this.driver = driver;

        PageFactory.initElements(driver, this);

    }

    public void setUserName(String userName) {

        userNameInput.sendKeys(userName);
    }

    public void setPassword(String password) {

        passwordInput.sendKeys(password);
    }

    public void clickLogin() {

        loginButton.click();
    }

    public ShopPage login(String userName, String password) {
        setPassword(password);
        setUserName(userName);
        clickLogin();
        return new ShopPage(driver);
    }

}
