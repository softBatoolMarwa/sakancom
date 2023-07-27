 Feature: add housing
 
  Scenario: when owner request to add housing.
    Given infomation about the house.
    When owner add new house
    Then  the house added to housing array to go into admin
    
    
    
      Scenario: when owner request to add housing.
    Given infomation about the house.
    When owner add existing  house
    Then  A message will appear that this house already exists
    
    