package pageClasses9;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import reporting.TestLogger;

public class ExpediaDeals extends CommonAPI {

    @FindBy(xpath = "//*[@id=\"dest-card-178294\"]/div[1]")
    WebElement tredeScrolling;


    @FindBy(xpath = "//*[@id=\"destinations\"]/div[21]")
    WebElement testImage;


    @FindBy(xpath = "//*[@id=\"dest-card-553248635205860603\"]/div[1]")
    WebElement imageInPaidcontent;


    @FindBy(xpath = "//*[@id=\"RotatingPromosHeader\"]/h3")
    WebElement TodaysTopDeal;

    @FindBy(xpath = "//*[@id=\"wizardTitle\"]/h1")
    WebElement TodaysTravelDeals;


    @FindBy(xpath = "//*[@id=\"header-logo\"]/img")
    WebElement topTitleImage;



    @FindBy(xpath = "//*[@id=\"siteContent\"]/div[9]/h3")
    WebElement CurrentPromotions;

    public void tradeScrolclick() {
        TestLogger.log(getClass().getSimpleName() + "  " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName())+"-> "+"Verify deal in deals Page");
        boolean selected = tredeScrolling.isDisplayed();
        Assert.assertTrue(selected);
    }

    public void setTopTitleImage() {
        TestLogger.log(getClass().getSimpleName() + "  " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName())+"-> "+"Verify Top IMAGE in deals Page");
        boolean titleVideo = topTitleImage.isDisplayed();
        Assert.assertTrue(titleVideo);
    }

    public void seeTodaystravelDeals() {
        TestLogger.log(getClass().getSimpleName() + "  " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName())+"-> "+"Verify deals search in deals Page");
//
        String str = TodaysTravelDeals.getText();
        System.out.println(str);
        Assert.assertEquals(str, "Today's travel Deals");
    }

    public void paidContentImage() {
        TestLogger.log(getClass().getSimpleName() + "  " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName())+"-> "+"Verify Content IMAGE in deals Page");
        boolean paidContent = imageInPaidcontent.isDisplayed();
        Assert.assertTrue(paidContent);
    }
    public void image1() {
        TestLogger.log(getClass().getSimpleName() + "  " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName())+"-> "+"Verify IMAGE in deals Page");
        boolean img = testImage.isDisplayed();
        Assert.assertTrue(img);
    }
    public void seeCurrentPromotions(){
        boolean bl = CurrentPromotions.isDisplayed();
        System.out.println("Current Promotions");
    }
    public void seeTodaysTopDeal(){
        boolean bl = TodaysTopDeal.isDisplayed();
        System.out.println("TodayTopDeal");
    }

}
