package pageClasses7;

import base.CommonAPI;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import reporting.TestLogger;

public class ExpediaThingsToDo extends CommonAPI {

    @FindBy(id = "primary-header-activity")
    WebElement ThingsToDo;

    @FindBy(xpath = "//*[@id=\"gcw-activities-form-alp\"]/div[3]/div/div/div[1]/button")
    WebElement Cross;

    @FindBy(xpath = "//*[@id=\"gcw-activities-form-alp\"]/div[3]/div/div/div[2]")
    WebElement Cross2;

    @FindBy(xpath = "//*[@id=\"gcw-activities-form-alp\"]/div[2]")
    WebElement aleart;



    @FindBy(id = "//*[@id=\"gcw-activities-form-alp\"]/div[5]/label/button")
    WebElement searchbutton;



    @FindBy(xpath = "//*[@id=\"native-ACTIVITIES-NT1\"]/div[2]/a")
    WebElement tredeScrolling;


    @FindBy(xpath = "//*[@id=\"native-ACTIVITIES-NT2\"]/div[2]/a")
    WebElement testImage;


    @FindBy(xpath = "//*[@id=\"native-ACTIVITIES-NT3\"]/div[2]/a")
    WebElement imageInPaidcontent;


    @FindBy(id = "ACTIVITIES-header")
    WebElement InspirationforNextTrip;

    @FindBy(xpath = "//*[@id=\"header-logo\"]/img")
    WebElement topTitleImage;



    @FindBy(xpath = "//*[@id=\"activity-tabs\"]/h1")
    WebElement SearchThingsToDo;

    @FindBy(id = "activity-start-alp")
    WebElement from;

    @FindBy(id = "activity-end-alp")
    WebElement to;

    public void seeInspirationforNextTrip(){
        boolean bl = InspirationforNextTrip.isDisplayed();
        System.out.println("Inspiration for next trip is displayed");
    }
    public void clickCross(){
        Cross.click();
    }
    public void clicksearch(){
        searchbutton.click();
    }
    public void clickCross2(){
        Cross2.click();
    }


    public void getThingsToDoPage() {
        ThingsToDo.click();
        TestLogger.log(getClass().getSimpleName() + "  " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName())+"-> "+"Verify Tech Button in ThingsToDo Page");
        driver.navigate().to("https://www.expedia.com/Activities");
    }

    public void setfromDate() {
        TestLogger.log(getClass().getSimpleName() + "  " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName())+"-> "+"Verify  new url in ThingsToDo Page");
        from.sendKeys("06/30/2019");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        searchbutton.click();

        String acturalUrl=driver.getCurrentUrl();
        String expectedUrl="https://www.expedia.com/things-to-do/search?location=New+York%2C+New+York&latLong=40.75668%2C-73.98647&rid=178293&regionType=MULTICITY&countryCode=US&startDate=06%2F28%2F2019&endDate=06%2F29%2F2019";

        Assert.assertEquals(acturalUrl,expectedUrl);
        System.out.println("new url is displayed");

    }

    public void image1() {
        TestLogger.log(getClass().getSimpleName() + "  " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName())+"-> "+"Verify IMAGE in ThingsToDo Page");
        boolean img = testImage.isDisplayed();
        Assert.assertTrue(img);
    }

    public void setToDate(String locator) throws Exception {
        TestLogger.log(getClass().getSimpleName() + "  " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName())+"-> "+"Search for"+locator);
        to.sendKeys(locator, Keys.ENTER);
        Thread.sleep(2000);
    }

    public void tradeScrolclick() {
        TestLogger.log(getClass().getSimpleName() + "  " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName())+"-> "+"Verify ThingsToDo deal in ThingsToDo Page");
        boolean selected = tredeScrolling.isDisplayed();
        Assert.assertTrue(selected);
    }

    public void setTopTitleImage() {
        TestLogger.log(getClass().getSimpleName() + "  " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName())+"-> "+"Verify Top IMAGE in ThingsToDo Page");
        boolean titleVideo = topTitleImage.isDisplayed();
        Assert.assertTrue(titleVideo);
    }

    public void seeSearchThingsToDo() {
        TestLogger.log(getClass().getSimpleName() + "  " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName())+"-> "+"Verify ThingsToDo search in ThingsToDo Page");
//
        String str = SearchThingsToDo.getText();
        System.out.println(str);
        Assert.assertEquals(str, "Search Things To Do");
    }

    public void paidContentImage() {
        TestLogger.log(getClass().getSimpleName() + "  " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName())+"-> "+"Verify Content IMAGE in ThingsToDo Page");
        boolean paidContent = imageInPaidcontent.isDisplayed();
        Assert.assertTrue(paidContent);
    }

}
