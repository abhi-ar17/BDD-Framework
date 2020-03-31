$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/main/resources/features/BMW_.feature");
formatter.feature({
  "name": "BMW_",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "check power",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "User launches the web browser and Web Site",
  "keyword": "Given "
});
formatter.match({
  "location": "com.bmw.stepdefinition.StepDefinitions.User_launches_the_web_browser_and_Web_Site()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on models",
  "keyword": "When "
});
formatter.match({
  "location": "com.bmw.stepdefinition.StepDefinitions.click_son_models()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User click on series 7 and click on the image",
  "keyword": "Then "
});
formatter.match({
  "location": "com.bmw.stepdefinition.StepDefinitions.selectS()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on technical data",
  "keyword": "Then "
});
formatter.match({
  "location": "com.bmw.stepdefinition.StepDefinitions.techData()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "select each car and check whether power is greater than 500",
  "keyword": "Then "
});
formatter.match({
  "location": "com.bmw.stepdefinition.StepDefinitions.checkPower()"
});
formatter.result({
  "status": "passed"
});
});