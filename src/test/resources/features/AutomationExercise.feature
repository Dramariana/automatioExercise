Feature: AutomationExercise Page

  Scenario Outline: Search Product
    Given user enters automationExercise site
    And user select product button
    When user search product
    Then user can view all products related to search
    Examples:
      | product |
      | top     |
      | DRESS   |
      | MeN     |
      | kid     |
