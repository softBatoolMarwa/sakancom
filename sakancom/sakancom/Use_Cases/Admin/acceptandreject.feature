  Feature: Scenes of requests for advertisement of housing and the ability to accept and reject it.
 
  Scenario: when  (acceptance)admins request to see advertisement of housing . 
    Given Advertisement of housing
    When  Admin acceptance of the owners request to view the house
    Then  add house in ads and delete house from ad requests.
    
  Scenario:  when (reject)admins request to see advertisement of housing . 
    Given Advertisement of housing
    When Admin reject of the owners request to view the house    
    Then  Delete home from ad requests
    
    
   
   
      