Feature: Creating Entry

Background:

  Given User is on Hotel application Login Page
  When User Enters "Username" and "Password"
  And Clicks on Login button
  Then User should see Hotel entries


  Scenario: Create Single entry
    Given User is logged in successfully and can see hotel entries
    When User enter "adas" "ccc" "vcvc" "54633223211" "xyz@gmail.com"
    Then User expect to see "adas" in the entry list

  Scenario: Delete Entry
    Given User is logged in successfully and can see hotel entries
    When  User click on cross mark of adas hotel entry
    Then "adas" entry must be deleted

  Scenario Outline: Create Multi entry
    Given User is logged in successfully and can see hotel entries
    When User enter "<name>" "<address>" "<owner>" "<number>" "<Email>"
    Then User expect to see "<expected>" in the entry list
    Examples:
      | name          | address   | owner       | number      | Email
      | HolidayInn    | London    | xyz         | 078929992   | holi+123@holicayInn.com
      | Ramada        | London    | Ramada Ltd  | 00991212111 | ram+123@ram.com

