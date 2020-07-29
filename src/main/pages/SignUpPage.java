public class SignUpPage {
	
	private Selenium selenium;
	
	// Add XPaths here
	private static final String firstNameInput = "/html/body/div[1]/div/div/div/div[2]/div[2]/form/div[1]/div/div[1]/input";
	private static final String lastNameInput = "//*[@id=\"user_last_name\"]";
	private static final String email = "//*[@id=\"user_email\"]";
	private static final String password = "//*[@id=\"user_password\"]";
	private static final String Clicksignupbutton = "//*[@id=\"btn_register\"]"
	
	private static Templateslink = "/html/body/div[1]/div[2]/nav/div/div[3]/ul/li[1]/a";
	
	
	
	public SignUpPage(){
		this.selenium = Selenium();
	}
	
	public String Templateslinkxpath()
	{
		return Templateslink;
	}
	
	public String firstNameInput()
	{
		return firstNameInput;
	}
	public String lastNameInput()
	{
		return lastNameInput;
	}
	public String email()
	{
		return email;
	}
	public String password()
	{
		return password;
	}
	
	public String Clicksignupbutton()
	{
		return Clicksignupbutton;
	}
	
	// Create a function that takes an Account and simulates signing up using Selenium actions. (Refer to Selenium.java)
	
	
}