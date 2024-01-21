Feature: Categories
Scenario Outline: Check Categories
Given the user is in the index page
When the user clicks the <Category> in the left
Then the user lands in the correct <Product> page

Examples:
|Category|Product|
|Phones|Samsung galaxy s6|
|Laptops|Sony vaio i5|
|Monitors|Apple monitor 24|