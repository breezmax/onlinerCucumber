Feature: Onliner - filtering cars

  Scenario:
    Given Go to "https://www.onliner.by/"
    When I navigate to the "Автобарахолка" page
    And Set filtering price by "'USD'"
    And Set filtering cars by price "till '100.000$'"
    And Set filtering cars by Body Type "'Sedan'"
    And Set filtering cars by Transmission"'Automatic'"
    Then Close the browser