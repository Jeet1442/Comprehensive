Feature: Contact with invalid data

Scenario: Contact us invalid
Given User enters the proper url of the website as given
When User clicks on Contact Us link at the bottom of the page
And Enter no email only enters name and message
Then User clicks on send to send the message
