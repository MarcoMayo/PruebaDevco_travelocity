Feature:  I need to go to the main page of travelocity
  to book and check flights and hotels.

  Scenario: Search one-way flight
    Given that the user is on the main page
    When the user enters the information about the flight
      | cityOrigin | cityDestination | typeFlight | dateOrigin    |
      | medellin   | Bogota          | One-way    | Apr 13, 2021. |
    Then he should see a flight Medellin (MDE) - Bogota (BOG)

  Scenario: Select an available flight
    Given Given the user searched for a flight with the following data
      | cityOrigin | cityDestination | typeFlight | dateOrigin   |
      | Miami      | Boston          | One-way    | Mar 6, 2021. |
    When the user selects a flight
    Then he should see the flight details

  Scenario: Filter by an airline
    Given Given the user searched for a flight with the following data
      | cityOrigin | cityDestination | typeFlight | dateOrigin    |
      | medellin   | Bogota          | One-way    | Apr 13, 2021. |
    When the user filters through the airline "Avianca"
    Then he should see  "Avianca" flights only

    @This
  Scenario: Select roundtrip flight with car
    Given Given the user searched for a roundtrip flight with the following data
      | cityOrigin | cityDestination | typeFlight | dateOrigin    |
      | medellin   | Bogota          | One-way    | Apr 13, 2021. |
    When the user filters through the airline "Avianca"
    Then he should see  "Avianca" flights only

