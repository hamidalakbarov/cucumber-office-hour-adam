Feature: Users module
  As a librarian, I should be able to add new user into library

  @homework @wip
  Scenario: Verify added user able to login libraryApp
    Given the "librarian" on the home page
    And the librarian navigates to "Users" page
    When the librarian clicks to Add User
    And the librarian enters full name "Test-Hamid"
    When the librarian enters password "Test1234!"
    And the librarian enters email "test-hamid6@test.com"
    And the librarian clicks to save changes
    Then verify "The user has been created." message is displayed
    And verify created user with "test-hamid6@test.com" and "Test1234!" able to login
    And verify created user should be able to see "Test-Hamid"
    And created user should be deleted from library

    #Examples:
      #| FullName | Password    | Email                                  |
      #| TJ Olson | libraryUser | useFakeEmailToDontMakeItFail@librarian |
