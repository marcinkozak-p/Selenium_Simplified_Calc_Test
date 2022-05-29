package stepDefinitions;

import io.cucumber.java.AfterAll;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import taf.utilities.Operator;
import taf.pages.SeleniumSimplifiedCalcPage;

public class simplified_calc_step_definitions {

    private static WebDriver driver;
    private static SeleniumSimplifiedCalcPage simplifiedCalcPage;


    @Given("User is on {} page")
    public void user_is_on_calculator_page(String pageURL) {
        if (driver == null || !driver.getCurrentUrl().equals(pageURL)) {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
            simplifiedCalcPage = new SeleniumSimplifiedCalcPage(driver, pageURL);
        }
    }

    @When("User inputs {} to first input")
    public void input_first_input(String firstInput) {
        simplifiedCalcPage.setInputFirst(firstInput);
    }

    @When("User inputs {} to second input")
    public void input_second_input(String secondInput) {
        simplifiedCalcPage.setInputSecond(secondInput);
    }

    @When("User selects {} in operations list")
    public void user_selects_operation(String operation) {
        simplifiedCalcPage.selectOperation(Operator.getOperation(operation));
    }

    @When("User clicks Calculate")
    public void user_clicks_calculate() {
        simplifiedCalcPage.selectCalculate();
    }

    @Then("The answer should say {}")
    @Test
    public void the_answer_should_say(String answer) {
        Assert.assertEquals(simplifiedCalcPage.getCalculationResult(), answer);
    }

    @AfterAll()
    public static void before_or_after_all() {
        driver.quit();
    }

}