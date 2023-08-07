  Feature: show furniture.
 
  Scenario: when  the tenant want to show his furniture  
    Given user name for tenant
    When  the tenant have some used furniture and he want to sell it
    Then  the furniture will appear.
    
    
    Scenario:  
    Given user name for tenant
    When  the tenant have not some used furniture
    Then   nothing will appear.