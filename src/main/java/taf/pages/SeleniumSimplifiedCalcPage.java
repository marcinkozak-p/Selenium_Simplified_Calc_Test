package taf.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SeleniumSimplifiedCalcPage {

    @FindBy(xpath = "")
    private WebElement inputFirst;

    @FindBy(xpath = "")
    private WebElement inputSecond;

    @FindBy(xpath = "")
    private WebElement operationsDropdownList;

    @FindBy(xpath = "")
    private WebElement operationResult;

    @FindBy(xpath = "")
    private WebElement calculateButton;

    public SeleniumSimplifiedCalcPage(WebDriver driver) {
        PageFactory.initElements(driver,this);
        driver.get("https://testpages.herokuapp.com/calculate.php");
    }

    public void clearInputs(){
        inputFirst.clear();
        inputSecond.clear();
    }

    public void calculate(){
        calculateButton.click();
    }

    public void setInputFirst(String input){
        inputFirst.sendKeys(input);
    }

    public void setInputSecond(String input){
        inputSecond.sendKeys(input);
    }

    public String getCalculationResult(){
        return operationResult.getText();
    }

}
