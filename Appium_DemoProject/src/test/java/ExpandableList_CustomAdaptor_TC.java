import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ExpandableList_CustomAdaptor_TC extends  BeseClass{

    HomePage MyHomePage ;
    views MyViews;
    ExpandableList MyExpandableList ;
    ExpandableListCustemer Customer;

    @BeforeMethod
    public void  percondition_Befor()
    {
        MyHomePage = new HomePage(driver);
        MyHomePage.ClickOnHomePageElement(11);
        MyViews=new views(driver);
        MyViews.ClickOnElementViews(8);
        MyExpandableList=new ExpandableList(driver);
        MyExpandableList.ClickOnExpandablePageElement(0);

        Customer=new ExpandableListCustemer(driver);



    }
    @Test
    public void CheckSampleMenu()
    {
        Customer.longPres();
    }




}
