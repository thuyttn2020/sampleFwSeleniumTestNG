package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class LoginTest {
    private WebDriver driver;
    @BeforeClass
    void setUp(){
        driver = new ChromeDriver();
        driver.get("http://the-internet.herokuapp.com/login");

    }

    @Test
    public void tc01_validLogin(){
        WebElement usernameTXT = driver.findElement(By.id("username"));
        usernameTXT.sendKeys("tomsmith");
        WebElement passwordTXT = driver.findElement(By.name("password"));
        passwordTXT.sendKeys("SuperSecretPassword!");
        WebElement submitBTN = driver.findElement(By.xpath("//button[@type='submit']"));
        submitBTN.click();
        String logOutBTN = driver.findElement(By.linkText("Logout")).getText();
        System.out.println(logOutBTN);
        Assert.assertTrue(!logOutBTN.isEmpty());
    }

    @AfterClass
    void tearDown(){
        if (driver!=null)
            driver.quit();
    }
}
