 Feature: Watching reservations via the system
 
 
  Scenario: when admins request to reservations via the system
    Given reservations via the system
    When  admins request to see  reservations via the system
    Then  View the reservations id house and name tenent
    