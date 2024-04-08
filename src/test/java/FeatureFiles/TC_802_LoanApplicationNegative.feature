Feature: Loan Application Negative

  Background:
    Given User navigate to the parabank Website
    And the user sees the Customer Login section on the home page.
    And the user fills the fields on the screen
      | loginUsername | burak888 |
      | loginPassword | 12345678 |
    And the user clicks the login button
    Then user confirms that a successful registration process has taken place

  Scenario: Credit Application with Insufficient Balance
    And user click on "Request Loan" link
    And user enters your credit information:
      | Credit Amount | Down payment | Account number                |
      | $ 1000000     | $ 10000      | # (A predefined bank account)
    And user click on the "Apply Now" button
    And user confirms the following information under the title Loan Request Processed:
      | Field         | Value  |
      | Loan Provider | WSDL   |
      | Status        | Denied |
    And user "You do not have sufficient funds for the given down payment" confirms the message