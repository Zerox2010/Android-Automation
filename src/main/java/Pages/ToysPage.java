package Pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;

public class ToysPage {

    static AppiumDriver<MobileElement> driver;

    private By screenTitle = By.id("com.trycircle.android.qa:id/screenTitle");

    public ToysPage(AppiumDriver<MobileElement> driver) {
        this.driver = driver;
    }

    private void clickLink(String LinkID) {
        driver.findElement(By.id(LinkID)).click();
    }

    public String getToysTitle() {
        return driver.findElement(screenTitle).getText();
    }


    public DiscoveryPage backButton() {
        clickLink("com.trycircle.android.qa:id/btnBack");
        return new DiscoveryPage(driver);
    }

}
