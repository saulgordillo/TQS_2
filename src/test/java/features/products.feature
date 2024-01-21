Feature: placeOrder
Scenario Outline: Place order
Given the user is in the index page
When the user clicks all the items in the first page
And the user clicks to next page button
And the user clicks all the items in the next page
Then did user land in the index page
