#Autor :  Paulo Velarde

  @stories
  Feature: Academy Choucair
    As a user, I want to learn how to automate in screamplay at the Choucair Academt with the automation course
  @scenario1
  Scenario: Search for a automation course
    Given than brandom wants to learn automation at the academy Choucair
    |strUser|strPassword|
    |youUser>|youPassword|
    When he search for the course  on the choucair academy platform
    |strCourse             |
    |metodology Bancolombia|
    Then he finds the course called resources
    |strCourse|
    |metodology Bancolombia|
