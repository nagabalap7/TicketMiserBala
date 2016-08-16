Feature: Ticket Miser Venue Feature
Scenario: Add Venue details
Given Ticket Miser browser "http://slc05rtt.us.oracle.com:9998/frontend/?root=home"
When Click on Venues
Then Click on Add Venue
And Enter Venue Name "Hyd"
And Click OK
