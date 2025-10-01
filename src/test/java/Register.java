import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import PO.RegisterPO;
import PO.HomePO;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;


public class Register {

    private WebDriver driver;
    private RegisterPO register;
    private HomePO home;

    @BeforeMethod
    public void setup() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        register = new RegisterPO(driver);
        home = new HomePO (driver);
        driver.get("https://parabank.parasoft.com/parabank/index.htm");
    }

    @Test
    public void register() {
        home.acessRegister();
        register.registerNewUser();
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}