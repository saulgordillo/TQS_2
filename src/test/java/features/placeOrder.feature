Feature: placeOrder
Scenario Outline: Place order
Given the user is in the index page
When the user clicks the first product
And the user clicks add to cart
And the user clicks ok
And the user clicks the cart button
And the user clicks the place order button
And the user adds the <Name> in the name
And the user adds the <Country> in the country
And the user adds the <City> in the city
And the user adds the <CreditCard> in the credit Card
And the user adds the <Month> in the month
And the user adds the <Year> in the year
And the user clicks the purchase button
Then check if the purchase is correct

Examples:
|Name|Country|City|CreditCard|Month|Year|
|Lucas|Spain|Argentona|1111|Abril|2000|
|Saul|Spain|Granollers|2222|Gener|1999|