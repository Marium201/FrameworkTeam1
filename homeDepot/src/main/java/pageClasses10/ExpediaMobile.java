package pageClasses10;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import reporting.TestLogger;

public class ExpediaMobile extends CommonAPI {
    @FindBy(xpath = "/html/body/div[2]/div[6]/div/div[2]/div[3]/img")
    WebElement tredeScrolling;


    @FindBy(xpath = "/html/body/div[2]/div[5]/figure/div/div[3]/img")
    WebElement testImage;


    @FindBy(xpath = "/html/body/div[2]/div[6]/div/div[1]/div[3]/img")
    WebElement imageInPaidcontent;


    @FindBy(xpath = "/html/body/div[2]/div[4]/div/div/h2[2]")
    WebElement YourNewTravelCompanion;

    @FindBy(xpath = "/html/body/div[2]/div[2]/figure/div/div[1]/h1")
    WebElement YourWholeTripInOneApp;


    @FindBy(xpath = "//*[@id=\"header-logo\"]/img")
    WebElement topTitleImage;



    @FindBy(xpath = "/html/body/div[2]/div[6]/div/div[3]/div[1]/h2")
    WebElement TravelConfidently;

    public void tradeScrolclick() {
        TestLogger.log(getClass().getSimpleName() + "  " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName())+"-> "+"Verify Mobile in Mobile Page");
        boolean selected = tredeScrolling.isDisplayed();
        Assert.assertTrue(selected);
    }

    public void setTopTitleImage() {
        TestLogger.log(getClass().getSimpleName() + "  " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName())+"-> "+"Verify Top IMAGE in Mobile Page");
        boolean titleVideo = topTitleImage.isDisplayed();
        Assert.assertTrue(titleVideo);
    }

    public void seeTodaystravelDeals() {
        TestLogger.log(getClass().getSimpleName() + "  " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName())+"-> "+"Verify travel Companion search in Mobile Page");
//
        String str = YourNewTravelCompanion.getText();
        System.out.println(str);
        Assert.assertEquals(str, "Your New Travel Companion");
    }

    public void paidContentImage() {
        TestLogger.log(getClass().getSimpleName() + "  " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName())+"-> "+"Verify Content IMAGE in Mobile Page");
        boolean paidContent = imageInPaidcontent.isDisplayed();
        Assert.assertTrue(paidContent);
    }
    public void image1() {
        TestLogger.log(getClass().getSimpleName() + "  " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName())+"-> "+"Verify IMAGE in Mobile Page");
        boolean img = testImage.isDisplayed();
        Assert.assertTrue(img);
    }
    public void seeYourWholeTripInOneApp(){
        boolean bl = YourWholeTripInOneApp.isDisplayed();
        System.out.println("Current Promotions");
    }
    public void seeTravelconfidently(){
        boolean bl = TravelConfidently.isDisplayed();
        System.out.println("TodayTopDeal");
    }

}
