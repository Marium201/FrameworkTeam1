package testPageClasses9;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pageClasses8.ExpediaVacationRentals;
import pageClasses9.ExpediaDeals;

import java.util.concurrent.TimeUnit;

public class TestExpediaDeals extends CommonAPI {

    String DealsUrl = "https://www.expedia.com/Deals";
    ExpediaDeals expediaDeals;

    @BeforeClass
    public void initialized() throws Exception{
        driver.get(DealsUrl);
        expediaDeals = PageFactory.initElements(driver,ExpediaDeals.class);
    }

    @AfterMethod
    public void reInit(){
        driver.get(DealsUrl);
    }

    @Test
    public void FlightsPage() throws Exception{
        expediaDeals.getCurrentPageUrl();
        driver.navigate().to(DealsUrl);
    }





    @Test
    public void imageTesting1()throws Exception{
        expediaDeals.image1();
    }



    @Test
    public void tradeScrolTest()throws Exception{
        expediaDeals.tradeScrolclick();
    }
    @Test
    public void testTopTitleImage()throws Exception{
        driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
        expediaDeals.setTopTitleImage();
    }

    @Test
    public void testSeeSearchThingsToDo()throws Exception{
        expediaDeals.seeTodaysTopDeal();
    }

    @Test
    public void testPaidContent()throws Exception{
        expediaDeals.paidContentImage();
    }
    @Test
    public void testInspiration()throws Exception{
        expediaDeals.seeTodaystravelDeals();
    }
    @Test
    public void testCurrentPromotions()throws Exception{
        expediaDeals.seeCurrentPromotions();
    }

}
