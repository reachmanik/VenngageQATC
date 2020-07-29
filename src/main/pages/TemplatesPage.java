public class IndividualTemplatesPage {
	
	private Selenium selenium;
	
	// Add XPaths here
	private signuplink = "/html/body/div[1]/div[2]/div/div[2]/div[2]/div/div/div/div[3]/div/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div/center/div[1]/a/button";
	
	
	public IndividualTemplatesPage(){
		this.selenium = Selenium();
	}
	
	public String signuplinkxpath()
	{
		return signuplink;
	}
	
	// Create a function that clicks on the Sign Up button
	
	
}