import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class HomePage {

    AndroidDriver driver;


     public final  By All_Element = AppiumBy.xpath("//android.widget.TextView[@resource-id=\"android:id/text1\"]");
     //con
    public HomePage(AndroidDriver driver )
    {
        this.driver=driver;
    }


    public void ClickOnHomePageElement (int index) {
        List<WebElement> AllElements = driver.findElements(All_Element);
        AllElements.get(index).click();

    }




}

