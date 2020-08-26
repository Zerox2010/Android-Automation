package Base;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.*;
import Pages.*;
import utilis.Scroll;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class BaseTests {


    private DesiredCapabilities caps;
    static AppiumDriver<MobileElement> driver;
    protected DiscoveryPage discoveryPage;
    protected ProfilePage profilePage;
    protected SignInOptions signInOptions;
    protected Scroll scroll;
    protected BeautyPage beautyPage;
    protected ToysPage toysPage;
    protected ElectronicsPage electronicsPage;


    @BeforeTest
    public void setup() {

        try {
            //File file = new File("C:\\Users\\Alaa\\eclipse-workspace\\AndroidAutomation\\File\\circleqc.apk");
            //caps.setCapability("app", "C:\\Users\\Alaa\\eclipse-workspace\\AndroidAutomation\\File\\circleqc.apk");
            caps = new DesiredCapabilities();
            caps.setCapability("platformName", "Android");
            caps.setCapability("platformVersion", "9");
            caps.setCapability("deviceName", "Pixel3");
            caps.setCapability("appPackage", "com.trycircle.android.qa");
            caps.setCapability("appActivity", "com.trycircle.android.presentation.views.splash.SplashActivity");
            caps.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 60);


            URL url = new URL("http://0.0.0.0:4723/wd/hub");
            driver = new AppiumDriver<MobileElement>(url, caps);
            discoveryPage = new DiscoveryPage(driver);
            profilePage = new ProfilePage(driver);
            signInOptions = new SignInOptions(driver);
            scroll = new Scroll(driver);
            beautyPage = new BeautyPage(driver);
            toysPage = new ToysPage(driver);
            electronicsPage = new ElectronicsPage(driver);


            driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);




        } catch (Exception exp) {
            System.out.println("Cause is : " + exp.getCause());
            System.out.println("Message is : " + exp.getMessage());
            exp.printStackTrace();
        }
    }




}