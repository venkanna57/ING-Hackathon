$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/java/com/hcl/ing/feature/GetData.feature");
formatter.feature({
  "name": "Get different data based on ticker names",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Get different data based on ticker names test scenario",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@APITest"
    }
  ]
});
formatter.step({
  "name": "GetBase URL for Get Operations",
  "keyword": "Given "
});
formatter.match({
  "location": "com.hcl.ing.stepdefination.GetDataAPI.getbase_URL_for_Get_Operations()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Send the Request for Get Operations",
  "keyword": "When "
});
formatter.match({
  "location": "com.hcl.ing.stepdefination.GetDataAPI.send_the_Request_for_Get_Operations()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Validate the Get Operations",
  "keyword": "Then "
});
formatter.match({
  "location": "com.hcl.ing.stepdefination.GetDataAPI.validate_the_Get_Operations()"
});
formatter.result({
  "status": "passed"
});
});