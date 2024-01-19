Feature: Login
Scenario Outline: User Login 
Given the user is in the index page
When the user clicks the login button
And the user enters <username> in the username
And the user enters <password> in the password
And the user clicks login
Then the user is logged in

Examples:
|username|password|
|1|1|
|2|2|
|3|3|