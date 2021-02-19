Feature: I need to search for roundtrip flights with the option
  to select a hotel to be able to plan trips in different cities.


  ## Boundtrip flight with hotel

  Scenario: Select hotel in boundtrip flight with hotel
    Given that the user is on the main page
    When the user enters the information about the roundtrip flight
      | cityOrigin | cityDestination | typeFlight | dateDeparture | dateReturn    |
      | Boston     | Miami           | Boundtrip  | Apr 20, 2021. | Apr 24, 2021. |
    Then he should be able to select one of the hotels

  Scenario: Filter by location to select the preferred hotel
    Given that the user is on the main page
    When the user enters the information about the roundtrip flight
      | cityOrigin  | cityDestination | typeFlight | dateDeparture | dateReturn    |
      | Los Angeles | Bogota          | Boundtrip  | Mar 19, 2021. | Mar 24, 2021. |
    And the user filters by area of "Zona Rosa"
    Then he should only see options for hotels located in the "Zona Rosa"

  Scenario: Select room-hotel in boundtrip flight with hotel
    Given that the user is on the main page
    When the user enters the information about the roundtrip flight
      | cityOrigin | cityDestination | typeFlight | dateDeparture | dateReturn    |
      | Medellin   | Miami           | Boundtrip  | Mar 19, 2021. | Mar 24, 2021. |
    And the user select a hotel
    Then he should be able to select one of the rooms

  Scenario: Select hotel and flights
    Given that the user is on the main page
    When the user enters the information about the roundtrip flight
      | cityOrigin  | cityDestination | typeFlight | dateDeparture | dateReturn    |
      | Los Angeles | Madrid          | Boundtrip  | Mar 19, 2021. | Mar 24, 2021. |
    And the user select a hotel
    And the user select flights
    Then he should see the information about his flight

  Scenario: The platform requests payment information to finalize the reservation
    Given that the user is on the main page
    When the user enters the information about the roundtrip flight
      | cityOrigin  | cityDestination | typeFlight | dateDeparture | dateReturn    |
      | Los Angeles | Bogota          | Boundtrip  | Mar 19, 2021. | Mar 24, 2021. |
    And the user select a hotel
    And the user select the flights
    And the user confirms the reservation data
    Then he should see a form requesting payment information


  ## Boundtrip flight with car

  Scenario: Select flight in boundtrip flight with car
    Given that the user is on the main page
    When the user enters the information about the roundtrip flight
      | cityOrigin  | cityDestination | typeFlight | dateDeparture | dateReturn    |
      | Los Angeles | Bogota          | Boundtrip  | Mar 19, 2021. | Mar 24, 2021. |
    Then he should be able to select one of the flights

  Scenario: Select car in boundtrip flight with car
    Given that the user is on the main page
    When the user enters the information about the roundtrip flight
      | cityOrigin  | cityDestination | typeFlight | dateDeparture | dateReturn    |
      | Los Angeles | Bogota          | Boundtrip  | Mar 19, 2021. | Mar 24, 2021. |
    And the user select the flights
    Then he should be able to select one of the available car

  Scenario: Select roundtrip flight with car for a city that does not have car rental.
    Given that the user is on the main page
    When the user enters the information about the roundtrip flight
      | cityOrigin  | cityDestination | typeFlight | dateDeparture | dateReturn    |
      | Los Angeles | Bogota          | Boundtrip  | Mar 19, 2021. | Mar 24, 2021. |
    And the user select the flights
    Then he should then be able to select one of the available vehicles

  Scenario: Select round trip flight with car successfully
    Given that the user is on the main page
    When the user enters the information about the roundtrip flight
      | cityOrigin  | cityDestination | typeFlight | dateDeparture | dateReturn    |
      | Los Angeles | Bogota          | Boundtrip  | Mar 19, 2021. | Mar 24, 2021. |
    And the user select the flights
    And the user select the car
    Then he should see the car and flights information

      ## Boundtrip flight with hotel and car
  Scenario: Select round trip flight with hotel and car successfully
    Given that the user is on the main page
    When the user enters the information about the roundtrip flight
      | cityOrigin  | cityDestination | typeFlight | dateDeparture | dateReturn    |
      | Los Angeles | Bogota          | Boundtrip  | Mar 19, 2021. | Mar 24, 2021. |
    And the user select a hotel
    And the user select the flights
    And the user select the car
    Then he should see the hotel, car and flights information