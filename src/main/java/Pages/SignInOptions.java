package Pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;

public class SignInOptions {

    static AppiumDriver<MobileElement> driver;



    public SignInOptions(AppiumDriver<MobileElement> driver) {
        this.driver = driver;
    }


    private void clickLink (String LinkID){
        driver.findElement(By.id(LinkID)).click();
    }



    public LogInScreen clickLoginBtn(){
        clickLink("com.trycircle.android.qa:id/btnLogin");
        return new LogInScreen(driver);
    }
}
