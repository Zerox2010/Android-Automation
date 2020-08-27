package Base.Categories;

import Base.BaseTests;
import Pages.Categories.*;
import org.testng.annotations.*;

import static org.testng.Assert.assertEquals;

public class CategoriesTests extends BaseTests {


    @Test
    public void ClickElectronicsCategory() {
        ElectronicsPage electronicsPage =  discoveryPage.clickElectronicsLink();
        assertEquals(electronicsPage.getPageTitle(),"Electronics");
        electronicsPage.backButton();
    }

    @Test
    public void ClickBooksCategory() {
        BooksPage booksPage = discoveryPage.clickBooksLink();
        assertEquals(booksPage.getPageTitle(),"Books");
        booksPage.backButton();
    }

    @Test
    public void ClickHomeCategory() {
       HomePage homePage = discoveryPage.clickHomeLink();
       assertEquals(homePage.getPageTitle(), "Home");
       homePage.backButton();
    }

    @Test
    public void ClickToysCategory() {
        ToysPage toysPage = discoveryPage.clickToysLink();
        assertEquals(toysPage.getPageTitle(),"Toys");
        toysPage.backButton();
    }

    @Test
    public void ClickPerfumesCategory() {
        PerfumesPage perfumesPage = discoveryPage.clickPerfumesLink();
        assertEquals(perfumesPage.getPageTitle(),"Perfumes");
        perfumesPage.backButton();
    }

    @Test
    public void ClickPetsCategory() {
        PetsPage petsPage = discoveryPage.clickPetsLink();
        assertEquals(petsPage.getPageTitle(),"Pets");
        petsPage.backButton();
    }

    @Test
    public void ClickMenCategory() {
        MenPage menPage = discoveryPage.clickMenLink();
        assertEquals(menPage.getPageTitle(),"Men");
        menPage.backButton();
    }

    @Test
    public void ClickWomanCategory() {
        WomenPage womenPage = discoveryPage.clickWomenLink();
        assertEquals(womenPage.getPageTitle(),"Women");
        womenPage.backButton();
    }

    @Test
    public void ClickKidsCategory() {
        KidsPage kidsPage = discoveryPage.clickKidsLink();
        assertEquals(kidsPage.getPageTitle(),"Kids");
        kidsPage.backButton();
    }

    @Test
    public void ClickFlowersCategory() {
        FlowersPage flowersPage = discoveryPage.clickFlowersLink();
        assertEquals(flowersPage.getPageTitle(),"Flowers");
        flowersPage.backButton();
    }

    @Test
    public void ClickBeautyCategory() {
        BeautyPage beautyPage = discoveryPage.clickBeautyLink();
        assertEquals(beautyPage.getPageTitle(),"Beauty");
        beautyPage.backButton();
    }

}
