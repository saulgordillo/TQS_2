Feature: Signup
Scenario Outline: User Signup
Given the user is in the index page
When the user clicks the signup button
And the user enters <username> in the new username
And the user enters <password> in the new password
And the user clicks signup
Then the user is signed up

Examples:
|username|password|
|1|1|
|2|2|
|3|3|