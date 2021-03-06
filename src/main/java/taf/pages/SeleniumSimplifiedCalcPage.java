package taf.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import taf.utilities.LogUtils;
import taf.utilities.Operator;

public class SeleniumSimplifiedCalcPage {

    @FindBy(xpath = "//*[@id=\"number1\"]")
    private WebElement inputFirst;

    @FindBy(xpath = "//*[@id=\"number2\"]")
    private WebElement inputSecond;

    @FindBy(xpath = "//*[@id=\"function\"]")
    private WebElement operationsDropdownListWebElement;

    @FindBy(xpath = "//*[@id=\"answer\"]")
    private WebElement operationResult;

    @FindBy(xpath = "//*[@id=\"calculate\"]")
    private WebElement calculateButton;

    private Select operationsDropdownList;

    public SeleniumSimplifiedCalcPage(WebDriver driver, String pageURL) {
        PageFactory.initElements(driver, this);
        driver.get(pageURL);
        operationsDropdownList = new Select(operationsDropdownListWebElement);
        LogUtils.info("Opened calculator page at: " + pageURL);
    }

    public void setInputFirst(String input) {
        LogUtils.info("Setting first input: " + input);
        inputFirst.clear();
        inputFirst.sendKeys(input);
    }

    public void setInputSecond(String input) {
        LogUtils.info("Setting second input: " + input);
        inputSecond.clear();
        inputSecond.sendKeys(input);
    }

    public void selectOperation(Operator operator) {
        LogUtils.info("Selecting operation: " + operator);
        operationsDropdownList.selectByValue(operator.getAction());
    }

    public void selectCalculate() {
        LogUtils.info("Calculate button selected");
        calculateButton.click();
    }

    public String getCalculationResult() {
        LogUtils.info("Calculated result: " + operationResult.getText() +"\n");
        return operationResult.getText();
    }

}
