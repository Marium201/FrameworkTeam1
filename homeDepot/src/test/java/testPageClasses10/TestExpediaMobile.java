package testPageClasses10;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pageClasses10.ExpediaMobile;
import pageClasses9.ExpediaDeals;

import java.util.concurrent.TimeUnit;

public class TestExpediaMobile extends CommonAPI {
    String MobileUrl = "https://www.expedia.com/app";
    ExpediaMobile expediaMobile;

    @BeforeClass
    public void initialized() throws Exception{
        driver.get(MobileUrl);
        expediaMobile = PageFactory.initElements(driver,ExpediaMobile.class);
    }

    @AfterMethod
    public void reInit(){
        driver.get(MobileUrl);
    }

    @Test
    public void FlightsPage() throws Exception{
        expediaMobile.getCurrentPageUrl();
        driver.navigate().to(MobileUrl);
    }





    @Test
    public void imageTesting1()throws Exception{
        expediaMobile.image1();
    }



    @Test
    public void tradeScrolTest()throws Exception{
        expediaMobile.tradeScrolclick();
    }
    @Test
    public void testTopTitleImage()throws Exception{
        driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
        expediaMobile.setTopTitleImage();
    }

    @Test
    public void testSeeSearchThingsToDo()throws Exception{
        expediaMobile.seeTodaystravelDeals();
    }

    @Test
    public void testPaidContent()throws Exception{
        expediaMobile.paidContentImage();
    }
    @Test
    public void testTodaysTravelDeals()throws Exception{
        expediaMobile.seeTodaystravelDeals();
    }
    @Test
    public void testTravelconfidently()throws Exception{
        expediaMobile.seeTravelconfidently();
    }
    @Test
    public void testYourWholeTripInOneApp()throws Exception{
        expediaMobile.seeYourWholeTripInOneApp();
    }


}
