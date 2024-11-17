package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

public class TopMenuTest extends BaseTest {
    String baseUrl = "https://demowebshop.tricentis.com/";

    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }

    //user Should Navigate To Computer Page Successfully
    @Test
    public void userShouldNavigateToComputerPageSuccessfully() {
        //click on computer link
        driver.findElement(By.xpath("//div[@class='header-menu']/ul[@class='top-menu']/li[2]/a")).click();

        //Verify the text ‘Computers’
        String expectedText = "Computers";
        String actualText = driver.findElement(By.xpath("//h1")).getText();
        Assert.assertEquals("Computer text is not displayed", expectedText, actualText);
    }

    //user Should Navigate To Electronics Page Successfully
    @Test
    public void userShouldNavigateToElectronicsPageSuccessfully() {
        //click on electronics tab
        driver.findElement(By.xpath("//div[@class='header-menu']/ul[1]/li[3]/a")).click();

        //Verify the text ‘Computers’
        String expectedText = "Electronics";
        String actualText = driver.findElement(By.xpath("//h1")).getText();
        Assert.assertEquals("Electronics text is not displayed", expectedText, actualText);
    }


    //user Should Navigate To Apparel And Shoes Page Successfully
    @Test
    public void userShouldNavigateToApparelAndShoesPageSuccessfully() {
        //click on the ‘APPAREL & SHOES’ Tab
        driver.findElement(By.xpath("//div[@class='header-menu']/ul[1]/li[4]/a")).click();

        //Verify the text ‘Apparel & Shoes’
        String exptectedText = "Apparel & Shoes";
        String actualText = driver.findElement(By.xpath("//h1")).getText();
        Assert.assertEquals("Apparel & Shoes is not displayed", exptectedText, actualText);
    }

    //user Should Navigate To Digital Downloads Page Successfully
    @Test
    public void userShouldNavigateToDigitalDownloadsPageSuccessfully() {
        //click on the ‘DIGITAL DOWNLOADS’ Tab
        driver.findElement(By.xpath("//div[@class='header-menu']/ul[1]/li[5]/a")).click();

        //Verify the text ‘Digital downloads’
        String expectedText = "Digital downloads";
        String actualText = driver.findElement(By.xpath("//h1")).getText();
        Assert.assertEquals("Digital downloads text is not display", expectedText, actualText);
    }

    //user Should Navigate To Books Page Successfully
    @Test
    public void userShouldNavigateToBooksPageSuccessfully() {
        //click on the ‘BOOKS’ Tab
        driver.findElement(By.xpath("//div[@class='header-menu']/ul[1]/li[1]/a")).click();

        //
        String expectedText = "Books";
        String actualText = driver.findElement(By.xpath("//h1")).getText();
        Assert.assertEquals("Books text is not displayed", expectedText, actualText);
    }

    //user Should Navigate To Jewelry Page Successfully
    @Test
    public void userShouldNavigateToJewelryPageSuccessfully() {
        //click on the ‘JEWELRY’ Tab
        driver.findElement(By.xpath("//div[@class='header-menu']/ul[1]/li[6]/a")).click();

        //Verify the text ‘Jewelry’
        String expectedText = "Jewelry";
        String actualText = driver.findElement(By.xpath("//h1")).getText();
        Assert.assertEquals("Jewelry text is not displayed", expectedText, actualText);
    }

    //user Should Navigate To Gift Cards Page Successfully
    @Test
    public void userShouldNavigateToGiftCardsPageSuccessfully() {
        //click on the ‘GIFT CARDS’ Tab
        driver.findElement(By.xpath("//div[@class='header-menu']/ul[1]/li[7]/a")).click();

        //Verify the text ‘Jewelry’
        String expectedText = "Gift Cards";
        String actualText = driver.findElement(By.xpath("//h1")).getText();
        Assert.assertEquals("Gift Cards text is not displayed", expectedText, actualText);
    }


    @After
    public void tearDown() {
        closeBrowser();
    }

}
