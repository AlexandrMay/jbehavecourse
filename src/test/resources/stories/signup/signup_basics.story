Narrative:
This story covers basics tests of signup

Lifecycle:
Before:
Given I open signup page

Scenario: Type invalid year
When I set date:
|month|day|year|
|May  |20 |201 |
And I check share
Then I see error "Please enter a valid year."
And I do not see error "When were you born?"


Scenario: Type invalid email
When I type email "test"
And I type confirmation email "wrong"
And I type name "user"
And I click signup
Then I see error "The email address you supplied is invalid."
And I see error "Not exist."

Scenario: Sign up with empty password
Meta: @skip
When I type email "test@mail.test"
And I type confirmation email "test@mail.test"
And I type name "testname"
And I click signup
Then I see error "Please choose a password."

Scenario: Type invalid values
Meta: @skip
When I type email "test"
And I type confirmation email "test@test1.mail"
And I type password "123456"
And I type name "asdqweasd"
And I select sex "Male"
And I uncheck share
And I click signup
Then I see "4" errors
And I see that "3" error has text "When were you born?"