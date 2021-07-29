package stepDefinitions;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.ValuesAndTotalBalancePage;
import utils.*;

public class ProblemOneStepDefinitation extends SuperHelper
{
	WebDriver driver;
	ValuesAndTotalBalancePage valuesAndTotalBalancePage=new ValuesAndTotalBalancePage(this.driver);
	
	@Given("^User able to open the application$")
	public void user_able_to_open_the_application() throws Exception {
		 System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
		 driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 driver.get("https://www.exercise1.com/values");
	}

	@When("^User able to navigate to that Balances page$")
	public void user_able_to_navigate_to_that_Balances_page() throws Exception {
	 
		//valuesAndTotalBalancePage.clickvalueAndTotalBalancePage();
	}

	@Then("^The total right count of values appear on the screen is$")
	public void the_total_right_count_of_values_appear_on_the_screen_is() throws Exception {
		double value1= valuesAndTotalBalancePage.getValueOneAsCurrency();
		double value2= valuesAndTotalBalancePage.getValueTwoAsCurrency();
		double value3= valuesAndTotalBalancePage.getValueThreeAsCurrency();
		double value4= valuesAndTotalBalancePage.getValueFourAsCurrency();
		double value5= valuesAndTotalBalancePage.getValueFiveAsCurrency();
			
		double countOfAllValues=value1+value2+value3+value4+value5;
		System.out.println("Right count balance is ("+countOfAllValues+")");
	}

	@Then("^Values displayed should be greater than zero$")
	public void values_displayed_should_be_greater_than() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		double value1= valuesAndTotalBalancePage.getValueOneAsCurrency();
		double value2= valuesAndTotalBalancePage.getValueTwoAsCurrency();
		double value3= valuesAndTotalBalancePage.getValueThreeAsCurrency();
		double value4= valuesAndTotalBalancePage.getValueFourAsCurrency();
		double value5= valuesAndTotalBalancePage.getValueFiveAsCurrency();
		
		valuesAndTotalBalancePage.validateValuesAreGreaterThanZero(value1, "value1"); //1st parameter is value(120,00.00) and 2nd parameter is "Field name" to show in report
		valuesAndTotalBalancePage.validateValuesAreGreaterThanZero(value2, "value2");
		valuesAndTotalBalancePage.validateValuesAreGreaterThanZero(value3, "value3");
		valuesAndTotalBalancePage.validateValuesAreGreaterThanZero(value4, "value4");
		valuesAndTotalBalancePage.validateValuesAreGreaterThanZero(value5, "value5");
	}

	@Then("^Total balance values displayed should match the sum of values$")
	public void total_balance_values_displayed_should_match_the_sum_of_values() throws Exception {
		double value1= valuesAndTotalBalancePage.getValueOneAsCurrency();
		double value2= valuesAndTotalBalancePage.getValueTwoAsCurrency();
		double value3= valuesAndTotalBalancePage.getValueThreeAsCurrency();
		double value4= valuesAndTotalBalancePage.getValueFourAsCurrency();
		double value5= valuesAndTotalBalancePage.getValueFiveAsCurrency();
		
		double totalBalanceValueInUI= valuesAndTotalBalancePage.getTotalBalanceValueAsCurrency();
		double sumOfAllValues=value1+value2+value3+value4+value5;
		
		if(totalBalanceValueInUI==sumOfAllValues)
		{
			System.out.println("PASS - Total balance values displayed matches the sum of all values");
		}
		else
		{
			System.out.println("FAIL - Total balance values("+totalBalanceValueInUI+") displayed does NOT match the sum of all values("+sumOfAllValues+")");
			 fail("FAIL - Total balance values("+totalBalanceValueInUI+") displayed does NOT match the sum of all values("+sumOfAllValues+")");
		}
		
	}
	
	@Then("^Values displayed should be formatted as currencies$")
	public void values_displayed_should_be_formatted_as_currencies() throws Exception {
		
		String value1= valuesAndTotalBalancePage.getValue1();
		String value2= valuesAndTotalBalancePage.getValue2();
		String value3= valuesAndTotalBalancePage.getValue3();
		String value4= valuesAndTotalBalancePage.getValue4();
		String value5= valuesAndTotalBalancePage.getValue5();
		valuesAndTotalBalancePage.validateCurrencyFormat(value1);
		valuesAndTotalBalancePage.validateCurrencyFormat(value2);
		valuesAndTotalBalancePage.validateCurrencyFormat(value3);
		valuesAndTotalBalancePage.validateCurrencyFormat(value4);
		valuesAndTotalBalancePage.validateCurrencyFormat(value5);
	}


}
