import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class PerReferansAcitivity {
    AndroidDriver driver;

    public final  By All_ElementRef = AppiumBy.xpath("//android.widget.TextView text[@resource-id=\"android:id/list]");

    public  PerReferansAcitivity(AndroidDriver driver)
    {
        this.driver=driver;
    }

    public void ClickAnyElementsPreRefrans(int index)
    {

        List<WebElement>All_Element_Ref = driver.findElements(All_ElementRef);
        All_Element_Ref.get(index).click();

    }
}
