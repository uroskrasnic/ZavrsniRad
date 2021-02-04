package pages;

import org.openqa.selenium.WebElement;

 public class SearchPage extends BasePage{
    private String searchBox = "//*[@class=\"input___2S3V1B3\"]";
    private String dropDownAllSports = "//*[@class=\"dropDown dropDown___3zXKhfq \"]";
    private String footballAllSports = "//*[@class=\"dropDown__option  dropDownOption___3xswpEI \" and text()='Football']";
    private String firstResult = "//*[@href=\"/?r=3:SKbpVP5K\"]";

    public WebElement getSearchBox(){
        return findElement(searchBox);
    }
    public WebElement getDropDownAllSports(){
        return findElement(dropDownAllSports);
    }
    public WebElement getFootballAllSports(){
        return findElement(footballAllSports);
    }
    public WebElement getFirstResult(){
        return findElement(firstResult);
    }

}
