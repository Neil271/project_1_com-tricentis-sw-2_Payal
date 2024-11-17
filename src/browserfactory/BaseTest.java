package browserfactory;
/**
 * BaseUrl = https://demowebshop.tricentis.com/
 * 1. Create the package ‘browserfactory’ and create the
 * class with the name ‘BaseTest’ inside the
 * ‘browserfactory’ package. And write the browser setup
 * code inside the class ‘BaseTest’.
 * 2. Create the package ‘testsuite’ and create the
 * following classes inside the ‘testsuite’ package.
 *
 * 1. LoginTest
 * 2. TopMenuTest
 * 3. RegisterTest
 *
 * 3. Write down the following test in the ‘LoginTest’ class
 * 1. userShouldNavigateToLoginPageSuccessfully()
 *
 * * click on the ‘Login’ link
 * * Verify the text ‘Welcome, Please Sign
 * In!’
 *
 * 2. userShouldLoginSuccessfullyWithValidCredentials()
 *
 * * click on the ‘Login’ link
 * * Enter a valid username
 * * Enter a valid password
 * * Click on the ‘Login’ button
 * * Verify the ‘Welcome to our store’
 * text is displayed
 * 3. verifyTheErrorMessage()
 *
 * * click on the ‘Login’ link
 * * Enter the invalid username
 * * Enter the invalid password
 * * Click on the ‘Login’ button
 * * Verify the error message ‘Login was unsuccessful.
 * Please correct the errors and try again. No customer account found’
 *
 * 4. Write down the following test in the ‘TopMenuTest’
 * class
 * 1. userShouldNavigateToComputerPageSuccessfully()
 *
 * * click on the ‘COMPUTERS’ Tab
 * * Verify the text ‘Computers’
 *
 * 2. userShouldNavigateToElectronicsPageSuccessfully()
 *
 * * click on the ‘ELECTRONICS’ Tab
 * * Verify the text ‘Electronics’
 * 3. userShouldNavigateToApparelAndShoesPage
 * Successfully()
 * * click on the ‘APPAREL & SHOES’ Tab
 * * Verify the text ‘Apparel & Shoes’
 *
 * 4.
 * userShouldNavigateToDigitalDownloadsPageSuccessfully()
 * * click on the ‘DIGITAL DOWNLOADS’ Tab
 * * Verify the text ‘Digital downloads’
 * 5. userShouldNavigateToBooksPageSuccessfully()
 *
 * * click on the ‘BOOKS’ Tab
 * * Verify the text ‘Books’
 *
 * 6. userShouldNavigateToJewelryPageSuccessfully()
 *
 * * click on the ‘JEWELRY’ Tab
 * * Verify the text ‘Jewelry’
 *
 * 7. userShouldNavigateToGiftCardsPageSuccessfully()
 *
 * * click on the ‘GIFT CARDS’ Tab
 * * Verify the text ‘Gift Cards’
 *
 * 5. Write down the following test in the ‘RegisterTest’
 * class
 * 1. userShouldNavigateToRegisterPageSuccessfully()
 *
 * * click on the ‘Register’ link
 * * Verify the text ‘Register’
 * 2. userSholdRegisterAccountSuccessfully
 * * click on the ‘Register’ link
 * * Select the gender radio button
 * * Enter the First name
 *
 * * Enter the Last name
 * * Enter Email address
 * * Enter Password
 * * Enter Confirm password
 * * Click on the ‘Register’ button
 *
 * * Verify the text 'Your registration completed’
 */

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class BaseTest {

    public static WebDriver driver;

    public void openBrowser(String baseUrl){
        driver=new ChromeDriver();
        driver.get(baseUrl);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
    }

    public void closeBrowser(){
        driver.quit();
    }
}
