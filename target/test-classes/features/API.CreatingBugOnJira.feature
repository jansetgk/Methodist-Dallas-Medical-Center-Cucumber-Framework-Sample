Feature: Creating Bug Ticket on Jira
Background:
Given user generates seasion ID

@APITEST
Scenario: Create a bug ticket on Jira
Given user calls createIssue API
When User retrieves response 
Then status code is 201

@APITEST
Scenario: Add comment to the bug recently created
Given user calls addComment API
When User retrieves the comment response 
Then status code for comment is 201