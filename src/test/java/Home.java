import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import PO.HomePO;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Home {

    private WebDriver driver;
    private HomePO home;

    @BeforeMethod
    public void setup() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        home = new HomePO (driver);
        driver.get("https://parabank.parasoft.com/parabank/index.htm");
    }


    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}
