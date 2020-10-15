Feature: Login Module Testing
Scenario: Check the login module with valid data
Given Launch the browser
When Login with valid usernme: "demoseller@test.com" and password: "Demo@123"
Then click on login button
Then Browser close