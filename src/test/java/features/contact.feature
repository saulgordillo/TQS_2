Feature: Contact
Scenario Outline: Contact 
Given the user is in the index page
When the user clicks the contact button
And the user enters the <Email> in the mail
And the user enters the <Name> in the name
And the user enters the <Message> in the message
And the user clicks the send message button
Then did user land in the index page

Examples:
|Email|Name|Message|
|email@gmail.com|Saul|Hola|
|hmail@gmail.com|Lucas|Adeu|
