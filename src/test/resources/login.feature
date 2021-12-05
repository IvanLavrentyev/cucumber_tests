#language: en
Feature: Login User
  Scenario: Login user
    Then Click button
    Then Enter request "слон"
    Then Click search button
    Then Check that header is correct