
  Scenario: view the available housing
    Given tenants wants to see available homes
    When tenants enters the number 1
    Then view all the available housing
    
      Scenario: There are no homes available
    Given tenants wants to see available homes
    When tenants enters the number 1
    Then shows a warning message telling me that there are no available homes

