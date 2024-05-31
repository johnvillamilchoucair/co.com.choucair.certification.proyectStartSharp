#Autor: John Villamil

@Stories2
Feature: Start Sharp
  As a StarSharp user, I want to create and validate a new Meeting

  Background:
    Given I need to be on the StartSharp login page
    And  I will enter the following credentials
      | username | password |
      | admin    | serenity |

  @Scenario2
  Scenario Outline: Create a new Meeting
    When I am in the meeting creation view
    And  I fill out the new meeting form with the following information
      | meetingName   | meetingType   | meetingNumber   | startDate   | endDate   | location   | unit   | organizedBy   | reporter   | attendeeList   |
      | <meetingName> | <meetingType> | <meetingNumber> | <startDate> | <endDate> | <location> | <unit> | <organizedBy> | <reporter> | <attendeeList> |
    Then I search the <nameMeeting> on the tree
    And Validate the meeting information
    Examples:
      | meetingName | meetingType | meetingNumber  | startDate        | endDate          | location | unit       | organizedBy  | reporter     | attendeeList |
      | MyMeeting   | Strategy    | 00056763335422 | 06/06/2024 14:17 | 06/06/2024 16:17 | On Site  | Technology | Adam Edwards | Allison Bell | Robert Downey |
