Feature: As a user i should be able to fillout the contact us forum from the bottom of the official QUMU homepage

Scenario: User should be able to navigate from homepage to the contact us page and fill it out.

When user opens browser and navigates to the QUMU homepage
Then user clicks on contact us from the bottom of the homepage 
When user fills out all personal information and comments on the contact us page and submits
Then user closes the browser
