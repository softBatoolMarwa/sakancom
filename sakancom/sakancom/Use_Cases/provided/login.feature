Feature: Login  
Background: login
Given : I have a username and a password from the user (admin/owner/tenant)
Scenario: owner True-> uname and True-> password
    When The username begin with (owner) word and username and password is correct .
    Then i can log in the system as an owner and The owner menu will appear
Scenario: owner True-> uname and False-> password
    When The username begin with (owner) word and username is  correct and password not correct  .
    Then The login menu will appear again
Scenario: owner False-> uname
    When The username begin with (owner) word and username is not correct  .
    Then The login menu will appear again
############
Scenario: admin True-> uname and True-> password
    When The username begin with (admin) word and username and password is correct .
    Then i can log in the system as an admin and The owner menu will appear
Scenario: admin True-> uname and False-> password
    When The username begin with (admin) word and username is  correct and password not correct  .
    Then The login menu will appear again
Scenario: admin False-> uname
    When The username begin with (admin) word and username is not correct  .
    Then The login menu will appear again
################ 
Scenario: tenant True-> uname and True-> password
    When The username begin with (tenant) word and username and password is correct .
    Then i can log in the system as an tenant and The owner menu will appear
Scenario: tenant True-> uname and False-> password
    When The username begin with (tenant) word and username is  correct and password not correct  .
    Then The login menu will appear again
Scenario: tenant False-> uname
    When The username begin with (tenant) word and username is not correct  .
    Then The login menu will appear again
############## 
Scenario: Decid what the role from the username
    When  the user is not signed up
    Then then no menu will appear