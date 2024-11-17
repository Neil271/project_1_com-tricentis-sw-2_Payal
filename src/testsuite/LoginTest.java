package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

public class LoginTest extends BaseTest {
    String baseUrl = "https://demowebshop.tricentis.com/";

    //Open Browser
    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }

    //user Should Navigate To Login Page Successfully
    @Test
    public void userShouldNavigateToLoginPageSuccessfully() {
        //click on login link
        driver.findElement(By.linkText("Log in")).click();

        //Verify the text ‘Welcome, Please Sign In!’
        String expectedWelcomeText = "Welcome, Please Sign In!";
        String actualWelcomeText = driver.findElement(By.xpath("//h1")).getText();
        Assert.assertEquals("Welcome Message is not displayed", expectedWelcomeText, actualWelcomeText);

    }

    //user Should Login Successfully With Valid Credentials
    @Test
    public void userShouldLoginSuccessfullyWithValidCredentials() {
        //click on login link
        driver.findElement(By.linkText("Log in")).click();

        //enter valid username and password in to Email and Password field.
        driver.findElement(By.id("Email")).sendKeys("Payalp123@gmail.com");
        driver.findElement(By.id("Password")).sendKeys("Payal123");

        //click on login button
        driver.findElement(By.xpath("//div[@class='buttons']/input[@value='Log in']")).click();

        //Verify the ‘Welcome to our store’ text is displayed
        String expectedLoggedInText = "Welcome to our store";
        String actualLoggedInText = driver.findElement(By.xpath("//div[@class='page-body']/div[2]//h2")).getText();
        Assert.assertEquals("content header is not displayed", expectedLoggedInText, actualLoggedInText);
    }

    //verify The Error Message
    @Test
    public void verifyTheErrorMessage() {
        //click on login link
        driver.findElement(By.linkText("Log in")).click();

        // //enter Invalid username and password in to Email and Password field.
        driver.findElement(By.id("Email")).sendKeys("xyz5677@gmail.com");
        driver.findElement(By.id("Password")).sendKeys("Xyz123");

        //click on login button
        driver.findElement(By.xpath("//div[@class='buttons']/input[@value='Log in']")).click();

        //Verify the error message
        String expectedErrorMessage = "Login was unsuccessful. Please correct the errors and try again.\n" +
                "No customer account found";
        String actualErrorMessage = driver.findElement(By.xpath("//div[@class='validation-summary-errors']")).getText();
        Assert.assertEquals("Error Message is not displayed", expectedErrorMessage, actualErrorMessage);
    }



    //close Browser
    @After
    public void tearDown() {
        closeBrowser();
    }
}
