Feature: Loan Application

  Background:
    Given User navigate to the parabank Website
    And the user sees the Customer Login section on the home page.
    And the user fills the fields on the screen
      | loginUsername | burak999 |
      | loginPassword | 1234567 |
    And the user clicks the login button
    Then user confirms that a successful registration process has taken place

  Scenario: Request credit
    And user click on "Request Loan" link
    And user enters $ "2000" in the loan amount field
    And user enters "400" dollars in Down Payment field
    And user selects an account number in the from account # field
    And user click on the Apply Now button
    And user confirms the following information:
      | Loan Provider           | Parabank                     |
      | Status                  | Approved                     |
      | Congratulations Message | Your loan Has Been Approved. |
    When user Click on the link of the newly created credit account number
    And user confirms the following information:
      | Title          | Value                       |
      | Account Number | (New Credit Account Number) |
      | Account Type   | Loan                        |
      | Balance        | $ 2000.00                   |
      | Availble       | $ 2000.00                   |
    And user "No Transaction Found." confirms the message