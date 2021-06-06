Feature: Create a test for register to https://demoqa.com/automation-practice-form

Scenario: register
Given I am on automation-practice-form web app
When I enter firstname
And I enter lastname
And I enter emailId
And I select gender
And I enter mobileno
And I enter dob
And I enter Subjects
And I choose hobbies
And I upload a file
And I enter address
And I select state
And I select city
And I submit
Then Form should be submitted

