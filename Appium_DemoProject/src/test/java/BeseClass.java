import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.net.MalformedURLException;
import java.net.URL;

public class BeseClass {
    AndroidDriver driver ;

    @BeforeMethod
    public void Setup() throws MalformedURLException {
        UiAutomator2Options options = new UiAutomator2Options();
        options.setDeviceName("emulator-5554");
        options.setPlatformVersion("16");
        options.setPlatformName("Android");
        options.setAutomationName("UiAutomator2");
        options.setApp("C:\\Users\\Admin\\Downloads\\ApiDemos-release.apk");

         driver= new AndroidDriver(new URL(" http://127.0.0.1:4723/"),options);

    }

    @AfterMethod
    public void quit()
    {
        driver.quit();
    }



}
