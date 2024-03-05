package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	WebDriver driver;

	public LoginPage(WebDriver Rriver)
	{
		driver = Rriver;
		PageFactory.initElements(Rriver, this);
	}
	
	@FindBy(id="Email")
	WebElement email;
	
	@FindBy(id="Password")
	WebElement password;
	
	
	@FindBy(xpath = "//button[@class=\"button-1 login-button\"]")
	WebElement LoginButton;
	
	@FindBy(linkText = "Logout")
	WebElement Logout;


	
	
	public void Enteremailaddress(String emailadd)
	{
		email.clear();
		email.sendKeys(emailadd);
	}
	
	public void EnterePassword(String passwordadd)
	{
		password.clear();
		password.sendKeys(passwordadd);
	}
	
	public void ClickLoginButton()
	{
		LoginButton.click();
	}
	
	public void ClickLogout()
	{
		Logout.click();
	}
}
