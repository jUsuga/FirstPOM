Feature: validations

  @smokeTest
  Scenario: validation data in forms demoqa
    Given the data entered in the demoqa form is successful
    When the form is successful, the data is taken and comparad with data from Excel
    Then validate that la comparison was a success