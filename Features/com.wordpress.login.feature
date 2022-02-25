Feature: login into an account 

Scenario Outline: login into an account on wordpress

Given i am on the wordpress homepage 

When i click on the login button 
And i enter "<user_name>"
And i click on the continue button 
And i enter my "<password>"
And i click on the log in button 

Then i am logged into the account sucessfully

Examples: 
| user_name     |  password  | 
| sobia.ilyas34@gmail.com | Sobia12345 |   