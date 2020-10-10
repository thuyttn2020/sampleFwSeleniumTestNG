package pages;

import org.openqa.selenium.By;

public class LoginPage {
    private final By usernameTXT = By.id("username");
    private final By passwordTXT = By.id("password");
    private final By submitBTN = By.xpath("//buton[@type='submit']");
}
