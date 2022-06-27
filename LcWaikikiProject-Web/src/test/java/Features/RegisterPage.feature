@IntoRegisterPage
Feature: User registers

  @Register
  Scenario Outline: User registers successfully
    Given User opens Lc Waikiki web page
    When  User clicks Giris Yap avatar button
    When  User clicks Uye Ol button in login form
    When  User enters "<registerEmail>" to email input
    When  User enters "<registerPassword>" to password input
    When  User enters "<registerphone>" to phone number input
    When  User fills usage agreement
    When  User clicks Uye Ol button in register form

    Examples:
      |registerEmail|registerPassword|registerphone|
      |ikincimail61@gmail.com|yd998snn13|1111111111           |





