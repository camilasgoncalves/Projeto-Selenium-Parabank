package PO;
import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.time.Duration;

public class LoginPO {

    private WebDriver driver;
    private WebDriverWait wait;

    public LoginPO(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    //ELEMENTOS

    private WebElement iptUsername() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='username']")));
    }
    private WebElement iptPassword() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='password']")));
    }
    private WebElement btnLogin() {
        return wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@value='Log In']")));
    }
    private WebElement lblWelcome() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//b[contains(text(), 'Welcome')]")));
    }

    //METODOS

    public void login(){
        iptUsername().sendKeys("dodi");
        iptPassword().sendKeys("dodi");
        btnLogin().click();
        wait.until(ExpectedConditions.visibilityOf(lblWelcome()));

    }
}