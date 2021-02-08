# TrueCar

My framework uses Selenium Webdriver for browser automation, Maven for dependencies and Junit for starting tests and assertions. It is a BDD framework, which uses Cucumber
to write tests in feature files using Gherkin language which makes it easy to read. When I run the tests from the command line, HTML reports are generated with exact steps from the
 feature file.

I used Page Object Model design structure in order to keep my code organized and clean. 
Separate Java classes (pages package) are created for each page of the application where web elements of that page as well as related methods are stored.
Implemented step definitions are kept in separate classes in stepDefs package.
TestRunner class is in runner package.
Utils package has classes for reusable codes, driver class and report class.
Feature files are kept under resources.
