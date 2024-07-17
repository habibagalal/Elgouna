package Traveltrade.Forms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class base {


    // Web driver
    public WebDriver driver ;
    // Variables
    public static final  String firstName = "test";
    public static final  String lastName = "Mitch";
    public static final String Email = "testmitchdesigns@gmail.com";

    public static final String Password = "1234";

    public static final String ConfirmPassword = "1234";

    public static final String IATA= "123Id";

    public static final String companyAddress = "22,test street,cario";

    public  static final String jobRole = "tester";

    public static final String postalCode ="12512";

    // Web elements

    public WebElement FirstName;

    public WebElement LastName;

    public WebElement EMAIL;
    public WebElement IATA_NO;

    public WebElement CompanyAddress;

    public WebElement JobROLE;

    public WebElement PASSWORD;

    public WebElement ConfirmPASSWORD;

    public WebElement  Country;

    public WebElement PostalCode;
    public WebElement Signupbtn;

    public WebElement newsLetterCheckbox;

    public base(){
        driver = new ChromeDriver();
        driver.get("https://c2c9cef6.elgouna-dev.pages.dev/travel-trade/");
    }



    public  void  validSignUpTestCase(){
        FirstName = driver.findElement(By.xpath("//input[@name='firstName']"));
        FirstName.sendKeys(firstName);

        LastName = driver.findElement(By.xpath("//input[@name='lastName']"));
        LastName.sendKeys(lastName);

        EMAIL = driver.findElement(By.cssSelector("input[name='email']"));
        EMAIL.sendKeys(Email);

        JobROLE = driver.findElement(By.cssSelector("input[name='job_title']"));
        JobROLE.sendKeys(jobRole);

        IATA_NO = driver.findElement(By.cssSelector("input[name='iata_code']"));
        IATA_NO.sendKeys(IATA);

        CompanyAddress = driver.findElement(By.xpath("//input[@name='company_address']"));
        CompanyAddress.sendKeys(companyAddress);

        PostalCode = driver.findElement(By.xpath("//input[@name='postal_code']"));
        PostalCode.sendKeys(postalCode);

        PASSWORD = driver.findElement(By.xpath("//input[@name='password']"));
        PASSWORD.sendKeys(Password);

        ConfirmPASSWORD = driver.findElement(By.xpath("//input[@name='confirm_password']"));
        ConfirmPASSWORD.sendKeys(ConfirmPassword);

        //Country = driver.findElement(By.cssSelector("select[name='country']"));

        //Select country = new Select(Country);




    }

    public static void main(String[] args) {
        base test  = new base();
        test.validSignUpTestCase();
    }


}
