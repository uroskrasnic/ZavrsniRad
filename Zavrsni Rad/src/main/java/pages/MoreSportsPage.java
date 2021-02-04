package pages;

import org.openqa.selenium.WebElement;

public class MoreSportsPage extends BasePage{
    private String futsalButton = "//*[@data-sport-id=\"11\"]";

    public WebElement getFutsalButton(){
        return findElement(futsalButton);
    }
}
