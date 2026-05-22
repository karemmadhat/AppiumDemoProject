import com.google.common.collect.ImmutableMap;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.remote.RemoteWebElement;

public class ExpandableListCustemer {
    AndroidDriver driver ;
    public final By peopleName = AppiumBy.accessibilityId("new UiSelector().text(\"2. Cursor (People)\")");

    public    ExpandableListCustemer (AndroidDriver driver)
    {
        this.driver= driver;
    }

    public void  longPres()
    {
        // Java
        ((JavascriptExecutor) driver).executeScript("mobile: longClickGesture", ImmutableMap.of(
                "elementId", ((RemoteWebElement) driver.findElements(peopleName)).getId()
        ));
    }
}
