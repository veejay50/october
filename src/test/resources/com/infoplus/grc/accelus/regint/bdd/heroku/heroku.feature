@heroku
Feature: Click on Link in Heroku Page
  AS A User
  I WANT TO to click on click here in Heroku page 
  SO THAT another browser window opens

  Scenario: A user click on click here on heroku page 
    Given I am on Multiple Windows page of herokuapp website 
    When I click on Click Here
    Then another browser tab window opens
