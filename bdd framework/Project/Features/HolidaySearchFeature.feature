Feature: Holiday Search Feature

Scenario Outline: Search Holidays to and from specific location on a specific month

    Given I am in Home Page
    When I click on Holidays option
    And I enter "<depart_from>" in depart from field for holiday
    And enter "<arrival_to>" in going to field for holiday
    And select month of travel
    And click on Search Holidays button
    Then holiday search results containing the destination "<arrival_to>" are displayed

Examples:
| depart_from     |  arrival_to            |
| Jaipur          |  Bengaluru             |