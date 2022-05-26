import io.cucumber.java.en.Given;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import taf.pages.SeleniumSimplifiedCalcPage;

public class SeleniumSimplifiedCalculatorUITest {

    WebDriver driver;


    public void initDriver() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

    }

    @BeforeClass(alwaysRun = true)
    public void setup() {
        initDriver();
        SeleniumSimplifiedCalcPage simplifiedCalcPage = new SeleniumSimplifiedCalcPage(driver);
    }

    @Test
    public void test1(String firstInput, String secondInput) {
        System.out.println("Hello test 1!");
    }

    @Test
    public void testName() {

    }

    @AfterClass(alwaysRun = true)
    public void terminate() {
        driver.quit();
    }


}
