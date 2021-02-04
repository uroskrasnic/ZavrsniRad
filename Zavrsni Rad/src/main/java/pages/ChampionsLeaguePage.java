package pages;

import org.openqa.selenium.WebElement;

public class ChampionsLeaguePage extends BasePage{
    private String archiveBox = "//*[@href=\"/football/europe/champions-league/archive/\"]";


    public WebElement getArchiveBox(){
        return findElement(archiveBox);
    }


}
