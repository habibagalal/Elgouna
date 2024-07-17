package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    private WebDriver driver ;
    private static final  String firstName = "test";
    private static final  String lastName = "Mitch";
    private static final String Email = "testmitchdesigns@gmail.com";

    private static final String Password = "1234";

    private static final String ConfirmPassword = "1234";

    private static final String IATA= "123Id";

    private static final String companyAddress = "22,test street,cario";

    private  static final String jobRole = "tester";

    private static final String postalCode ="12512";

    // Web elements

    private WebElement FirstName;

    private WebElement LastName;

    private WebElement EMAIL;
    private WebElement IATA_NO;

    private WebElement CompanyAddress;

    private WebElement JobROLE;

    private WebElement PASSWORD;

    private WebElement ConfirmPASSWORD;

    private WebElement  Country;

    private WebElement PostalCode;
    private WebElement Signupbtn;





    public Main(){

        driver = new ChromeDriver();
        driver.get("https://c2c9cef6.elgouna-dev.pages.dev/travel-trade/sign-up-form");
    }

    public  void  signup(){
        FirstName = driver.findElement(By.xpath("//input[@name='firstName']"));
        FirstName.sendKeys(firstName);
        LastName = driver.findElement(By.xpath("//input[@name='lastName']"));
        LastName.sendKeys(lastName);

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




    }
    public static void main(String[] args) {
        Main test = new Main();
        test.signup();


    }





}