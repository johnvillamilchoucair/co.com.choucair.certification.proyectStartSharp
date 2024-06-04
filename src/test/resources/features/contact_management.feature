#Autor: John Villamil

@Stories1
Feature: Create Contact
  As a StarSharp user, I want to create and validate a new Contact

  Background:
    Given I need to be on the StartSharp login page
    And  I will enter the following credentials
      | username | password |
      | admin    | serenity |

  @Scenario1
  Scenario Outline: Create a new Contact
    Given Im in the <typeView> view
    When  I fill out the new contact form with the following information
      | title   | firstName   | lastName   | email   | identityNum   | user   | typeView   |
      | <title> | <firstName> | <lastName> | <email> | <identityNum> | <user> | <typeView> |
    Then I search the <userName> contact on the tree
    And Validate the contact information

    Examples:
      | title | firstName | lastName | email            | identityNum | userName    | typeView            |
      | Mr.   | Robert    | Downey   | rdowney@mail.com | 123456123   | jason.baker | creationContactView |