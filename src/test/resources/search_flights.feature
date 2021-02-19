Feature:  I need to go to the main page of travelocity
  to book and check flights of type One-way.

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


  ##Scenario: Select roundtrip flight with car

  Scenario Outline: Fill in the city of origin and destination with empty spaces.
    Given that the user is on the main page
    When the user enters information about flight with error data
      | cityOrigin   | cityDestination   | typeFlight   | dateOrigin   | warningMessage   |
      | <cityOrigin> | <cityDestination> | <typeFlight> | <dateOrigin> | <warningMessage> |
    Then user should see warning message

    Examples:
      | cityOrigin | cityDestination | typeFlight | dateOrigin    | warningMessage                                    |
      | medellin   |                 | One-way    | Apr 13, 2021. | Please select a destination                       |
      | medellin   | medellin        | One-way    | Apr 13, 2021. | Please choose a different destination from origin |
