package Pojo.org;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class LoginPojo {
	
	@CacheLookup
	@FindBy(id="email")
	private WebElement emailTxt;

	@CacheLookup
	@FindBy(id="pass")
	private WebElement passTxt;
	
	@CacheLookup
	@FindBy(name="login")
	private WebElement btnlogin;

	public WebElement getEmailTxt() {
		return emailTxt;
	}

	public WebElement getTxtpass() {
		return getTxtpass();
	}

	public WebElement getBtnlogin() {
		return btnlogin;
	}

}
