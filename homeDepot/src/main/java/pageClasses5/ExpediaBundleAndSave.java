package pageClasses5;

import base.CommonAPI;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import reporting.TestLogger;

public class ExpediaBundleAndSave extends CommonAPI {
    @FindBy(id = "primary-header-package")
    WebElement BundleAndSave;

    @FindBy(id = "package-origin-plp-fh")
    WebElement flyingfrom;

    @FindBy(id = "package-destination-plp-fh")
    WebElement flyingTo;

    @FindBy(xpath = "//*[@id=\"search-button-plp-fh\"]")
    WebElement searchbutton;



    @FindBy(xpath = "//*[@id=\"native-PACKAGES-NT1\"]/div[2]/a")
    WebElement tredeScrolling;



    @FindBy(xpath = "//*[@id=\"native-PACKAGES-NT2\"]/div[2]/a")
    WebElement testImage;

    @FindBy(xpath = "//*[@id=\"header-logo\"]/img")
    WebElement topTitleImage;


    @FindBy(xpath = "//*[@id=\"native-PACKAGES-NT3\"]/div[2]/a")
    WebElement imageInPaidcontent;

    @FindBy(xpath = "//*[@id=\"PACKAGES-header\"]")
    WebElement InspirationforNextTrip;

    @FindBy(xpath = "//*[@id=\"gcw-packages-form-plp-fh\"]/div[2]")
    WebElement aleart;

    @FindBy(xpath = "//*[@id=\"package-tabs\"]/h1")
    WebElement SearchVacationPackages;

    public void seeInspirationforNextTrip(){
        boolean bl = InspirationforNextTrip.isDisplayed();
        System.out.println("Inspiration for next trip is displayed");
    }



    public void getFlightsPage() {
        BundleAndSave.click();
        TestLogger.log(getClass().getSimpleName() + "  " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName())+"-> "+"Verify Tech Button in BundlesAndSave Page");
        driver.navigate().to("https://www.expedia.com/Vacation-Packages");
    }

    public void setFlyingfrom() {
        TestLogger.log(getClass().getSimpleName() + "  " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName())+"-> "+"Verify aleart message in BundlesAndSave Page");
        flyingfrom.sendKeys("New York, NY");
        searchbutton.click();

        boolean al = aleart.isDisplayed();
        System.out.println("aleart is displayed");

    }

    public void image1() {
        TestLogger.log(getClass().getSimpleName() + "  " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName())+"-> "+"Verify IMAGE in BundlesandSave Page");
        boolean img = testImage.isDisplayed();
        Assert.assertTrue(img);
    }

    public void setFlyingTo(String locator) throws Exception {
        TestLogger.log(getClass().getSimpleName() + "  " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName())+"-> "+"Search for"+locator);
        flyingTo.sendKeys(locator, Keys.ENTER);
        Thread.sleep(2000);
    }

    public void tradeScrolclick() {
        TestLogger.log(getClass().getSimpleName() + "  " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName())+"-> "+"Verify vacation deal in BundlesandSave Page");
        boolean selected = tredeScrolling.isDisplayed();
        Assert.assertTrue(selected);
    }

    public void setTopTitleImage() {
        TestLogger.log(getClass().getSimpleName() + "  " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName())+"-> "+"Verify Top IMAGE in BundlesandSave Page");
        boolean titleVideo = topTitleImage.isDisplayed();
        Assert.assertTrue(titleVideo);
    }

    public void seeSearchVacatonPackages() {
        TestLogger.log(getClass().getSimpleName() + "  " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName())+"-> "+"Verify Vacation Packages search in BundlesandSave Page");
//
        String str = SearchVacationPackages.getText();
        System.out.println(str);
        Assert.assertEquals(str, "Search Vacation Packages");
    }

    public void paidContentImage() {
        TestLogger.log(getClass().getSimpleName() + "  " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName())+"-> "+"Verify Content IMAGE in BundlesandSave Page");
        boolean paidContent = imageInPaidcontent.isDisplayed();
        Assert.assertTrue(paidContent);
    }

}
