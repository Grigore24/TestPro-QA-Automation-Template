Feature: Login feature
  Scenario: Login Scenario
    Given I open Login Page
    When I enter email "grigore.crepciuc@testpro.io"
    And I enter Password "te$t$tudent22"
    And I submit
    Then I am logged in

Scenario Outline: : Negative Login Scenario
    Given I open Login Page
    When I enter email <email>
    And I enter Password <password>
    And I submit
    Then I should not am logged in
    Examples:
      | email                         | password             |
      | "invalid@testpro.io"          | "te$t$tudent22"      |
      | "grigore.crepciuc@testpro.io" | "invalidte$t$tudent" |
      |""                             | "te$t$tudent22"      |
      | "grigore.crepciuc@testpro.io" |""                    |