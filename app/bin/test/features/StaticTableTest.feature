@Grid # Le estamos indicando que se ejecute todos los escenarios
Feature: Test different actions on the Static Table page

Background: Navigate to table web app
  Given I navigate to the static table
  
Scenario: As a Test Enginner, I want to retrieve the value of an static table
  Then I can return the value I wanted

Scenario: As a Test Enginner, I want to validate the static table is displayed
  Then I can validate the table is displayed