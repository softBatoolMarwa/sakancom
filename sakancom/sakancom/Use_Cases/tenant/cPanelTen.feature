 Feature: Control Panel for tenant
  Scenario: when tenant request own Control Panel.
    Given user name for tenant
    When  tenant request own Control Panel.
    Then  It will show His personal data,The name of the residence owner and his contact information,When the rent is paid (time to pay).
    
   