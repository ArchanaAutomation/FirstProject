package FrameworkDataDriven;

public class Objclass {

	public static void main(String[] args) {
		CommonClassFW obj= new CommonClassFW();
		obj.browserlaunch("chrome");
		obj.url("https://www.linkedin.com");
		obj.max();
		obj.sendvalue("xpath", "//*[@id='session_key']", "9952509843");
		obj.sendvalue("xpath", "//*[@id='session_password']", "Archana0897");
		obj.clickaction("xpath", "//*[@class='sign-in-form__submit-button']");
	}

}
