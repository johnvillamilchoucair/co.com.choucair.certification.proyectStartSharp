#Autor: John Villamil

@Stories2
Feature: Create Meeting
  As a StarSharp user, I want to create and validate a new Meeting

  Background:
    Given I need to be on the StartSharp login page
    And  I will enter the following credentials
      | username | password |
      | admin    | serenity |

  @Scenario2
  Scenario Outline: Create a new Meeting
    Given Im in the meeting <typeView> view
    When  I fill out the new meeting form with the following information
      | meetingName   | meetingType   | meetingNumber   | startDate   | endDate   | location   | unit   | organizedBy   | reporter   | attendeeList   | typeView   |
      | <meetingName> | <meetingType> | <meetingNumber> | <startDate> | <endDate> | <location> | <unit> | <organizedBy> | <reporter> | <attendeeList> | <typeView> |
    Then I search and validate the new meeting data on the tree
      | meetingName   | meetingType   | meetingNumber   | startDate   | endDate   | location   | unit   | organizedBy   | reporter   | attendeeList   |
      | <meetingName> | <meetingType> | <meetingNumber> | <startDate> | <endDate> | <location> | <unit> | <organizedBy> | <reporter> | <attendeeList> |
    Examples:
      | meetingName | meetingType | meetingNumber  | startDate           | endDate             | location | unit   | organizedBy  | reporter     | attendeeList | typeView            |
      | MyMeeting4  | Strategy    | 00056763335422 | 06/06/2024 14:17:00 | 06/06/2024 16:17:00 | On Site  | Design | Adam Edwards | Allison Bell | Brian Morgan | creationMeetingView |
