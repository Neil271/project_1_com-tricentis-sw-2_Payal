package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

public class RegisterTest extends BaseTest {
    String baseUrl = "https://demowebshop.tricentis.com/";

    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }

    //user Should Navigate To Register Page Successfully
    @Test
    public void userShouldNavigateToRegisterPageSuccessfully() {
        //click on the ‘Register’ link
        driver.findElement(By.linkText("Register")).click();

        //Verify the text ‘Register’
        String expectedText = "Register";
        String actualText = driver.findElement(By.xpath("//h1")).getText();
        Assert.assertEquals("Register text is not displayed", expectedText, actualText);
    }

    @Test
    public void userShouldRegisterAccountSuccessfully() {
        //click on the ‘Register’ link
        driver.findElement(By.linkText("Register")).click();

        //Select the gender radio button
        driver.findElement(By.id("gender-female")).click();

        //Enter the First name
        driver.findElement(By.id("FirstName")).sendKeys("Payal");

        //Enter the Last name
        driver.findElement(By.id("LastName")).sendKeys("Patel");

        //Enter Email address
        driver.findElement(By.id("Email")).sendKeys("PayalPat123456@gmail.com");

        //Enter Password
        driver.findElement(By.id("Password")).sendKeys("Pa123456");

        //Enter Confirm password
        driver.findElement(By.id("ConfirmPassword")).sendKeys("Pa123456");

        //Click on the ‘Register’ button
        driver.findElement(By.id("register-button")).click();

        //Verify the text 'Your registration completed’
        String expectedText= "Your registration completed";
        String actualText=driver.findElement(By.xpath("//div[@class='result']")).getText();
        Assert.assertEquals("Register completed message is not displayed", expectedText,actualText);
    }


    @After
    public void tearDown() {
        closeBrowser();
    }
}
