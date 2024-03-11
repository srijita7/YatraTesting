Feature: Hotel Search Feature

Scenario Outline: Search Hotels for specific location for desired checkin and checkout date

    Given I am in Home Page
    When I click on Hotels
    And enter "<location>" in location field
    And select checkin date
    And select checkout date
    And click on Search button
    Then hotel search results for "<location>" are displayed

Examples:
| location   |
| New Delhi  |
