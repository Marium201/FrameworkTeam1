package testPageClasses5;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pageClasses2.ExpediaFlights;
import pageClasses5.ExpediaBundleAndSave;

import java.util.concurrent.TimeUnit;

public class TestExpediaBundleAndSave extends CommonAPI {
    String vacationUrl = "https://www.expedia.com/Vacation-Packages";
    ExpediaBundleAndSave expediaBundlesandSavePage;

    @BeforeClass
    public void initialized() throws Exception{
        driver.get(vacationUrl);
        expediaBundlesandSavePage = PageFactory.initElements(driver,ExpediaBundleAndSave.class);
    }

    @AfterMethod
    public void reInit(){
        driver.get(vacationUrl);
    }

    @Test
    public void FlightsPage() throws Exception{
        expediaBundlesandSavePage.getFlightsPage();
        driver.navigate().to(vacationUrl);
    }

    @Test
    public void FlyingFrom()throws Exception{
        expediaBundlesandSavePage.setFlyingfrom();
    }

    @Test
    public void FlyingTo()throws Exception{
        expediaBundlesandSavePage.setFlyingTo("Las Vegas, Nevada");
    }




    @Test
    public void imageTesting1()throws Exception{
        expediaBundlesandSavePage.image1();
    }



    @Test
    public void tradeScrolTest()throws Exception{
        expediaBundlesandSavePage.tradeScrolclick();
    }
    @Test
    public void testTopTitleImage()throws Exception{
        driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
        expediaBundlesandSavePage.setTopTitleImage();
    }

    @Test
    public void testSeeflightsSearch()throws Exception{
        expediaBundlesandSavePage.seeSearchVacatonPackages();
    }

    @Test
    public void testPaidContent()throws Exception{
        expediaBundlesandSavePage.paidContentImage();
    }
    @Test
    public void testInspiration()throws Exception{
        expediaBundlesandSavePage.seeInspirationforNextTrip();
    }
}
