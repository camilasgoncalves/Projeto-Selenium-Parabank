package PO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import java.time.Duration;

public class HomePO {

    private WebDriver driver;
    private WebDriverWait wait;

    public HomePO(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    // ELEMENTOS - HOME

    private WebElement btnHome() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()='home']")));
    }
    private WebElement btnAbout() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()='about']")));
    }
    private WebElement btnContact() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()='contact']")));
    }
    private WebElement btnServices() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()='Services']")));
    }
    private WebElement btnProducts() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()='Products']")));
    }
    private WebElement btnLocations() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()='Locations']")));
    }
    private WebElement btnAdminPage() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()='Admin Page']")));
    }
    private WebElement inpUsername() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("username")));
    }
    private WebElement inpPassword() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("password")));
    }
    private WebElement btnLogin() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@type='submit']")));
    }
    private WebElement btnForgotLoginInfo() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Forgot your login info?")));
    }
    private WebElement btnRegister() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Register")));
    }


    //METODOS

    public void acessRegister() {
    wait.until(ExpectedConditions.visibilityOf(btnRegister())).click();
    }

}