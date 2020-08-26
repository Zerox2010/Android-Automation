package Pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;
import utilis.Scroll;

import java.util.List;


public class DiscoveryPage {


    static AppiumDriver<MobileElement> driver;

    private By btnMore = By.id("com.trycircle.android.qa:id/btn_more");
    private By summerAtHomeTxt = By.name("Summer at Home");
    private By summerAtHomeID = By.id("com.trycircle.android.qa:id/tv_promotion_title");

    public DiscoveryPage(AppiumDriver<MobileElement> driver) {
        this.driver = driver;
    }


    private void clickLinkByID(String LinkID) {
        driver.findElement(By.id(LinkID)).click();
    }
    private void clickLinkByTxt (String TXT) {
        driver.findElement(By.name(TXT)).click();
    }

    public KidsPage clickKidsLink() {
        Scroll scroll = new Scroll(driver);
        scroll.newSwipeHotizintal("Kids");
       // clickLinkByID("com.trycircle.android.qa:id/imgCatIcon");

        return new KidsPage(driver);
    }

    public SummerAtHomePage clickSummerPromotion() {
        Scroll scroll = new Scroll(driver);
        scroll.swipeToElement("Summer at Home");
       // clickLinkByID("com.trycircle.android.qa:id/tv_promotion_title");
        clickLinkByID("com.trycircle.android.qa:id/btn_more");
        return new SummerAtHomePage(driver);
    }

    public GlowUpPage clickGlowUpLink() {
        Scroll scroll = new Scroll(driver);
        scroll.swipeToElement("Glow Up");
        // clickLinkByID("com.trycircle.android.qa:id/tv_promotion_title");
        clickLinkByID("com.trycircle.android.qa:id/btn_more");
        return new GlowUpPage(driver);
    }

    public ProfilePage clickProfileLink() {
        clickLinkByID("com.trycircle.android.qa:id/profile");
        return new ProfilePage(driver);
    }

    public ToysPage clickGamesLink() {
        Scroll scroll = new Scroll(driver);
        scroll.swipeToElement("Games");
        return new ToysPage(driver);
    }

    public BeautyPage clickBeautyPage() {
        Scroll scroll = new Scroll(driver);
        scroll.swipeToElement("Beauty");
        return new BeautyPage(driver);
    }

    public ElectronicsPage clickElectronicsPage() {
        Scroll scroll = new Scroll(driver);
        scroll.swipeToElement("Electronics");
        return new ElectronicsPage(driver);
    }

/*
    public List<MobileElement> homeItems() {
        List<MobileElement> elements = driver.findElementById("com.trycircle.android.qa:id/img_banner").findElements(By.className("android.widget.ImageView"));
        return elements;
    }
*/
}


