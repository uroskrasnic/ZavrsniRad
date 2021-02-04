package pages;


import org.openqa.selenium.WebElement;

public class FutsalPage extends BasePage {
    private String sportNameFutsal = "//*[@class=\"tournament\"]";

    public WebElement getSportNameFutsal(){return findElement(sportNameFutsal);}
}
