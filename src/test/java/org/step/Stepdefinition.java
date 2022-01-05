package org.step;

import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class Stepdefinition extends BaseClass {

	
	
	Pom p;
	@Given("I am on a Adactin page on Chrome Browser")
	public void i_am_on_a_Adactin_page_on_Chrome_Browser() {
	    setDriver();
	    launch("https://adactinhotelapp.com/");
	}

	@When("I need to enter Username and Password")
	public void i_need_to_enter_Username_and_Password(io.cucumber.datatable.DataTable dataTable) {
	    
		List<Map<String,String>> asMaps = dataTable.asMaps();
		String string = asMaps.get(0).get("Username");
		String string2 = asMaps.get(0).get("Password");
		p = new Pom();
		WebElement userName = p.getUserName();
		sendK(userName, string);
		WebElement password = p.getPassword();
		sendK(password, string2);
	}

	@When("I need to click Login button")
	public void i_need_to_click_Login_button() {
	    WebElement loginbut = p.getLoginbut();
	    buttonCl(loginbut);
	}

	@Then("I need to verify the Home page Screen appear or not")
	public void i_need_to_verify_the_Home_page_Screen_appear_or_not() {
	   System.out.println("Adactin page logged in");
	}

	@When("I need to select Location , Hotel , Room Type , No of rooms")
	public void i_need_to_select_Location_Hotel_Room_Type_No_of_rooms(io.cucumber.datatable.DataTable dataTable) {
	   List<String> asList = dataTable.asList();
	   String string = asList.get(0);
	   String string2 = asList.get(1);
	   String string3 = asList.get(2);
	   
	   //WebElement findElement = driver.findElement(By.id("location_span"));
	  // WebElement location = p.getLocation();
	   //String attribute = location.getAttribute("value");
   WebElement location = p.getLocation();
	   sendK(location, string);
	   
	   WebElement hotel = p.getHotel();
	   sendK(hotel, string2);
	   WebElement roomType = p.getRoomType();
	   sendK(roomType, string3);
     String string4 = asList.get(3);

  
	   WebElement roomNoos = p.getRoomNoos();
	   sendK(roomNoos, string4);
	   
	   
	  
	}

	@When("Enter checkin date and Checkout date")
	public void enter_checkin_date_and_Checkout_date(io.cucumber.datatable.DataTable dataTable) {
	    Map<String, String> asMap = dataTable.asMap(String.class, String.class);
	    String string = asMap.get("checkin date");
	    String string2 = asMap.get("Checkout date");
	    
   WebElement date = p.getDate();
	    date.clear();
	    sendK(date, string);
	    WebElement dateo = p.getDateo();
	    dateo.clear();
	    sendK(dateo, string2);
	}

	@Then("I need to select Adults per room and Childrens per room")
	public void i_need_to_select_Adults_per_room_and_Childrens_per_room(io.cucumber.datatable.DataTable dataTable) {
	    List<List<String>> asLists = dataTable.asLists();
	    String string = asLists.get(0).get(1);
	   String string2 = asLists.get(1).get(1);
	   
	    WebElement adult = p.getAdult();
	    sendK(adult, string);
	    WebElement child = p.getChild();
	    sendK(child, string2);
	    
	}

	@Then("I need to click Search button")
	public void i_need_to_click_Search_button() {
	    WebElement search = p.getSearch();
	    buttonCl(search);
	   // WebElement att = driver.findElement(By.xpath("//span[@id='location_span']"));
	    //String text = att.getText();
	    //System.out.println(text);
	    //Assert.assertEquals(text, "Please Select a Location");
	   // System.out.println("error message validated");
	}

	
	@Then("I need to verify whether browser navigated to payment page")
	public void i_need_to_verify_whether_browser_navigated_to_payment_page() {
	    System.out.println("page navigated");
	}

	@When("I need to select the booking and click continue")
	public void i_need_to_select_the_booking_and_click_continue() {
	    WebElement findElement = driver.findElement(By.id("radiobutton_0"));
	    findElement.click();
	    WebElement cont = p.getCont();
	    buttonCl(cont);
	}

	@Then("I need to check browser navigated to next page")
	public void i_need_to_check_browser_navigated_to_next_page() {
	    System.out.println("navigated to 3rd page");
	}

	@When("I need to enter Firstname , lastname , Address and Credit Card No")
	public void i_need_to_enter_Firstname_lastname_Address_and_Credit_Card_No(io.cucumber.datatable.DataTable dataTable) {
	   List<Map<String,String>> asMaps = dataTable.asMaps();
	   String string = asMaps.get(0).get("Firstname");
	   String string2 = asMaps.get(0).get("lastname");
	   String string3 = asMaps.get(0).get("Address");
	   String string4 = asMaps.get(0).get("Credit Card No");
	   
	   WebElement firstname = p.getFirstname();
	   sendK(firstname, string);
	   WebElement lastname = p.getLastname();
	   sendK(lastname, string2);
	   WebElement address = p.getAddress();
	   sendK(address, string3);
	   WebElement ccnum = p.getCcnum();
	   sendK(ccnum, string4);
	}

	@When("Select card type , Expiry date and Expiry year")
	public void select_card_type_Expiry_date_and_Expiry_year(io.cucumber.datatable.DataTable dataTable) {
	    List<List<String>> asLists = dataTable.asLists();
	    String string = asLists.get(1).get(0);
	    String string2 = asLists.get(1).get(1);
	    String string3 = asLists.get(1).get(2);
	    WebElement cctype = p.getCctype();
	    sendK(cctype, string);
	    WebElement expmonth = p.getExpmonth();
	    sendK(expmonth, string2);
	    WebElement expyear = p.getExpyear();
	    sendK(expyear, string3);
	}

	@Then("I need to enter Cvv no and click book now")
	public void i_need_to_enter_Cvv_no_and_click_book_now(io.cucumber.datatable.DataTable dataTable) {
	    Map<String, String> asMap = dataTable.asMap(String.class, String.class);
	    String string = asMap.get("Cvv no");
	    WebElement cvv = p.getCvv();
	    sendK(cvv, string);
	    WebElement booknow = p.getBooknow();
	    booknow.click();
	    
	}

	@When("I need to click itenarary and navigte to next page")
	public void i_need_to_click_itenarary_and_navigte_to_next_page() throws InterruptedException {
	    Thread.sleep(6000);
	    WebElement itinerary = p.getItinerary();
	    itinerary.click();
	}

	@When("Need to print the ID")
	public void need_to_print_the_ID() {
//	    WebElement clickall = p.getClickall();
//	    clickall.click();
//	    WebElement cancelall = p.getCancelall();
//	    cancelall.click();
//	    simpleAlert();
	}
}
