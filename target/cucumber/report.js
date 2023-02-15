$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("features/NewAccount.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "#Author: your.email@your.domain.com"
    },
    {
      "line": 2,
      "value": "#Keywords Summary :"
    },
    {
      "line": 3,
      "value": "#Feature: List of scenarios."
    },
    {
      "line": 4,
      "value": "#Scenario: Business rule through list of steps with arguments."
    },
    {
      "line": 5,
      "value": "#Given: Some precondition step"
    },
    {
      "line": 6,
      "value": "#When: Some key actions"
    },
    {
      "line": 7,
      "value": "#Then: To observe outcomes or validation"
    },
    {
      "line": 8,
      "value": "#And,But: To enumerate more Given,When,Then steps"
    },
    {
      "line": 9,
      "value": "#Scenario Outline: List of steps for data-driven as an Examples and \u003cplaceholder\u003e"
    },
    {
      "line": 10,
      "value": "#Examples: Container for s table"
    },
    {
      "line": 11,
      "value": "#Background: List of steps run before each of the scenarios"
    },
    {
      "line": 12,
      "value": "#\"\"\" (Doc Strings)"
    },
    {
      "line": 13,
      "value": "#| (Data Tables)"
    },
    {
      "line": 14,
      "value": "#@ (Tags/Labels):To group Scenarios"
    },
    {
      "line": 15,
      "value": "#\u003c\u003e (placeholder)"
    },
    {
      "line": 16,
      "value": "#\"\""
    },
    {
      "line": 17,
      "value": "## (Comments)"
    },
    {
      "line": 18,
      "value": "#Sample Feature Definition Template"
    }
  ],
  "line": 21,
  "name": "Techfios bank and cash New Account Functionality",
  "description": "",
  "id": "techfios-bank-and-cash-new-account-functionality",
  "keyword": "Feature",
  "tags": [
    {
      "line": 20,
      "name": "@Smoke"
    }
  ]
});
formatter.scenario({
  "line": 23,
  "name": "User should be able to login with valid credentials",
  "description": "and open a new account",
  "id": "techfios-bank-and-cash-new-account-functionality;user-should-be-able-to-login-with-valid-credentials",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 25,
  "name": "User is on the techfios login page",
  "keyword": "Given "
});
formatter.step({
  "line": 26,
  "name": "User enters the \"\u003cusername\u003e\" in \"Username\" field",
  "keyword": "When "
});
formatter.step({
  "line": 27,
  "name": "User enters the \"\u003cpassword\u003e\" in \"Password\" field",
  "keyword": "When "
});
formatter.step({
  "line": 28,
  "name": "User clicks on \"\u003clogin\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 29,
  "name": "User should land on Dashboard page",
  "keyword": "Then "
});
formatter.step({
  "line": 30,
  "name": "User clicks on \"\u003cbankCash\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 31,
  "name": "User clicks on \"\u003cnewAccount\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 32,
  "name": "User enters \"\u003caccountTitle\u003e\" in accounts page",
  "keyword": "And "
});
formatter.step({
  "line": 33,
  "name": "User enters \"\u003cdescription\u003e\" in accounts page",
  "keyword": "And "
});
formatter.step({
  "line": 34,
  "name": "User enters \"\u003cinitialBalance\u003e\" in accounts page",
  "keyword": "And "
});
formatter.step({
  "line": 35,
  "name": "User enters \"\u003caccountNumber\u003e\" in accounts page",
  "keyword": "And "
});
formatter.step({
  "line": 36,
  "name": "User enters \"\u003ccontactPerson\u003e\" in accounts page",
  "keyword": "And "
});
formatter.step({
  "line": 37,
  "name": "User enters \"\u003cPhone\u003e\" in accounts page",
  "keyword": "And "
});
formatter.step({
  "line": 38,
  "name": "User enters \"\u003caccountTitle\u003e\" in accounts page",
  "keyword": "And "
});
formatter.step({
  "line": 39,
  "name": "User enters \"\u003cinternetBankingURL\u003e\" in accounts page",
  "keyword": "And "
});
formatter.step({
  "line": 40,
  "name": "User clicks on \"\u003cnewAccount\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 41,
  "name": "User should be able to validate account created successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "NAStepDefinitions.user_is_on_the_techfios_login_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({
  "arguments": [
    {
      "val": "\u003clogin\u003e",
      "offset": 16
    }
  ],
  "location": "NAStepDefinitions.user_clicks_on(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "NAStepDefinitions.user_should_land_on_Dashboard_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "\u003cbankCash\u003e",
      "offset": 16
    }
  ],
  "location": "NAStepDefinitions.user_clicks_on(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "\u003cnewAccount\u003e",
      "offset": 16
    }
  ],
  "location": "NAStepDefinitions.user_clicks_on(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "\u003caccountTitle\u003e",
      "offset": 13
    }
  ],
  "location": "NAStepDefinitions.user_enters_in_accounts_page(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "\u003cdescription\u003e",
      "offset": 13
    }
  ],
  "location": "NAStepDefinitions.user_enters_in_accounts_page(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "\u003cinitialBalance\u003e",
      "offset": 13
    }
  ],
  "location": "NAStepDefinitions.user_enters_in_accounts_page(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "\u003caccountNumber\u003e",
      "offset": 13
    }
  ],
  "location": "NAStepDefinitions.user_enters_in_accounts_page(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "\u003ccontactPerson\u003e",
      "offset": 13
    }
  ],
  "location": "NAStepDefinitions.user_enters_in_accounts_page(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "\u003cPhone\u003e",
      "offset": 13
    }
  ],
  "location": "NAStepDefinitions.user_enters_in_accounts_page(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "\u003caccountTitle\u003e",
      "offset": 13
    }
  ],
  "location": "NAStepDefinitions.user_enters_in_accounts_page(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "\u003cinternetBankingURL\u003e",
      "offset": 13
    }
  ],
  "location": "NAStepDefinitions.user_enters_in_accounts_page(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "\u003cnewAccount\u003e",
      "offset": 16
    }
  ],
  "location": "NAStepDefinitions.user_clicks_on(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "NAStepDefinitions.user_should_be_able_to_validate_account_created_successfully()"
});
formatter.result({
  "status": "skipped"
});
});