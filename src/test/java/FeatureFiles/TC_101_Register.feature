Feature: Open a new user account

  Background:
    Given User navigate to the parabank Website


  Scenario: User registration
    When User clicks the Register link
    And the user fills the fields on the screen
      | firstName       | Burak       |
      | lastName        | Demir       |
      | address         | Mustamae    |
      | city            | Milan       |
      | state           | Harjumaa    |
      | zipCode         | 312918      |
      | phoneNumber     | 56587468764 |
      | ssn             | 821         |
      | userName        | burak888    |
      | password        | 1234567     |
      | confirmPassword | 1234567     |

    And the user clicks the Register button
    Then user confirms that a successful registration process has taken place
