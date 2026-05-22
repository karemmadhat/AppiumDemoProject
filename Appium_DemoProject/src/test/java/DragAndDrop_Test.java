import io.appium.java_client.android.AndroidDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DragAndDrop_Test extends BeseClass {
    HomePage MyHomePage ;
    views MyViews;
    ExpandableList MyExpandableList ;
    DragAndDrop drag;


    @BeforeMethod
    public void preCondition()
    {
        MyHomePage = new HomePage(driver);
        MyHomePage.ClickOnHomePageElement(11);
        MyViews=new views(driver);
        MyViews.ClickOnElementViews(7);
        drag=new DragAndDrop(driver);

    }

    @Test
    public void DragScenario()
    {
        drag.DragFrist();
    }
}
