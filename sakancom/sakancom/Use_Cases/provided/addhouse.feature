 Feature: add housing
 
  Scenario: when owner request to add housing.
    Given infomation about the house.
    When owner add new house
    Then  the house added to housing array to go into admin

Scenario: when owner request to add housing.
    Given infomation about the house.
    When owner add existing  house
    Then  A message will appear that this house already exists
    
  Scenario: when admin add housing.(admin)
    Given infomation about the house.(admin)
    When admin add new house(admin)
    Then  the house added (admin)
 Scenario: when admin request to add housing.(admin)2
    Given infomation about the house.(admin)2
    When admin add existing  house(admin)2
    Then  A message will appear that this house already exists(admin)2
    
    