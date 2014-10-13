$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("com/infoplus/grc/accelus/regint/bdd/heroku/heroku.feature");
formatter.feature({
  "id": "click-on-link-in-heroku-page",
  "tags": [
    {
      "name": "@heroku",
      "line": 1
    }
  ],
  "description": "AS A User\nI WANT TO to click on click here in Heroku page \nSO THAT another browser window opens",
  "name": "Click on Link in Heroku Page",
  "keyword": "Feature",
  "line": 2
});
formatter.before({
  "duration": 355349353,
  "status": "passed"
});
formatter.scenario({
  "id": "click-on-link-in-heroku-page;a-user-click-on-click-here-on-heroku-page",
  "description": "",
  "name": "A user click on click here on heroku page",
  "keyword": "Scenario",
  "line": 7,
  "type": "scenario"
});
formatter.step({
  "name": "I am on Multiple Windows page of herokuapp website",
  "keyword": "Given ",
  "line": 8
});
formatter.step({
  "name": "I click on Click Here",
  "keyword": "When ",
  "line": 9
});
formatter.step({
  "name": "another browser tab window opens",
  "keyword": "Then ",
  "line": 10
});
formatter.match({
  "location": "HerokuStepDef.navigateToHeroku()"
});
formatter.result({
  "duration": 7389707910,
  "status": "passed"
});
formatter.match({
  "location": "HerokuStepDef.I_click_on_Click_Here()"
});
formatter.result({
  "duration": 5000842565,
  "status": "passed"
});
formatter.match({
  "location": "HerokuStepDef.another_browser_tab_window_opens()"
});
formatter.result({
  "duration": 8660108198,
  "status": "passed"
});
formatter.after({
  "duration": 69562,
  "status": "passed"
});
});