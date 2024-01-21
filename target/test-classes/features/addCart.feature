Feature: addCart
Scenario Outline: Add to Cart
Given the user is in the index page
When the user clicks the first product
And the user clicks add to cart
And the user clicks ok
And the user clicks the cart button
Then the user is in cart page with the product added

