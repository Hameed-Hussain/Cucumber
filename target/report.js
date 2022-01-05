$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/datatable.feature");
formatter.feature({
  "name": "Validating all Functions of Adactin Application",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Validating login function of AdactIn with Valid Username and Valid Password",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@sanity"
    }
  ]
});
formatter.step({
  "name": "I am on a Adactin page on Chrome Browser",
  "keyword": "Given "
});
formatter.match({
  "location": "Stepdefinition.i_am_on_a_Adactin_page_on_Chrome_Browser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I need to enter Username and Password",
  "rows": [
    {
      "cells": [
        "Username",
        "Password"
      ]
    },
    {
      "cells": [
        "Hameeddd",
        "Hameeddd"
      ]
    }
  ],
  "keyword": "When "
});
formatter.match({
  "location": "Stepdefinition.i_need_to_enter_Username_and_Password(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I need to click Login button",
  "keyword": "And "
});
formatter.match({
  "location": "Stepdefinition.i_need_to_click_Login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I need to verify the Home page Screen appear or not",
  "keyword": "Then "
});
formatter.match({
  "location": "Stepdefinition.i_need_to_verify_the_Home_page_Screen_appear_or_not()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I need to select Location , Hotel , Room Type , No of rooms",
  "rows": [
    {
      "cells": [
        "London",
        "Hotel Cornice",
        "Super Deluxe",
        "1 - One"
      ]
    }
  ],
  "keyword": "When "
});
formatter.match({
  "location": "Stepdefinition.i_need_to_select_Location_Hotel_Room_Type_No_of_rooms(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter checkin date and Checkout date",
  "rows": [
    {
      "cells": [
        "checkin date",
        "18/12/2021"
      ]
    },
    {
      "cells": [
        "Checkout date",
        "23/12/2021"
      ]
    }
  ],
  "keyword": "And "
});
formatter.match({
  "location": "Stepdefinition.enter_checkin_date_and_Checkout_date(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I need to select Adults per room and Childrens per room",
  "rows": [
    {
      "cells": [
        "Adults per room",
        "4 - Four"
      ]
    },
    {
      "cells": [
        "Childrens per room",
        "1 - One"
      ]
    }
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "Stepdefinition.i_need_to_select_Adults_per_room_and_Childrens_per_room(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I need to click Search button",
  "keyword": "And "
});
formatter.match({
  "location": "Stepdefinition.i_need_to_click_Search_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I need to verify whether browser navigated to payment page",
  "keyword": "Then "
});
formatter.match({
  "location": "Stepdefinition.i_need_to_verify_whether_browser_navigated_to_payment_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I need to select the booking and click continue",
  "keyword": "When "
});
formatter.match({
  "location": "Stepdefinition.i_need_to_select_the_booking_and_click_continue()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I need to check browser navigated to next page",
  "keyword": "Then "
});
formatter.match({
  "location": "Stepdefinition.i_need_to_check_browser_navigated_to_next_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I need to enter Firstname , lastname , Address and Credit Card No",
  "rows": [
    {
      "cells": [
        "Firstname",
        "lastname",
        "Address",
        "Credit Card No"
      ]
    },
    {
      "cells": [
        "Hameed",
        "Hussain",
        "Pudupet",
        "7894789478947894"
      ]
    }
  ],
  "keyword": "When "
});
formatter.match({
  "location": "Stepdefinition.i_need_to_enter_Firstname_lastname_Address_and_Credit_Card_No(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Select card type , Expiry date and Expiry year",
  "rows": [
    {
      "cells": [
        "Select card type",
        "Expiry date",
        "Expiry year"
      ]
    },
    {
      "cells": [
        "VISA",
        "June",
        "2022"
      ]
    }
  ],
  "keyword": "And "
});
formatter.match({
  "location": "Stepdefinition.select_card_type_Expiry_date_and_Expiry_year(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I need to enter Cvv no and click book now",
  "rows": [
    {
      "cells": [
        "Cvv no",
        "123"
      ]
    }
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "Stepdefinition.i_need_to_enter_Cvv_no_and_click_book_now(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I need to check browser navigated to next page",
  "keyword": "Then "
});
formatter.match({
  "location": "Stepdefinition.i_need_to_check_browser_navigated_to_next_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I need to click itenarary and navigte to next page",
  "keyword": "When "
});
formatter.match({
  "location": "Stepdefinition.i_need_to_click_itenarary_and_navigte_to_next_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Need to print the ID",
  "keyword": "When "
});
formatter.match({
  "location": "Stepdefinition.need_to_print_the_ID()"
});
formatter.result({
  "status": "passed"
});
});