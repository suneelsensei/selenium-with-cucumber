package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class usingpomacheivedetails {
	
	By ele_username = By.name("username");
	
	By ele_password = By.name("password");
	
	By ele_signin = By.xpath("//*[text()='Sign In Securely']");
	
	
	WebDriver driver;
	
	public usingpomacheivedetails(WebDriver driver) {
		this.driver=driver;
	}
	
	public void enterusername(String username) {
		driver.findElement(ele_username).sendKeys(username);
	}
	
	public void enterpassword(String password) {
		driver.findElement(ele_password).sendKeys(password);
	}
	
	public void clickonsignin() {
		driver.findElement(ele_signin).click();
	}
	
	public void credentials(String username,String password) {
		driver.findElement(ele_username).sendKeys(username);
		driver.findElement(ele_password).sendKeys(password);
		driver.findElement(ele_signin).click();
	}

}
