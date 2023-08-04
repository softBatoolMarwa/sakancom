Feature: If the tenant requests to reserve an apartment and there is room in this apartment
 
  Scenario: If the tenant requests to reserve an apartment and there is room in this apartment
    Given Id
    When  tenant requests to reserve an apartment and there is room in this apartment
    Then This apartment will be booked
  
  
   Scenario: If the tenant requests to book an apartment and there is no space in this apartment
    Given Id
    When tenant requests to book an apartment and there is no space in this apartment
    Then It will show that this apartment is booked
   