Feature: About us
Scenario Outline: Check About us
Given the user is in the index page
When the user clicks the About us button
And the user clicks in the video
And the user clicks close button
Then did user land in the index page
