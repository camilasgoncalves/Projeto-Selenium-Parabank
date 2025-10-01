import PO.LoginPO;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;


public class Login {

    private WebDriver driver;
    private LoginPO login;

    @BeforeMethod
    public void setup() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        login = new LoginPO(driver);
        driver.get("https://parabank.parasoft.com/parabank/index.htm");
    }

    @Test
    public void login(){
        login.login();
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}