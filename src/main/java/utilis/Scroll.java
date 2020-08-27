package utilis;

import com.google.common.collect.ImmutableMap;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.remote.RemoteWebElement;

import java.time.Duration;
import java.util.HashMap;
import java.util.Map;

public class Scroll {
    static AppiumDriver<MobileElement> driver;
    private JavascriptExecutor js;
    private HashMap<String, String> scrollObject = new HashMap<>();


    public Scroll(AppiumDriver<MobileElement> driver) {
        this.driver = driver;

    }

    public void androidScrollToAnElementByText(String text) {
        try {
            MobileElement elementToClick = (MobileElement) driver.findElement(MobileBy.AndroidUIAutomator(
                    "new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView("
                                + "new UiSelector().text(\"" + text + "\").instance(0))"));

                    elementToClick.click();
        } catch (Exception e) {
            throw new NoSuchElementException("No element" + e);
        }
    }

    public void swipeToElement(String exactText){

        MobileElement elementToClick = (MobileElement) driver
                .findElement(MobileBy.AndroidUIAutomator(
                        "new UiScrollable("
                                + "new UiSelector().scrollable(true)).scrollIntoView("
                                + "new UiSelector().text(\""+exactText+"\"));"));
        elementToClick.click();

    }

    public void swipeHorizintal(String exact_text){

        MobileElement element = (MobileElement) driver.findElement(MobileBy.AndroidUIAutomator(
                "new UiScrollable("
                        + "new UiSelector().resourceId(\"com.trycircle.android.qa:id/cats_recycler\")).setAsHorizontalList().scrollIntoView("
                        + "new UiSelector().textContains(\""+exact_text+"\"))"));

    }

    public void newSwipeHotizintal(String txt){

        MobileElement element = (MobileElement) driver.findElement(MobileBy.AndroidUIAutomator(
                "new UiScrollable("
                        + "new UiSelector().resourceId(\"com.trycircle.android.qa:id/cats_recycler\")).setAsHorizontalList().scrollIntoView("
                        + "new UiSelector().textContains(\""+txt+"\"))"));


        MobileElement elementToClick = (MobileElement) driver
                .findElement(MobileBy.AndroidUIAutomator(
                        "new UiScrollable("
                                + "new UiSelector().scrollable(true)).scrollIntoView("
                                + "new UiSelector().text(\""+txt+"\"));"));
        elementToClick.click();
    }


    public void swipeLeftAndRight() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        HashMap<String, String> scrollObject = new HashMap<String, String>();
        scrollObject.put("direction", "left");
        js.executeScript("mobile: scroll", scrollObject);

    }


    public void swipeScreen(Direction dir) {
        System.out.println("swipeScreen(): dir: '" + dir + "'"); // always log your actions

        // Animation default time:
        //  - Android: 300 ms
        //  - iOS: 200 ms
        // final value depends on your app and could be greater
        final int ANIMATION_TIME = 300; // ms

        final int PRESS_TIME = 200; // ms

        int edgeBorder = 10; // better avoid edges
        PointOption pointOptionStart, pointOptionEnd;

        // init screen variables
        Dimension dims = driver.manage().window().getSize();

        // init start point = center of screen
        pointOptionStart = PointOption.point(dims.width / 2, dims.height / 2);

        switch (dir) {
            case DOWN: // center of footer
                pointOptionEnd = PointOption.point(dims.width / 2, dims.height - edgeBorder);
                break;
            case UP: // center of header
                pointOptionEnd = PointOption.point(dims.width / 2, edgeBorder);
                break;
            case LEFT: // center of left side
                pointOptionEnd = PointOption.point(edgeBorder, dims.height / 2);
                break;
            case RIGHT: // center of right side
                pointOptionEnd = PointOption.point(dims.width - edgeBorder, dims.height / 2);
                break;
            default:
                throw new IllegalArgumentException("swipeScreen(): dir: '" + dir + "' NOT supported");
        }

        // execute swipe using TouchAction
        try {
            new TouchAction(driver)
                    .press(pointOptionStart)
                    // a bit more reliable when we add small wait
                    .waitAction(WaitOptions.waitOptions(Duration.ofMillis(PRESS_TIME)))
                    .moveTo(pointOptionEnd)
                    .release().perform();
        } catch (Exception e) {
            System.err.println("swipeScreen(): TouchAction FAILED\n" + e.getMessage());
            return;
        }

        // always allow swipe action to complete
        try {
            Thread.sleep(ANIMATION_TIME);
        } catch (InterruptedException e) {
            // ignore
        }
    }

    public enum Direction {
        UP,
        DOWN,
        LEFT,
        RIGHT;
    }
/*
    public static void scrollDowntoID(String TEXT, AppiumDriver driver) {
        ((MobileElement) driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector()"
                + "com.trycircle.android.qa:id/cats_recycler")).getChildByText("" +
                "new UiSelector().className(\"androidx.recyclerview.widget.RecyclerView\"), "+TEXT+"))"));

    }
*/
}