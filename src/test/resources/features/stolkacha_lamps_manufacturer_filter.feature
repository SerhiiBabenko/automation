Feature: Lamps Manufacturer Filter

  @regression
  Scenario Outline: select <manufacturer> filter
    Given a user is on the Lamps page
    When user select <manufacturer> filter item
    Then all product titles correspond to the selected manufacturer
Examples:
          | manufacturer |
          | Philips |
          | Narva  |
          | Brevia  |
          | Solar  |