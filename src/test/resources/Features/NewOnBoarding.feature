Feature: HRMS Tools  functionality verifications

  Scenario Outline: HRMS Tools Start OnBoarding Functionality
  
    Given employee on Login page 
    When Enter Emp_userName "<UserEmail>" 
    And Enter Emp_PassWord "<password>" 
    Then Enter login Button  
    Then click on Dashboard link 
    Then click on Onboarding link and start onboarding
    Then Click on save and continue
 
        
   
   Examples: 
      | UserEmail  | password | 
      | jitendra@singhsoft.com  |  123Yadav@ | 