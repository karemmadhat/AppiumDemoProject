import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;

public class PreRef_Dependencis {

    AndroidDriver driver ;

    public final  By checkbox = AppiumBy.id("android:id/checkbox");
    public final  By setting = AppiumBy.androidUIAutomator("new UiSelector().className(\"android.widget.RelativeLayout\").instance(1)");
    public  final  By fieldText =AppiumBy.id("android:id/edittext_container");
    public  final  By ClickButton =AppiumBy.id("android:id/button1");


    public PreRef_Dependencis(AndroidDriver driver)
    {
        this.driver=driver;
    }

    public void ClickCheckBox ()
    {
        driver.findElement(checkbox).click();
    }

    public void ClickSetting ()
    {
        driver.findElement(setting).click();
    }

    public void EnterText(String text)
    {
        driver.findElement(fieldText).sendKeys(text);
    }

    public void ClickOnButton()
    {
        driver.findElement(ClickButton).click();
    }
}
