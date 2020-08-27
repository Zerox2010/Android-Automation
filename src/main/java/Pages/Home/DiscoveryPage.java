package Pages.Home;

import Pages.Campaigns.*;
import Pages.Categories.*;
import Pages.Profile.*;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;
import utilis.Scroll;


public class DiscoveryPage {


    static AppiumDriver<MobileElement> driver;


    public DiscoveryPage(AppiumDriver<MobileElement> driver) {
        this.driver = driver;
    }

    // Click Method
    private void clickLinkByID(String LinkID) {
        driver.findElement(By.id(LinkID)).click();
    }

    //Scroll Horizontal And Click Method
    public void scrollHorizontalAndClick(String categoryName){
        Scroll scroll = new Scroll(driver);
        scroll.swipeHorizontal(categoryName);
    }

    //Scroll Vertical And Click Method
    public void scrollVerticalAndClick(String campaignName){
        Scroll scroll = new Scroll(driver);
        scroll.scrollVertical(campaignName);
    }

    // Actions on Categories Links
    public ElectronicsPage clickElectronicsLink() {
        scrollHorizontalAndClick("Electronics");
        return new ElectronicsPage(driver);
    }
    public BooksPage clickBooksLink() {
        scrollHorizontalAndClick("Books");
        return new BooksPage(driver);
    }
    public HomePage clickHomeLink() {
        scrollHorizontalAndClick("Home");
        return new HomePage(driver);
    }
    public ToysPage clickToysLink() {
        scrollHorizontalAndClick("Toys");
        return new ToysPage(driver);
    }
    public PerfumesPage clickPerfumesLink() {
        scrollHorizontalAndClick("Perfumes");
        return new PerfumesPage(driver);
    }
    public PetsPage clickPetsLink() {
        scrollHorizontalAndClick("Pets");
        return new PetsPage(driver);
    }
    public MenPage clickMenLink() {
        scrollHorizontalAndClick("Men");
        return new MenPage(driver);
    }
    public WomenPage clickWomenLink() {
        scrollHorizontalAndClick("Women");
        return new WomenPage(driver);
    }
    public KidsPage clickKidsLink() {
        scrollHorizontalAndClick("Kids");
        return new KidsPage(driver);
    }
    public FlowersPage clickFlowersLink() {
        scrollHorizontalAndClick("Flowers");
        return new FlowersPage(driver);
    }
    public BeautyPage clickBeautyLink() {
        scrollHorizontalAndClick("Beauty");
        return new BeautyPage(driver);
    }


    // Actions on Campaigns Sections
    public SummerAtHomePage clickSummerPromotion() {
        scrollVerticalAndClick("Summer At Home");
        clickLinkByID("com.trycircle.android.qa:id/btn_more");
        return new SummerAtHomePage(driver);
    }

    public GlowUpPage clickGlowUpLink() {
        Scroll scroll = new Scroll(driver);
        scroll.scrollVertical("Glow Up");
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
        scroll.scrollVertical("Games");
        return new ToysPage(driver);
    }

   /* public BeautyPage clickBeautyLink() {
        Scroll scroll = new Scroll(driver);
        scroll.scrollVertical("Beauty");
        return new BeautyPage(driver);
    }


    public List<MobileElement> homeItems() {
        List<MobileElement> elements = driver.findElementById("com.trycircle.android.qa:id/img_banner").findElements(By.className("android.widget.ImageView"));
        return elements;
    }
*/
}


