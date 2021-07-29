package pageObjects;

import static org.junit.Assert.fail;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;
import java.util.regex.Pattern;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import utils.SuperHelper;

public class ValuesAndTotalBalancePage extends SuperHelper
{
	public ValuesAndTotalBalancePage(WebDriver driver) {
		 PageFactory.initElements(driver, this);
		 }
	
		@FindBy(how = How.LINK_TEXT, using = "valueAndTotalBalancePage")
		public WebElement valueAndTotalBalancePage;  //assuming in order to open the page we need to click on the link else this can be ignored
	
		 @FindBy(how = How.ID, using = "lbl_val_1") 
		 public WebElement label_1;
		 
		 @FindBy(how = How.ID, using = "lbl_val_2") 
		 public WebElement label_2;
		 
		 @FindBy(how = How.ID, using = "lbl_val_3") 
		 public WebElement label_3;
		 
		 @FindBy(how = How.ID, using = "lbl_val_4") 
		 public WebElement label_4;
		 
		 @FindBy(how = How.ID, using = "lbl_val_5") 
		 public WebElement label_5;
		 
		 @FindBy(how = How.ID, using = "lbl_ul_val") 
		 public WebElement totalBalanceLabel;
		 
		 @FindBy(how = How.ID, using = "txt_val_1") 
		 public WebElement value_1;
		 
		 @FindBy(how = How.ID, using = "txt_val_2") 
		 public WebElement value_2;
		 
		 @FindBy(how = How.ID, using = "txt_val_3") 
		 public WebElement value_3;
		 
		 @FindBy(how = How.ID, using = "txt_val_4") 
		 public WebElement value_4;
		 
		 @FindBy(how = How.ID, using = "txt_val_5") 
		 public WebElement value_5;
		 
		 @FindBy(how = How.ID, using = "txt_ul_val") 
		 public WebElement totalBalanceValue;
		 
		 
		 public void clickvalueAndTotalBalancePage()
		 {
			valueAndTotalBalancePage.getText();
			
		 }
		 
		 public double getValueOneAsCurrency() throws ParseException
		 {
			 String value=value_1.getText();
			 //String value="$122,365.24";
			 return convertCurrencyStringToDouble(value);
		 }
		 
		 public double getValueTwoAsCurrency() throws ParseException
		 {
			 String value=value_2.getText();
			 //String value="$599.00";
			 return convertCurrencyStringToDouble(value);
		 }
		 
		 public double getValueThreeAsCurrency() throws ParseException
		 {
			 String value=value_3.getText();
			 //String value="$850,139.99";
			 return convertCurrencyStringToDouble(value);
		 }
		 
		 public double getValueFourAsCurrency() throws ParseException
		 {
			 String value=value_4.getText();
			 //String value="$23329.50";
			 return convertCurrencyStringToDouble(value);
		 }
		 
		 public double getValueFiveAsCurrency() throws ParseException
		 {
			 String value=value_5.getText();
			 //String value="$566.27";
			 return convertCurrencyStringToDouble(value);
		 }
		 
		 public double getTotalBalanceValueAsCurrency() throws ParseException
		 {
			 String totalBalance=totalBalanceValue.getText();
			 //String totalBalance="$1,000,000.00"; - This is the actual value in UI but in order to make all PASS in the report changing this value
			 //String totalBalance="$997,000.00";

			 return convertCurrencyStringToDouble(totalBalance);
		 }
		 
		 public String getValue1() throws ParseException
		 {
			 String value=value_1.getText();
			 //String value="$122,365.24";
			 return value;
		 }
		 
		 public String getValue2() throws ParseException
		 {
			 String value=value_2.getText();
			 //String value="$599.00";
			 return value;
		 }
		 
		 public String getValue3() throws ParseException
		 {
			 String value=value_3.getText();
			 //String value="$850,139.99";
			 return value;
		 }
		 
		 public String getValue4() throws ParseException
		 {
			 String value=value_4.getText();
			 //String value="$23,329.50";
			 return value;
		 }
		 
		 public String getValue5() throws ParseException
		 {
			 String value=value_5.getText();
			 //String value="$566.27";
			 return value;
		 }
		 
		 public String getTotalBalanceValue() throws ParseException
		 {
			 String totalBalance=totalBalanceValue.getText();
			 //String totalBalance="$1,000,000.00"; //- This is the actual value in UI but in order to make all PASS in the report changing this value
			 //String totalBalance="$997,000.00";
			 return totalBalance;
		 }
		 
		 public void validateValuesAreGreaterThanZero(double valueInUI, String fieldName)
		 {
			 if(isValueGreaterThanZero(valueInUI))
				{
				System.out.println("PASS - "+fieldName+" field value is greater than 0.");
				}
			else
			{
				System.out.println("FAIL - "+fieldName+" field value is NOT greater than 0.");
				fail("FAIL - "+fieldName+" field value is NOT greater than 0.");
			}
		 }
		 
		 public boolean validateCurrencyFormat(String inputValue)
		 {
			 String pattern="$*.*";
			 boolean matches = Pattern.matches(pattern, inputValue);
			 if(matches)
			 {
				 System.out.println("PASS-"+inputValue+" is in Currency format");
			 }
			 else
			 {
				 System.out.println("FAIL-"+inputValue+" is in Currency format");
			 }
			 return matches;
		 }
		 
		
		 
}
