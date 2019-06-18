package pageClasses;

import base.CommonAPI;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

public class SearchPage extends CommonAPI {

    public static JavascriptExecutor js;

    @FindBy(id = "header-account-menu")
    public static WebElement Account;

    @FindBy(id ="account-register")
    public static WebElement CreateAnAccount;

    @FindBy(id = "account-signin")
    public static WebElement SignIn;

    @FindBy(id = "gss-signin-submit")
    public static WebElement SignInSubmit;

    @FindBy(id="gss-signup-first-name")
    public static WebElement FirstName;

    @FindBy(id = "gss-signup-last-name")
    public static WebElement LastName;

    @FindBy(id ="gss-signup-email")
    public static WebElement emailAddress;

    @FindBy(id ="gss-signup-password")
    public static WebElement password;

    @FindBy(id ="gss-signup-submit")
    public static WebElement SignUp;

    @FindBy(id = "gss-go-to-forgot-password")
    public static WebElement forgotPassword;


    @FindBy(id = "region_1_link_0")
    public static WebElement BaliLink;



    @FindBy(id = "header-history-sm")
    public static WebElement headerHistory;

    @FindBy(id = "tab-flight-tab-flp")
    public static WebElement flightTab;

    @FindBy(id="flight-origin-flp")
    public static WebElement originCity;

    @FindBy(id="flight-destination-flp")
    public static WebElement destinationCity;

    @FindBy(id="flight-departing-flp")
    public static WebElement departureDate;

    @FindBy(id = "flight-returning-flp")
    public static WebElement returnDate;

    @FindBy(id= "flight-type-roundtrip-label-flp")
    public static WebElement roundTrip;

    @FindBy(id = "flight-type-multi-dest-label-flp")
    public static WebElement multiCity;

    @FindBy(id = "flight-2-origin-hp-flight")
    public static WebElement flyingfrom;

    @FindBy(id = "flight-2-destination-hp-flight")
    public static WebElement flyingTo;

    @FindBy(id = "fflight-2-departing-hp-flight")
    public static WebElement departing;



    @FindBy(className = "btn-primary btn-action gcw-submit")
    public static WebElement searchButton;

    @FindBy(id = "flight-type-one-way-label-flp")
    public static WebElement oneWayTab;

    @FindBy(id = "flight-advanced-options-hp-flight")
    public static WebElement advancedOption;

    @FindBy(id = "advanced-flight-nonstop-hp-flight")
    public static WebElement nonStop;

    @FindBy(id = "advanced-flight-refundable-label-hp-flight")
    public static WebElement refundable;

    @FindBy(xpath = "//*[@id=\"flight-advanced-preferred-airline-hp-flight\"]/option[3]")
    public static WebElement advancedPreferredAirline;

    @FindBy(xpath = "//*[@id=\"flight-advanced-preferred-class-hp-flight\"]/option[2]")
    public static WebElement advancedPreferredClass;

    @FindBy(id = "flight-add-hotel-checkbox-hp-flight")
    public static WebElement addHotel;

    @FindBy(xpath = "//*[@id=\"site-footer-wrap\"]/div[6]")
    public static WebElement pageFooter;

    @FindBy(xpath = "//div[@id='xmlinputtextarea']/textarea[@class='xmlinputtextarea']")
    public static WebElement pageLogo;

    @FindBy(id = "flight-hotel-checkin-hp-flight")
    public static WebElement checkin;

    @FindBy(id = "flight-hotel-checkout-hp-flight")
    public static WebElement checkout;

    //hotels

    @FindBy(id = "tab-hotel-tab-hp")
    public static WebElement hotels;

    @FindBy(id = "hotel-destination-hp-hotel")
    public static WebElement hotelsDestination;

    @FindBy(id = "hotel-checkin-hp-hotel")
    public static WebElement hotelsCheckIn;

    @FindBy(id = "hotel-checkout-hp-hotel")
    public static WebElement hotelsCheckOut;

    @FindBy(xpath = "//*[@id=\"traveler-selector-hp-hotel\"]/div/ul/li/button")
    public static WebElement travelers;

    @FindBy(xpath = "//*[@id=\"traveler-selector-hp-hotel\"]/div/ul/li/div/div/div[1]/div[2]/div[4]/button")
    public static WebElement travelers2;

    @FindBy(xpath="//*[@id=\"traveler-selector-hp-hotel\"]/div/ul/li/div/footer/div/div[2]/button")
    public static WebElement travelersClose;




    @FindBy(id = "tab-package-tab-hp")
    public static WebElement BundleandSave;

    @FindBy(id = "tab-vacation-rental-tab-hp")
    public static WebElement cars;

    @FindBy(id = "tab-cruise-tab-hp")
    public static WebElement cruises;

    @FindBy(id = "tab-activity-tab-hp")
    public static WebElement thingsToDo;

    @FindBy(id = "tab-vacation-rental-tab-hp")
    public static WebElement vacationRental;

    //11 tags start here, yellow marked line in the upper part of expedia
    //Flights
    //Hotels
    //Bundle and Save
    //Cars
    //Cruises
    //Things to Do
    //Vacation Rentals
    //Deals
    //Mobile

    @FindBy(id = "tab-package-tab-hp")
    public static WebElement MyLists;

