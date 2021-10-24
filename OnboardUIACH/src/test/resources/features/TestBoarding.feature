@ACHWorkflow
Feature: Verify Onboarding application

  Scenario: SC_01_Launching Test boarding application
    Given user launch the given test boarding application
      | URL                                                                           |
      | https://test-boarding.na.bambora.com/?id=37374ee2-b3e0-42ef-b08f-43807edc0d1f |
    Then bambora log should be displayed
    And Then Begin Application button should be "disabled"
    When selects consent application as "Yes"
    Then Then Begin Application button should be "enabled"
    And click on "Begin Application"

  Scenario Outline: SC_02_Enter Business information details
    Then user should be able to see the "We need the business's registered address"
    When user enter the business information details
      | address   | address_line2   | city   | state   | zip_code   | website_url   |
      | <address> | <address_line2> | <city> | <state> | <zip_code> | <website_url> |
    Then Next button should be enabled
    And click on "Next"
    Then Business information circle should be filled

    Examples:
      | address    | address_line2 | city | state  | zip_code | website_url      |
      | 5TH AVENUE | ROCKVILLE     | US   | Alaska |          | testboarding.com |
      | 5TH AVENUE | ROCKVILLE     | US   | Alaska | 55090    | testboarding.com |

  Scenario: SC_03_Enter Business category details
    And user should be able to see the "We need to know your business registration details"
    And user enter the business category details
      | business_name | legal_business_name | entity_type | registration_location | business_number | business_start_date | anual_sales | bank_acc_name | bank_routing | bank_acc | ach_frequency | ach_avg_amount | ach_max_amount |
      | testing       | testing             | Corporation | US                    | 12345           | 01/01/2000          | 200000      | testbank      | 123456789    | 12345    | Biweekly        | 2000           | 4000           |
    And click on "Next"
    Then Business category circle should be filled
