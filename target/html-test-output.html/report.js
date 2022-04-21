$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/login.feature");
formatter.feature({
  "name": "User Login",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Successful Login",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "I am on the login page",
  "keyword": "Given "
});
formatter.match({
  "location": "login_steps.i_am_on_the_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I enter correct email and password",
  "keyword": "When "
});
formatter.match({
  "location": "login_steps.i_enter_correct_email_and_password()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should be able to login successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "login_steps.i_should_be_able_to_login_successfully()"
});
formatter.result({
  "status": "passed"
});
formatter.uri("src/test/resources/register.feature");
formatter.feature({
  "name": "User Registration",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "User Signs up successfully",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "I am on the register page",
  "keyword": "Given "
});
formatter.match({
  "location": "register_steps.i_am_on_the_register_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I enter correct first name, last name, email, phone, country, state, zipcode, password, and confirm password",
  "keyword": "When "
});
formatter.match({
  "location": "register_steps.i_enter_correct_first_name_last_name_email_phone_country_state_zipcode_password_and_confirm_password()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on the register button",
  "keyword": "And "
});
formatter.match({
  "location": "register_steps.i_click_on_the_register_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should be able to register successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "register_steps.i_should_be_able_to_register_successfully()"
});
formatter.result({
  "status": "passed"
});
});