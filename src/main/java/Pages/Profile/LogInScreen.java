package Pages.Profile;

import Pages.Home.DiscoveryPage;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;

public class LogInScreen {
    static AppiumDriver<MobileElement> driver;
    private By welcomeMsg = By.id("com.trycircle.android.qa:id/tvWelcomeBack");
    private By usernameField = By.id("com.trycircle.android.qa:id/loginEmailEdit");
    private By passwordField = By.id("com.trycircle.android.qa:id/passwordEdit");
    private By loginButton = By.id("com.trycircle.android.qa:id/btnLogin");


    public LogInScreen(AppiumDriver<MobileElement> driver) {
        this.driver = driver;
    }


    public String getWelcomeMsg() {
        return driver.findElement(welcomeMsg).getText();
    }

    public void SetUserEmail(String username){
         driver.findElement(usernameField).sendKeys(username);
    }

    public void SetPassword(String password){
         driver.findElement(passwordField).sendKeys(password);
    }

    public DiscoveryPage clickLoginBtn(){
        driver.findElement(loginButton).click();
        return new DiscoveryPage(driver);
    }


    //com.trycircle.android.qa:id/llAlertBackground
    //Bad credentials
    //com.trycircle.android.qa:id/tvText
    //List<WebElement> elements = driver.findElementById("recycler_view_catalog_fragment").findElements(By.className("android.widget.RelativeLayout"));
}