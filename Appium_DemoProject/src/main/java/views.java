import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class views {

    AndroidDriver driver;
    public final By AllElmentVeis = AppiumBy.xpath("//android.widget.TextView[@resource-id=\"android:id/text1\"]");

    public views(AndroidDriver driver) {
        this.driver = driver;
    }

    public void ClickOnElementViews(int index)
    {
        List<WebElement> All_views =driver.findElements(AllElmentVeis);
        All_views.get(index).click();
    }
}
