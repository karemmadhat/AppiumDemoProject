import io.appium.java_client.android.AndroidDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PreRef_Dependencis_Test extends  BeseClass{


    HomePage MyHomePage ;
    PerReferansAcitivity Referans;
    PreRef_Dependencis  Dependencis;


    @BeforeMethod
    public void perConditon_BeforeMethod()
    {
        MyHomePage =new HomePage(driver);
        MyHomePage.ClickOnHomePageElement(9);
        Referans =new PerReferansAcitivity(driver);
        Referans.ClickAnyElementsPreRefrans(2);
       // Dependencis =new PreRef_Dependencis(driver);


    }
    @Test
    public void wifiScenario()
    {
      Dependencis =new PreRef_Dependencis(driver);
        Dependencis.ClickCheckBox();
        Dependencis.ClickSetting();
        Dependencis.EnterText("karim");
        Dependencis.ClickOnButton();

    }




}
