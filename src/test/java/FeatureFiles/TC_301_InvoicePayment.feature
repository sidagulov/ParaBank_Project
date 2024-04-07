Feature:Bill Payment functionality

  Background:
    Given User navigate to the parabank Website
    And the user sees the Customer Login section on the home page.
    And the user fills the fields on the screen
      | loginUsername | burak888 |
      | loginPassword | 12345678 |
    And the user clicks the login button
    Then user confirms that a successful registration process has taken place

  Scenario Outline: Paying different types of invoices
    When the user clicks the Bill Pay option from the menu on the website
    And the user fills the fields on the screen
      | payeename           | <Invoice Type>       |
      | payeeaddress        | <AdresseInformation> |
      | payeeaddresscity    | <city>               |
      | Payeeaddrestate     | <Regional>           |
      | payeeaddressZipcode | <Postage Code>       |
      | payeephoneNumber    | <Phone>              |
      | payeeaccountNumber  | <AccountNumber>      |
      | verifyAccount       | <VerifyAccount>      |
      | payeeamount         | <Paymentamount>      |

    And Select Payment option

    And the user clicks the Send Payment button for payment process




    Examples:
      | Invoice Type              | AdresseInformation | city     | Regional | Postage Code | Phone  | AccountNumber | VerifyAccount | Paymentamount |
      | Enerjisa Electricity Bil  | Example Address 1  | Istanbul | Anatolia | 85666        | 896547 | 654789        | 654789        | 250           |
      | ISKI WATER INVOICE        | Example Address 2  | Istanbul | Center   | 98745        | 321456 | 789456        | 789456        | 300           |
      | IGDAS NATURAL GAS INVOICE | Example Address 3  | Ankara   | Center   | 65897        | 987456 | 123456        | 123456        | 350           |
