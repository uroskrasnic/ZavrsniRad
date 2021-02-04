package pages;

import org.openqa.selenium.WebElement;

public class EmailValidation extends BasePage{
    private String confimationMail = "//*[@class=\"message\" and text()=\"Please check your mailbox and confirm your registration.\"]";

    public WebElement getConfirmationMail(){ return findElement(confimationMail);}

}
