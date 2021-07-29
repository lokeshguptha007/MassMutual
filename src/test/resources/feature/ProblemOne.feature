Feature: Currencies and Total Balance

Scenario: Verify the right count of values appear on the screen
Given User able to open the application
When User able to navigate to that Balances page
Then The total right count of values appear on the screen is

Scenario: Verify values on screen are greater than zero
Given User able to open the application
When User able to navigate to that Balances page
Then Values displayed should be greater than zero

Scenario: Verify the total balance is correct based on the values listed on the screen
Given User able to open the application
When User able to navigate to that Balances page
Then Total balance values displayed should match the sum of values

Scenario: Verify values are formatted as currencies
Given User able to open the application
When User able to navigate to that Balances page
Then Values displayed should be formatted as currencies

Scenario: Verify total balance matches the sum of values
Given User able to open the application
When User able to navigate to that Balances page
Then Total balance values displayed should match the sum of values