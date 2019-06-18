package testPageClasses7;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pageClasses2.ExpediaFlights;
import pageClasses7.ExpediaThingsToDo;

import java.util.concurrent.TimeUnit;

public class TestExpediaThingsToDo extends CommonAPI {
    String ThingToDoUrl = "https://www.expedia.com/Activities";
    ExpediaThingsToDo expediaThingsToDoPage;

    @BeforeClass
    public void initialized() throws Exception{
        driver.get(ThingToDoUrl);
        expediaThingsToDoPage = PageFactory.initElements(driver,ExpediaThingsToDo.class);
    }

    @AfterMethod
    public void reInit(){
        driver.get(ThingToDoUrl);
    }

    @Test
    public void FlightsPage() throws Exception{
        expediaThingsToDoPage.getThingsToDoPage();
        driver.navigate().to(ThingToDoUrl);
    }

    @Test
    public void FlyingFromDate()throws Exception{
        expediaThingsToDoPage.setToDate("06/28/2019");
    }

    @Test
    public void FlyingToDate()throws Exception{
        expediaThingsToDoPage.setfromDate();
    }


    @Test
    public void testclickCross()throws Exception{
        expediaThingsToDoPage.clickCross();
        expediaThingsToDoPage.setfromDate();
        expediaThingsToDoPage.setToDate("06/30/2019");

        expediaThingsToDoPage.clickCross2();
        expediaThingsToDoPage.clicksearch();

    }



    @Test
    public void imageTesting1()throws Exception{
        expediaThingsToDoPage.image1();
    }



    @Test
    public void tradeScrolTest()throws Exception{
        expediaThingsToDoPage.tradeScrolclick();
    }
    @Test
    public void testTopTitleImage()throws Exception{
        driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
        expediaThingsToDoPage.setTopTitleImage();
    }

    @Test
    public void testSeeSearchThingsToDo()throws Exception{
        expediaThingsToDoPage.seeSearchThingsToDo();
    }

    @Test
    public void testPaidContent()throws Exception{
        expediaThingsToDoPage.paidContentImage();
    }
    @Test
    public void testInspiration()throws Exception{
        expediaThingsToDoPage.seeInspirationforNextTrip();
    }
}
