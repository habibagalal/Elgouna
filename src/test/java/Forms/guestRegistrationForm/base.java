package Forms.guestRegistrationForm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class base {

    // Web driver
    public WebDriver driver;

    // Web elements
    public WebElement firstName;

    private WebElement LastName;

    private WebElement phoneNumber;

    private WebElement emailAddress;

    private WebElement birthDate;
    private WebElement passportID;
    private WebElement nationality;
    private WebElement CheckInDate;
    private WebElement checkOut;
    private WebElement city;
    private WebElement streetAddress;
    private WebElement postalCode;
    private WebElement Country;
    private WebElement paymentMethod;
    private WebElement roomPreferences;
    private WebElement attchedIDs;
    private WebElement signature;
    private WebElement signatureCheckbox;
    private WebElement healthAndHealthCheckBox;
    private WebElement SubmitBtn;
    private WebElement successMessage;

    // Add guests web elements






    // Web variables
    public static final String Fname = "habiba";
    public base(){

        driver = new ChromeDriver();

        driver.get("https://fix-guest-form.elgouna-dev.pages.dev/hotels/ancient-sands/guest-registration-form");

    }



    public void validOneUserSubmission(String X ){
        firstName = driver.findElement(By.xpath("//input[@name='firstName']"));

         firstName.sendKeys(X);

    }

    public static void main(String[] args) {

        base test = new base();

        test.validOneUserSubmission(Fname);

    }
}
