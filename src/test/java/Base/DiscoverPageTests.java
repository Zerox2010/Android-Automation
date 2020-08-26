package Base;

import Pages.*;
import org.testng.annotations.*;
import utilis.Scroll;

import static org.testng.Assert.assertEquals;

public class DiscoverPageTests extends BaseTests {

    @Test
    public void ClickKidsPage() {
      KidsPage kidsPage = discoveryPage.clickKidsLink();
      assertEquals(kidsPage.getPageTitle(),"Kids");
      kidsPage.backButton();
    }

/*
    @Test
    public void ClickSummerPromotion() {
       SummerAtHomePage summerAtHomePage = discoveryPage.clickSummerPromotion();
       assertEquals(summerAtHomePage.getSummerTitle(), "Summer at Home");
        System.out.println("Page Is : " + summerAtHomePage.getSummerTitle());
       summerAtHomePage.backButton();
    }

    @Test
    public void ClickGlowUpPage(){
       GlowUpPage glowUpPage = discoveryPage.clickGlowUpLink();
        assertEquals(glowUpPage.getPageTitle(), "Glow Up");
        System.out.println("Page Is : " + glowUpPage.getPageTitle());
        glowUpPage.backButton();
    }


    @Test
    public void ClickGamesLink() {
        ToysPage toysPage = discoveryPage.clickGamesLink();
        assertEquals(toysPage.getToysTitle(), "Toys");
        System.out.println("Page Is : " + toysPage.getToysTitle());
        toysPage.backButton();

    }

    @Test
    public void ClickBeautyLink() {
        BeautyPage beautyPage = discoveryPage.clickBeautyPage();
        assertEquals(beautyPage.getBeautyTitle(), "Beauty");
        System.out.println("Page Is : " + beautyPage.getBeautyTitle());
        beautyPage.backButton();
    }

    @Test
    public void ClickElectronicsLink() {
        ElectronicsPage electronicsPage = discoveryPage.clickElectronicsPage();
       assertEquals(electronicsPage.getElectronicsTitle(), "Electronics");
        System.out.println("Page Is : " + electronicsPage.getElectronicsTitle());
        electronicsPage.backButton();
    }
*/

}
