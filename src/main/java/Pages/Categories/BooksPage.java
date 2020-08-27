package Pages.Categories;

import Pages.Home.DiscoveryPage;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;

public class BooksPage {
    static AppiumDriver<MobileElement> driver;

    private By screenTitle = By.id("com.trycircle.android.qa:id/screenTitle");


    public BooksPage(AppiumDriver<MobileElement> driver) {
        this.driver = driver;
    }

    private void clickLink(String LinkID) {
        driver.findElement(By.id(LinkID)).click();
    }

    public String getPageTitle() {
        return driver.findElement(screenTitle).getText();
    }

    public DiscoveryPage backButton() {
        clickLink("com.trycircle.android.qa:id/btnBack");
        return new DiscoveryPage(driver);
    }
}