    @FindBy(id = "tab-package-tab-hp")
    public static WebElement MyTripYL;
    @FindBy(id = "tab-package-tab-hp")
    public static WebElement HotelsInYellowLine;
    @FindBy(id = "tab-package-tab-hp")
    public static WebElement FlightsYL;
    @FindBy(id = "tab-package-tab-hp")
    public static WebElement BundleandSaveYL;
    @FindBy(id = "tab-package-tab-hp")
    public static WebElement CarsYL;
    @FindBy(id = "tab-package-tab-hp")
    public static WebElement CruisesYL;
    @FindBy(id = "tab-package-tab-hp")
    public static WebElement ThingsToDoYL;
    @FindBy(id = "tab-package-tab-hp")
    public static WebElement VacationRentalsYL;
    @FindBy(id = "tab-package-tab-hp")
    public static WebElement DealsYL;
    @FindBy(id = "tab-package-tab-hp")
    public static WebElement MobileYL;

    public static void clickMyTripYL(){
        MyTripYL.click();
    }
    public static void clickMyLists(){
        MyLists.click();
    }public static void clickHotelsInYL(){
        HotelsInYellowLine.click();
    }public static void clickFlightsYL(){
        FlightsYL.click();
    }public static void clickBundleandSaveYL(){
        BundleandSaveYL.click();
    }public static void clickCarsYL(){
        CarsYL.click();
    }public static void clickCruisesYL(){
        CruisesYL.click();
    }public static void clickThingsToDoYL(){
        ThingsToDoYL.click();
    }public static void clickVacationRentalsYL(){
        VacationRentalsYL.click();
    }public static void clickDealsYL(){
        DealsYL.click();
    }public static void clickMoblieYL(){
        MobileYL.click();
    }







    public static void addahotel(){
        addHotel.click();

    }

    public static void hotelcheckin(String date){
        checkin.sendKeys(date);

    }
    public static void hotelcheckout(String date){
        checkout.sendKeys(date);
    }

    public static void displayPageLogo(){
        if(pageLogo.isDisplayed()){
            System.out.println("Expedia Page logo is Displayed");
        }
        String text = pageLogo.getText();
        System.out.println("Text of the Logo"+text);
    }

    public static void displayPageFooter(){
        if(pageFooter.isDisplayed()){
            System.out.println("Expedia Page footer is Displayed");
        }

    }



    public static void clickRoundTrip(){
        roundTrip.click();
    }
    public static void clickMulticity(){
        multiCity.click();
    }
    public static void clickSearchButton(){
        searchButton.click();
    }
    public static void clickOneWayTab(){
        oneWayTab.click();
    }

    public static void setFlyingfrom(String name){
        flyingfrom.sendKeys(name);
    }

    public static void setFlyingTo(String name){
        flyingTo.sendKeys(name);
    }
    public static void setDeparting(String date){
        departing.sendKeys(date);
    }



    public static void clickFlightTab(){
        headerHistory.click();
        flightTab.click();
    }
    public static void setOriginCity(String origin){
        originCity.sendKeys(origin);
    }
    public static void setDestinationCity(String destination){
        destinationCity.sendKeys(destination);
    }
    public static void setDepartureDate(String date){
        departureDate.sendKeys(date);
    }
    public static void setReturnDate(String date){
        returnDate.sendKeys(date);
    }

    public static void clickAdvancedOption(){
        advancedOption.click();
    }

    public static void clickNonstop(){
        nonStop.click();
    }
    public static void clickRefundable(){
        refundable.click();
    }

    public static void clickAccount(){
        Account.click();
    }
    public static void clickCreatanAccount(){
        CreateAnAccount.click();
    }

    public static void setFirstName(String firstName){
        FirstName.sendKeys(firstName);
    }
    public static void setLastName(String lastName){
        LastName.sendKeys(lastName);
    }
    public static void setEmailAddress(String email){
        emailAddress.sendKeys(email);
    }
    public static void setPassword(String pass){
        password.sendKeys(pass);
    }
    public static void setSignUp(){
        SignUp.click();
    }
    public static void clickSignin(){
        SignIn.click();
    }
    public static void clickSigninSubmit(){
        SignInSubmit.click();
    }
    public static void clickadvancedPreferredAirline()throws InterruptedException{
        Select sel = new Select(advancedPreferredAirline);


            sleepFor(5);

        System.out.println("Select Adria Airways by value ");

        sel.selectByValue("JP"); //we select here Adria Airways
    }
    public static void clickadvancedPreferredClass() throws InterruptedException{
        Select sel = new Select(advancedPreferredClass);

        sleepFor(5);
        System.out.println("Select business class by visibleText");

        sel.selectByVisibleText("Business"); //we select here Business class

    }

    public static String returnBali() {

        BaliLink.click();
        System.out.println("Title of the page: " + driver.getTitle());
        driver.navigate().back();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        String title = driver.getTitle();
        System.out.println("Title of the page: " + title);
        return title;
    }

    public void clickhotels(){
        hotels.click();
    }
    public void setHotelsCheckIn( String date){
        hotelsCheckIn.sendKeys(date);
    }
    public void setHotelsCheckOut(String date){
        hotelsCheckOut.sendKeys(date);
    }
    public void setHotelsDestination(String name){
        hotelsDestination.sendKeys(name);
    }

    public static void clickTravelers(){
        Select sel = new Select(travelers);

        sleepFor(5);

        System.out.println("Select 2 travelers, 1 room ");

        Actions action = new Actions(driver);
        action.moveToElement(travelers).perform();

        sleepFor(5);

        action.moveToElement(travelers2).click().perform();

        action.moveToElement(travelersClose).click().perform();

    }



}



