package PO;
import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.time.Duration;

public class RegisterPO {

    private WebDriver driver;
    private WebDriverWait wait;

    public RegisterPO(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    //ELEMENTOS

    private WebElement iptFirstName() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='customer.firstName']")));
    }

    private WebElement iptLastName() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='customer.lastName']")));
    }

    private WebElement iptAddress() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='customer.address.street']")));
    }

    private WebElement iptCity() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='customer.address.city']")));
    }

    private WebElement iptState() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='customer.address.state']")));
    }

    private WebElement iptZipCode() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='customer.address.zipCode']")));
    }

    private WebElement iptPhone() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='customer.phoneNumber']")));
    }

    private WebElement iptSsn() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='customer.ssn']")));
    }

    private WebElement iptUsername() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='customer.username']")));
    }

    private WebElement iptPassword() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='customer.password']")));
    }

    private WebElement iptConfirm() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='repeatedPassword']")));
    }

    private WebElement btnRegister() {
        return wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@value='Register']")));
    }

    private WebElement lblSuccessMessage() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[contains(text(),'Your account was created successfully. You are now logged in.')]")));
    }

    //METODOS

    public void registerNewUser() {
        Faker faker = new Faker();

        String firstName = faker.name().firstName();
        String lastName = faker.name().lastName();
        String address = faker.address().streetAddress();
        String city = faker.address().city();
        String state = faker.address().state();
        String zip = faker.address().zipCode();
        String phone = faker.phoneNumber().cellPhone();
        String ssn = faker.idNumber().ssnValid();
        String username = faker.name().username();
        String password = faker.internet().password();

        wait.until(ExpectedConditions.visibilityOf(iptFirstName())).sendKeys(firstName);
        iptLastName().sendKeys(lastName);
        iptAddress().sendKeys(address);
        iptCity().sendKeys(city);
        iptState().sendKeys(state);
        iptZipCode().sendKeys(zip);
        iptPhone().sendKeys(phone);
        iptSsn().sendKeys(ssn);
        iptUsername().sendKeys(username);
        iptPassword().sendKeys(password);
        iptConfirm().sendKeys(password);
        btnRegister().click();
        wait.until(ExpectedConditions.visibilityOf(lblSuccessMessage()));
    }

}