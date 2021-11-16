Feature: Contact with valid data

Scenario: Contact us valid
Given User enters the proper url of the website
When User clicks on Contact Us link
And Enter valid email along with name and message
Then User sends the message
