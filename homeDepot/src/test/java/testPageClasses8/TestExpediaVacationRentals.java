package testPageClasses8;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pageClasses7.ExpediaThingsToDo;
import pageClasses8.ExpediaVacationRentals;

import java.util.concurrent.TimeUnit;

public class TestExpediaVacationRentals extends CommonAPI {

    String VacationRentalUrl = "https://www.expedia.com/vacation-rentals/";
    ExpediaVacationRentals expediaVacationRentals;

    @BeforeClass
    public void initialized() throws Exception{
        driver.get(VacationRentalUrl);
        expediaVacationRentals = PageFactory.initElements(driver,ExpediaVacationRentals.class);
    }

    @AfterMethod
    public void reInit(){
        driver.get(VacationRentalUrl);
    }

    @Test
    public void FlightsPage() throws Exception{
        expediaVacationRentals.getCurrentPageUrl();
        driver.navigate().to(VacationRentalUrl);
    }





    @Test
    public void imageTesting1()throws Exception{
        expediaVacationRentals.image1();
    }



    @Test
    public void tradeScrolTest()throws Exception{
        expediaVacationRentals.tradeScrolclick();
    }
    @Test
    public void testTopTitleImage()throws Exception{
        driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
        expediaVacationRentals.setTopTitleImage();
    }

    @Test
    public void testSeeSearchThingsToDo()throws Exception{
        expediaVacationRentals.seeSearchVacationRentals();
    }

    @Test
    public void testPaidContent()throws Exception{
        expediaVacationRentals.paidContentImage();
    }
    @Test
    public void testInspiration()throws Exception{
        expediaVacationRentals.seeInspirationforNextTrip();
    }

}
