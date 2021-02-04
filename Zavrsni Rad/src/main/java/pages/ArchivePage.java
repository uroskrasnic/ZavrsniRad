package pages;

import org.openqa.selenium.WebElement;

public class ArchivePage extends BasePage{
    private String season11_12 = "//*[@href=\"/football/europe/champions-league-2011-2012/\"]";
    private String chelsea = "//*[@href=\"/team/chelsea/4fGZN2oK/\"]";

    public WebElement getSeason11_12(){
        return findElement(season11_12);
    }
    public WebElement getChelsea(){
        return findElement(chelsea);
    }
}
