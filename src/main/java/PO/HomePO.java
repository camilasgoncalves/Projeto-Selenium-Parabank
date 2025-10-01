package PO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.time.Duration;

public class HomePO {

    private final WebDriverWait wait;

    public HomePO(WebDriver driver) {
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

    private WebElement btnOpenNewAccount() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Open New Account")));
    }

    private WebElement btnAccountsOverview() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Accounts Overview")));
    }

    private WebElement btnTransferFunds() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Transfer Funds")));
    }

    private WebElement btnBillPay() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Bill Pay")));
    }

    private WebElement btnFindTransactions() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Find Transactions")));
    }

    private WebElement btnUpdateContactInfo() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Update Contact Info")));
    }

    private WebElement btnRequestLoan() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Request Loan")));
    }

    private WebElement btnLogOut() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Log Out")));
    }


    //METODOS

    public void acessRegister() {
        wait.until(ExpectedConditions.visibilityOf(btnRegister())).click();
    }

    public void acessAboutUs() {
        wait.until(ExpectedConditions.visibilityOf(btnAbout())).click();
    }

    public void acessServices() {
        wait.until(ExpectedConditions.visibilityOf(btnServices())).click();
    }

    public void acessProducts() {
        wait.until(ExpectedConditions.visibilityOf(btnProducts())).click();
    }

    public void acessLocations() {
        wait.until(ExpectedConditions.visibilityOf(btnLocations())).click();
    }

    public void acessContactUs() {
        wait.until(ExpectedConditions.visibilityOf(btnContact())).click();
    }

    public void acessAdminPage() {
        wait.until(ExpectedConditions.visibilityOf(btnAdminPage())).click();
    }

    public void acessOpenNewAccount() {
        wait.until(ExpectedConditions.visibilityOf(btnOpenNewAccount())).click();
    }

    public void acessAccountsOverview() {
        wait.until(ExpectedConditions.visibilityOf(btnAccountsOverview())).click();
    }

    public void acessTransferFunds() {
        wait.until(ExpectedConditions.visibilityOf(btnTransferFunds())).click();
    }

    public void acessBillPay() {
        wait.until(ExpectedConditions.visibilityOf(btnBillPay())).click();
    }

    public void acessFindTransactions() {
        wait.until(ExpectedConditions.visibilityOf(btnFindTransactions())).click();
    }
    public void acessUpdateContactInfo() {
        wait.until(ExpectedConditions.visibilityOf(btnUpdateContactInfo())).click();
    }
    public void acessRequestLoan() {
        wait.until(ExpectedConditions.visibilityOf(btnRequestLoan())).click();
    }
    public void logOut() {
        wait.until(ExpectedConditions.visibilityOf(btnLogOut())).click();
    }
}