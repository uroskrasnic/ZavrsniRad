package stepDefinitions;

import browser.Browser;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.ChromeDriverManager;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.FlashScore;

public class RegistrationStep {
    private static FlashScore FlashScore;

    @Before
    public void setup() {
        FlashScore = new FlashScore();
        ChromeDriverManager.chromedriver().setup();
        Browser.getBrowser().manage().window().maximize();
        Browser.getBrowser().get("https://www.flashscore.com/");
    }

    @Given("^that user clicks on Accept on Privacy$")
    public void thatUserClicksOnAcceptOnPrivacy() {

        FlashScore.indexPage().getCookieButton().click();
    }

    @And("^that user clicks on registration button$")
    public void thatUserClicksOnRegistrationButton() {

        FlashScore.indexPage().getRegistrationButton().click();
    }

    @And("^fill the email field with valid data$")
    public void fillTheEmailFieldWithValidData() {
        FlashScore.registrationPage().getEmailFieldTextBox().sendKeys("urosk@yopmail.com");
    }

    @And("^fill the password field with minimum (\\d+) characters$")
    public void fillThePasswordFieldWithMinimumCharacters(int arg0) {
        FlashScore.registrationPage().getPasswordFieldTextBox().sendKeys("Test1234");
    }

    @And("^click on Sign up$")
    public void clickOnSignUp() {
        WebDriverWait wait = new WebDriverWait(Browser.getBrowser(), 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@value=\"Sign Up\"]")));

        FlashScore.registrationPage().getSignUpButton().click();
    }

    @Then("^error messagge is displeyed$")
    public void errorMessaggeIsDispleyed() {
        Assert.assertEquals("Please confirm you are not a robot.", FlashScore.registrationPage().getErrorMessage().getText());
        FlashScore.registrationPage().getErrorMessage().getText();
    }

    @And("^user click on Log In button$")
    public void userClickOnLogInButton() {
        FlashScore.indexPage().getLogInButton().click();
    }


    @And("^user click on Log In$")
    public void userClickOnLogIn() {
        FlashScore.logInPage().getLogInButt().click();
    }

    @Then("^user is logged in$")
    public void userIsLoggedIn() {
        WebDriverWait wait = new WebDriverWait(Browser.getBrowser(), 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class=\"email\"]")));
        Assert.assertEquals("uroskrasnic@yahoo.com",FlashScore.indexPage().getUserName().getText());

    }


    @And("^that user click on Search button$")
    public void thatUserClickOnSearchButton() {
        FlashScore.indexPage().getSearchButton().click();
    }

    @And("^type into Search box 'Barcelona'$")
    public void typeIntoSearchBoxBarcelona() {
        FlashScore.searchPage().getSearchBox().sendKeys("Barcelona");
    }

    @And("^get the first result$")
    public void getTheFirstResult() {
        WebDriverWait wait = new WebDriverWait(Browser.getBrowser(), 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@href=\"/?r=3:SKbpVP5K\"]")));
        FlashScore.searchPage().getFirstResult().click();

    }

    @Then("^team name from header match team name from search box$")
    public void teamNameFromHeaderMatchTeamNameFromSearchBox() {
        Assert.assertEquals("Barcelona",FlashScore.indexPage().getTeamName().getText());
    }

    @Given("^that user clicks on More button$")
    public void thatUserClicksOnMoreButton() {
        FlashScore.indexPage().getMoreSportsButton().click();
    }

    @And("^choose from more sports Futsal$")
    public void chooseFromMoreSportsFutsal() {
        FlashScore.moreSportsPage().getFutsalButton().click();
    }

    @Then("^user should be redirected to Futsal page$")
    public void userShouldBeRedirectedToFutsalPage() {
       Assert.assertEquals("Futsal",FlashScore.futsalPage().getSportNameFutsal().getText());}

    @And("^then user clicks on Champions League button$")
    public void thenUserClicksOnChampionsLeagueButton() {

        FlashScore.indexPage().getChampionsLeagueButton().click();

    }

    @And("^user clicks on Archive page$")
    public void userClicksOnArchivePage() {
        WebDriverWait wait = new WebDriverWait(Browser.getBrowser(), 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@href=\"/football/europe/champions-league/archive/\"]")));
        FlashScore.championsLeaguePage().getArchiveBox().click();
    }

    @Then("^Check the Champions League winner in season (\\d+)/(\\d+)$")
    public void checkTheChampionsLeagueWinnerInSeason(int arg0, int arg1) {
        Assert.assertEquals("Champions League 2011/2012",FlashScore.archivePage().getSeason11_12().getText());
        Assert.assertEquals("Chelsea",FlashScore.archivePage().getChelsea().getText());
    }


    @And("^fill the (.*) box with valid data$")
    public void fillTheEmailBoxWithValidData(String email) {
        FlashScore.logInPage().getEmailFieldText().sendKeys(email);

    }


    @And("^fill the (.*) box with proper password$")
    public void fillThePasswordBoxWithProperPassword(String password) {
        FlashScore.logInPage().getPasswordTextBox().sendKeys(password);
    }

    @Then("^proper (.*) is shown on header section$")
    public void properProfileNameIsShownOnHeaderSection(String profilName) { WebDriverWait wait = new WebDriverWait(Browser.getBrowser(), 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"lsid-dropdown\"]")));


        Assert.assertEquals(profilName,FlashScore.indexPage().getUserName().getText());

    }

    @When("^user click on profile name button$")
    public void userClickOnProfileNameButton() {
        FlashScore.indexPage().getUserName().click();

    }

    @And("^click on Sign out button$")
    public void clickOnSignOutButton() {
        FlashScore.indexPage().getLogOutButton().click();
        Browser.getBrowser().switchTo().alert().accept();
    }

    @Then("^user is logged out\\.$")
    public void userIsLoggedOut() {
        Assert.assertEquals("REGISTRATION",FlashScore.indexPage().getRegistrationButton().getText());
    }
}
