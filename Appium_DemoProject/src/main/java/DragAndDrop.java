import com.google.common.collect.ImmutableMap;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.remote.RemoteWebElement;

public class DragAndDrop {

    AndroidDriver driver;

    public final By FristCrile = AppiumBy.id("io.appium.android.apis:id/drag_dot_1");
    public final By SeconedCrile = AppiumBy.id("io.appium.android.apis:id/drag_dot_2");

    public  DragAndDrop(AndroidDriver driver)
    {
        this.driver=driver;
    }

    public void DragFrist()
    {
        // Java
        ((JavascriptExecutor) driver).executeScript("mobile: dragGesture", ImmutableMap.of(
                "elementId", ((RemoteWebElement) driver.findElement(FristCrile)).getId(),
                "endX", 100,
                "endY", 100,
                "speed", 500
        ));
    }
}
