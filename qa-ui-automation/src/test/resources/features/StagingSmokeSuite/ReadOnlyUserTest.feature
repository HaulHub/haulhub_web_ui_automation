@tag
Feature: Read-Only User Test

  @Read-Only
  Scenario Outline: Check accessibility in main navigation for the Read-only user
    Given readOnlyUser Login to the application with valid <userName> and <password>
    And I search for ReadOnlycustomer <ROcustomername> and login to the customers portal
    When I Check Im navigated to Job Board page
    Then I check available access to the Read-only user

    Examples:
      | userName | password                 | ROcustomername |
      | vignesh  | 0$B4h1rn3XG_gZS+mF-PitDf | vigneshcompany |
