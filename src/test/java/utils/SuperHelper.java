package utils;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class SuperHelper
{
	 public boolean isValueGreaterThanZero(double value)
	 {
		 if(value>0)
		 {
			 System.out.println("Value in Value1 field is greater than 0");
			 return true;
		 }
		 else
		 {
			 System.out.println("FAIL-Value in Value1 field is NOT greater than 0");
			 return false; 
		 }
	 }
	 
	 public double convertCurrencyStringToDouble(String inputCurrency) throws ParseException
	 {
		 Locale locale = new Locale("en", "US");
		 Number number = NumberFormat.getCurrencyInstance(locale).parse(inputCurrency);
		 //System.out.println("Number:"+number);
		 double val= number.doubleValue();
		 return val;
	 }
	
}
