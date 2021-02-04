package pages;

import org.openqa.selenium.WebElement;

public class RegistrationPage extends BasePage{

    private String emailFieldTextBox = "//*[@class=\"email-form-element border-bottom\"]//input[@name=\"email\"]";
    private String passswordFieldTextBox = "//*[@class=\"password-form-element border-bottom\"]//input[@name=\"password\"]";
    private String rekaptchaCheckbox = "//*[@class=\"recaptcha-checkbox-borderAnimation\"]";
    private String signUpButton = "//input[@value=\"Sign Up\"]";
    private String errorMessage = "//*[@class=\"err-msg-wrapper\"]";
    private String logInWithGoogle = "//*[@id=\"#registration-google\"]";


    public WebElement getEmailFieldTextBox(){
        return findElement(emailFieldTextBox);
    }
    public WebElement getPasswordFieldTextBox(){
        return findElement(passswordFieldTextBox);
    }
    public WebElement getRekaptchaCheckbox(){
        return findElement(rekaptchaCheckbox);
    }
    public WebElement getSignUpButton(){
        return findElement(signUpButton);
    }
    public WebElement getErrorMessage(){return findElement(errorMessage);}
    public WebElement getLogInWithGoogle() {return findElement(logInWithGoogle);}
}
