Feature: Open a new user account

  Background:
    Given User navigate to the parabank Website
    And website has a connection such as "register" or "sign up" on its home page

    Scenario: User registration
      When User clicks the "Register" link
      And the user fills the fields on the screen with the testaic shape
      And the user clicks the "Submit" or "Register" button
      Then user confirms that a successful registration process has taken place
      And user,"Your Account Was Created SuccessFully. You are now." sees a message like
      And the user will enter the system with the information he entered during the registration
