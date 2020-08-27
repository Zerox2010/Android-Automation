package utilis;

import Pages.Home.DiscoveryPage;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;

public class CommonVariables {

    static AppiumDriver<MobileElement> driver;

    private By screenTitle = By.id("com.trycircle.android.qa:id/screenTitle");


    public CommonVariables(AppiumDriver<MobileElement> driver) {

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