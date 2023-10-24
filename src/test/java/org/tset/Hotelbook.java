package org.tset;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.sun.activation.viewers.TextEditor;

public class Hotelbook extends BaseClass {

	public static void main(String[] args) throws InterruptedException {
		Hotelbook hotel = new Hotelbook();
		hotel.Hotelbook();
	}

	

	public void Hotelbook() throws InterruptedException {
		browserConfigChrome();
		openUrl("https://omrbranch.com/");
		maximize();
		implicitWait();

		WebElement txtUserName = locateById("email");
		inputText(txtUserName, "westlymatthew738@gmail.com");

		WebElement txtPassword = locateById("pass");
		inputText(txtPassword, "Dragon@11");
	

		WebElement btnlogin = locateByXpath("//button[text()='Login']");
		click(btnlogin);
		
		
		WebElement txtFrame1 = locateById("hotelsearch_iframe");
		frameByWebElement(txtFrame1);

		WebElement btnSearch2 = locateByXpath("//button[@class='btn filter_btn']");
		click(btnSearch2);
		
		returnFromFrame();
		
		WebElement txtError = locateById("invalid-state");
		String error1 = getText(txtError);
		System.out.println(error1);
		
		WebElement txtError1 = locateById("invalid-city");
		String error2 = getText(txtError1);
		System.out.println(error2);
		
		WebElement txtError2 = locateById("invalid-check_in");
		String error3 = getText(txtError2);
		System.out.println(error3);
		
		WebElement txtError3= locateById("invalid-check_out");
		String error4 = getText(txtError3);
		System.out.println(error4);
		
		WebElement txtError4 = locateById("invalid-no_rooms");
		String error5 = getText(txtError4);
		System.out.println(error5);
		
		WebElement txtError5 = locateById("invalid-no_adults");
		String error6 = getText(txtError5);
		System.out.println(error6);
		
		Thread.sleep(5000);

		WebElement txtstate = locateById("state");
		selectOptionbyIndex(txtstate, 5);
		
		WebElement txtCity = locateByXpath("//span[text()='Select City *']");
		click(txtCity);

		WebElement txtSelectCity = locateByXpath("//li[text()='Chennai']");
		click(txtSelectCity);

		WebElement roomid = locateById("room_type");
		selectOptionbyValue(roomid, "Standard");
		selectOptionbyValue(roomid, "Deluxe");
		selectOptionbyText(roomid, "Suite");
		selectOptionbyValue(roomid, "Luxury");
		selectOptionbyValue(roomid, "Studio");

		WebElement txtDate = locateByName("check_in");
		click(txtDate);
		WebElement selectDate = locateByXpath("//a[text()='16']");
		click(selectDate);

		WebElement txtDateout = locateByName("check_out");
		click(txtDateout);
		WebElement selectDateOut = locateByXpath("//a[text()='18']");
		click(selectDateOut);

		WebElement txtRoomNo = locateById("no_rooms");
		selectOptionbyIndex(txtRoomNo, 2);

		WebElement txtAdults = locateByName("no_adults");
		selectOptionbyIndex(txtAdults, 2);

		WebElement txtFrame2 = locateById("hotelsearch_iframe");
		frameByWebElement(txtFrame2);

		WebElement btnSearch1 = locateByXpath("//button[text()='Search']");
	
		click(btnSearch1);
		
		WebElement nameAcscenting = locateByXpath("//label[text()='Name Ascending']");
		click(nameAcscenting);
		Thread.sleep(9000);
	
		List<WebElement> findElements = driver.findElements(By.xpath("//div[@class='col-md-5 hotel-suites']//h5"));
		
		 
		 
		 for (int i = 0; i <findElements.size() ; i++) {
			        
			 WebElement element = findElements.get(i);
			 String text2 = element.getText();
			 List li = new ArrayList();
			 li.add(text2);
		     
		     
		     
		    
		    
		
		}
		 
		 
		
		 List<WebElement> prize = driver.findElements(By.xpath("//div[@class='prize']//strong"));
		 for (int i = 0; i < prize.size(); i++) {
			 WebElement element = prize.get(i);
			 String text3 = element.getText();
			 
			 
			
		}
		
		 
        
		WebElement txtSelectHotel = locateByXpath("//h5[text()='Select Hotel']");
		String text3 = getText(txtSelectHotel);
		System.out.println(text3);

		WebElement txtHotelName = locateByXpath("//h5[text()='Hyatt Regency Chennai Suite']");
		String text4 = getText(txtHotelName);
		System.out.println(text4);

		WebElement txtPrice = locateByXpath("//h2[text()='$ 1,300']");
		String text5 = getText(txtPrice);
		System.out.println(text5);

		WebElement txtContinue = locateByXpath("(//a[text()='Continue'])[1]");
		click(txtContinue);
		Thread.sleep(5000);
		simpleAlert();
		WebElement btnSelf = locateByXpath("//input[@value='own']");
		click(btnSelf);

		WebElement txtUserTittle = locateById("user_title");
		selectOptionbyIndex(txtUserTittle, 1);

		WebElement txtFirstName = locateById("first_name");
		sendText(txtFirstName, "WESTLY");

		WebElement txtLastName = locateById("last_name");
		sendText(txtLastName, "MATTHEW");

		WebElement txtPhone = locateById("user_phone");
		sendText(txtPhone, "8248374434");

		WebElement txtEmail = locateById("user_email");
		sendText(txtEmail, "westlymatthew738@gmail.com");

		WebElement checkboxGST = locateById("gst");
		click(checkboxGST);

		WebElement txtGSTNo = locateById("gst_registration");
		sendText(txtGSTNo, "9043592058");

		WebElement txtCompany = locateById("company_name");
		sendText(txtCompany, "Greens Tech OMR Branch");

		WebElement txtAddress = locateById("company_address");
		sendText(txtAddress, "Thoraipakkam");

		WebElement btnNext = locateById("step1next");
		click(btnNext);

		WebElement txtHighFloor = locateById("high");
		click(txtHighFloor);

		WebElement btnNext1 = locateById("step2next");
		click(btnNext1);

		WebElement btnPayment = locateByXpath("//h5[text()='Credit/Debit/ATM Card']");
		click(btnPayment);

		WebElement txtPayment = locateById("payment_type");
		selectOptionbyIndex(txtPayment, 1);

		WebElement txtCardType = locateById("card_type");
		selectOptionbyIndex(txtCardType, 1);

		WebElement txtCardNo = locateById("card_no");
		sendText(txtCardNo, "5555555555552222");

		WebElement txtCardName = locateById("card_name");
		sendText(txtCardName, "Matthew");

		WebElement txtCardMonth = locateById("card_month");
		selectOptionbyText(txtCardMonth, "April");

		WebElement txtCardYear = locateById("card_year");
		selectOptionbyText(txtCardYear, "2026");

		WebElement txtCVV = locateById("cvv");
		sendText(txtCVV, "345");

		WebElement btnSubmit = locateById("submitBtn");
		click(btnSubmit);
		WebElement txtCode = locateByXpath("//h2[@class='couppon-code']");
		String text6 = getText(txtCode);
		String id = text6.substring(0, 11);
		String cancelId = text6.substring(1, 11);
		System.out.println(id);
		String BookConfirmed = text6.substring(12);
		System.out.println(BookConfirmed);

		WebElement btnGoToHome = locateByXpath("(//button[@class='btn filter_btn'])[1]");
		click(btnGoToHome);

		WebElement btnWelcome = locateByXpath("(//a[@data-toggle='dropdown'])[1]");
		click(btnWelcome);

		WebElement btnMyAccount = locateByXpath("//a[text()='My Account']");
		click(btnMyAccount);

		WebElement btnEdit = locateByXpath("//button[text()='Edit']");
		click(btnEdit);

		WebElement txtDateChange = locateByXpath("//input[@name='check_in']");
		click(txtDateChange);

		WebElement txtDateChangeIn = locateByXpath("//a[text()='17']");
		click(txtDateChangeIn);

		WebElement txtDateChange1 = locateByXpath("//input[@name='check_out']");
		click(txtDateChange1);

		WebElement txtDateChangeOut = locateByXpath("//a[text()='22']");
		click(txtDateChangeOut);
		WebElement btnconform = locateByXpath("//button[text()='Confirm']");
		click(btnconform);

		WebElement txtsuccess = locateByXpath("//li[text()='Booking updated successfully']");
		String text7 = getText(txtsuccess);
		System.out.println(text7);

		WebElement txtSearch = locateByXpath("//input[@name='search']");
		sendText(txtSearch, cancelId);

		WebElement btnCancel = locateByXpath("(//a[text()='Cancel'])[1]");
		click(btnCancel);

		simpleAlert();

		Thread.sleep(3000);
		WebElement txtcancel = locateByClassName("alertMsg");
		String text = getText(txtcancel);
		System.out.println(text);
		
		
		
		
		
		
		
		
		

	}
}
