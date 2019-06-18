package pageClasses8;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import reporting.TestLogger;

public class ExpediaVacationRentals extends CommonAPI {

    @FindBy(xpath = "//*[@id=\"hotels-2\"]/div/div/div[5]/div/div[2]/div/div/div/a")
    WebElement tredeScrolling;


    @FindBy(xpath = "//*[@id=\"hotels-2\"]/div/div/div[6]/div/div[2]/div/div/div/a")
    WebElement testImage;


    @FindBy(xpath = "//*[@id=\"hotels-2\"]/div/div/div[4]/div/div[2]/div/div/div/a")
    WebElement imageInPaidcontent;


    @FindBy(id = "//*[@id=\"hotels-1\"]/header/h2")
    WebElement TopVacationRentalsinUSA;

    @FindBy(xpath = "//*[@id=\"header-logo\"]/img")
    WebElement topTitleImage;



    @FindBy(xpath = "//*[@id=\"lite-wizard-form\"]/header/h1")
    WebElement SearchVacationRentals;

    public void tradeScrolclick() {
        TestLogger.log(getClass().getSimpleName() + "  " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName())+"-> "+"Verify Vacation deal in Vacation Rental Page");
        boolean selected = tredeScrolling.isDisplayed();
        Assert.assertTrue(selected);
    }

    public void setTopTitleImage() {
        TestLogger.log(getClass().getSimpleName() + "  " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName())+"-> "+"Verify Top IMAGE in Vacation Rental Page");
        boolean titleVideo = topTitleImage.isDisplayed();
        Assert.assertTrue(titleVideo);
    }

    public void seeSearchVacationRentals() {
        TestLogger.log(getClass().getSimpleName() + "  " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName())+"-> "+"Verify Vacation rentals search in Vacation Rentals Page");
//
        String str = SearchVacationRentals.getText();
        System.out.println(str);
        Assert.assertEquals(str, "Search Vacation Rentals");
    }

    public void paidContentImage() {
        TestLogger.log(getClass().getSimpleName() + "  " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName())+"-> "+"Verify Content IMAGE in Vacation Rental Page");
        boolean paidContent = imageInPaidcontent.isDisplayed();
        Assert.assertTrue(paidContent);
    }
    public void image1() {
        TestLogger.log(getClass().getSimpleName() + "  " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName())+"-> "+"Verify IMAGE in Vacation Rentals Page");
        boolean img = testImage.isDisplayed();
        Assert.assertTrue(img);
    }
    public void seeInspirationforNextTrip(){
        boolean bl = TopVacationRentalsinUSA.isDisplayed();
        System.out.println("Top Vacation Rentals in the United States is displayed");
    }

}
