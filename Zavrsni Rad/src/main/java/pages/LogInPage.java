package pages;

import org.openqa.selenium.WebElement;

public class LogInPage extends BasePage{

 public String emailFieldText = "//*[@class=\"email-form-element border-bottom\"]//input[@name=\"email\"]";
 public String passwordTextBox = "//*[@class=\"password-form-element border-bottom\"]//input[@name=\"password\"]";
 public String logInButt = "//input[@value=\"Log In\"]";


 public WebElement getEmailFieldText(){return findElement(emailFieldText);}
 public WebElement getPasswordTextBox(){return findElement(passwordTextBox);}
 public WebElement getLogInButt(){return findElement(logInButt);}


}
