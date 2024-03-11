Feature: Flight Search Feature

Scenario Outline: Search Flights to and from specific city on particular date

    Given I am in Home Page
    When I enter "<departure_city>" in depart from field
    And enter "<arrival_city>" in going to field
    And select departure date
    And select return date
    And select Senior Citizen checkbox
    And click on Search Flights button
    Then flight search results with the text "Stops" are displayed

Examples:
| departure_city  |  arrival_city          |
| Bangalore (BLR) |  Chennai International |