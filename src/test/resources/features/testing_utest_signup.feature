# Author: Wilmer

@stories

Feature: Testing utest
  An user wants signup into a utest.com

  @scenarioSignUp
  Scenario: Signup Successfully
    Given brandon wants to signup into a utest.com
    When brandon clicks on button Join today and writes his credentials
      | fistName           | lastName   | email                            | birthMonth | birthDay  | birthYear | currentCity   | zipCode  | currentCountry  | yourComputer | versionPC  | languagePc | mobileDevice  | modelMD  | operatingSystemMD  | passwordUser     | languageUser |
      | Wilmer             | Castro     | wilmer-1499@hotmail.com          | April      | 13        | 1999      | Villavicencio | 500004   | Colombia        | macos        |  10.7.5    | spanish    | Motorola      | macro    | 8                  | Choucair123*     | Spanish      |
    Then brandon was successfully registered
      | questionUser   |
      | Complete Setup |
