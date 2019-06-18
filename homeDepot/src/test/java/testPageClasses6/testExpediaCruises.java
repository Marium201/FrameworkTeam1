package testPageClasses6;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pageClasses2.ExpediaFlights;
import pageClasses6.ExpediaCruises;

import java.util.concurrent.TimeUnit;

public class testExpediaCruises extends CommonAPI {

    String flightsUrl = "https://www.expedia.com/Cruises";
    ExpediaCruises expediaCruisesPage;

    @BeforeClass
    public void initialized() throws Exception{
        driver.get(flightsUrl);
        expediaCruisesPage = PageFactory.initElements(driver,ExpediaCruises.class);
    }

    @AfterMethod
    public void reInit(){
        driver.get(flightsUrl);
    }


    @Test
    public void imageTesting1()throws Exception{
        expediaCruisesPage.image1();
    }



    @Test
    public void tradeScrolTest()throws Exception{
        expediaCruisesPage.tradeScrolclick();
    }
    @Test
    public void testTopTitleImage()throws Exception{
        driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
        expediaCruisesPage.setTopTitleImage();
    }

    @Test
    public void testSeeflightsSearch()throws Exception{
        expediaCruisesPage.seeflightsSearch();
    }

    @Test
    public void testPaidContent()throws Exception{
        expediaCruisesPage.paidContentImage();
    }
    @Test
    public void testInspiration()throws Exception{
        expediaCruisesPage.seeInspirationforNextTrip();
    }

}
