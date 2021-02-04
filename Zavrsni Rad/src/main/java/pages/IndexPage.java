package pages;

import org.openqa.selenium.WebElement;

public class IndexPage extends BasePage{
    private String logInButton = "//*[@id=\"signIn\"]";
    private String registrationButton = "//*[@id=\"registration\"]";
    private String searchButton = "//*[@id=\"search-window\"]";
    private String moreSportsButton = "//*[@class=\"menuMinority__title\"]";
    private String championsLeagueButton = "//*[@title=\"EUROPE: Champions League\"]";
    private String futsalOtherSport = "//*[@class=\"sportIcon sportIcon--futsal\"]";
    private String userName = "//*[@id=\"lsid-dropdown\"]";
    private String teamName = "//*[@class=\"teamHeader__name\"]";
    private String cookieButton = "//*[@id=\"onetrust-accept-btn-handler\"]";
    private String logOutButton = "//*[@id=\"lsid-sign-out\"]";

    public WebElement getLogInButton(){return findElement(logInButton);}
    public WebElement getRegistrationButton(){return findElement(registrationButton);}
    public WebElement getSearchButton(){return findElement(searchButton);}
    public WebElement getMoreSportsButton(){return findElement(moreSportsButton);}
    public WebElement getChampionsLeagueButton(){return findElement(championsLeagueButton);}
    public WebElement getFutsalOtherSport(){return findElement(futsalOtherSport);}
    public WebElement getUserName(){return findElement(userName);}
    public WebElement getTeamName(){return findElement(teamName);}
    public WebElement getCookieButton(){return findElement(cookieButton);}
    public WebElement getLogOutButton() {return findElement(logOutButton);}

}
