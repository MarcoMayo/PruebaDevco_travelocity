Feature: I need to search for multi-city flights in order
  to plan my entire trip.

  Scenario: Add the field to select another city.
    Given that the user is on the main page
    When the user selects the option "Add another flight" in multi-city flight
    Then he should see an extra field to add another flight

  Scenario: Delete the field to another city.
    Given that the user is on the main page
    When the user selects the option Add another flight in multi-city flight
    And he selects option Remove
    Then he should see the last added field get removed

  Scenario: Select flight multi-city successfully
    Given that the user is on the main page
    When the user enters the information about the multi-city flight
      | typeFlight | cityOrigin_1 | cityDestination_1 | dateDeparture_1 | cityOrigin_2 | cityDestination_2 | dateReturn   |
      | Boundtrip  | Medellin     | Bogota            | Mar 4, 2021.    | Cali         | Bogota            | Mar 5, 2021. |
    Then he should be able to select one of the flights

  Scenario: Select a date for flight 2 less than the date of flight 1
    Given that the user is on the main page
    When the user enters the information about the multi-city flight
      | typeFlight | cityOrigin_1 | cityDestination_1 | dateDeparture_1 | cityOrigin_2 | cityDestination_2 | dateReturn   |
      | Boundtrip  | Medellin     | Bogota            | Mar 4, 2021.    | Cali         | Bogota            | Mar 1, 2021. |
    Then he should see that date 2 cannot be selected

  Scenario: Select flight with a specific airline
    Given that the user is on the main page
    When the user enters the information about the multi-city flight
      | typeFlight | cityOrigin_1 | cityDestination_1 | dateDeparture_1 | cityOrigin_2 | cityDestination_2 | dateReturn   |
      | Boundtrip  | Medellin     | Bogota            | Mar 4, 2021.    | Bogota       | Medellin          | Mar 5, 2021. |
    And And the user select the flights of airline "Avianca"
    Then he should see that flight 2 only has available flights with the airline "Avianca"