public class TestSignUp {
	
	private Account account;
	private SignUpPage signUpPage;
	
	@Before
	public void setUp(){
		// Instantiate page objects here
		SignUpPage sup = new SignUpPage();
		TemplatesPage tp = new TemplatesPage();
		Selenium ss = new Selenium();
		Account aa = new Account("QA","Test","qa.manik@venngage.com","123456");
		aa.
	}
	
	@Test
	public void testSignUp(){
		// Write test steps here
		
		ss.goToUrl("https://venngage.com/");
		ss.clickByXpath(sup.templateslinkxpath());
		ss.clickByXpath(tp.signuplinkxpath());
		
		ss.sendkeys(sup.firstNameInput(),aa.fstname());
		ss.sendkeys(sup.lastNameInput(),aa.lstname());
		ss.sendkeys(sup.email(),aa.email());
		ss.sendkeys(sup.password(),aa.password());
		
		ss.clickByXpath(Clicksignupbutton());
		
	}
}
