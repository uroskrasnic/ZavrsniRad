package pages;

public class FlashScore {
    private IndexPage indexPage;
    private RegistrationPage registrationPage;
    private LogInPage logInPage;
    private SearchPage searchPage;
    private FutsalPage futsalPage;
    private ChampionsLeaguePage championsLeaguePage;
    private EmailValidation emailValidation;
    private MoreSportsPage moreSportsPage;
    private ArchivePage archivePage;


    public IndexPage indexPage(){
        if (indexPage == null){
            indexPage = new IndexPage();
        }
        return indexPage;
    }

    public RegistrationPage registrationPage(){
        if (registrationPage == null){
            registrationPage = new RegistrationPage();
        }
        return registrationPage;
    }

    public LogInPage logInPage(){
        if (logInPage==null){
            logInPage = new LogInPage();
        }
        return logInPage;
    }

    public SearchPage searchPage(){
        if (searchPage==null){
            searchPage=new SearchPage();
        }
        return searchPage;
    }

    public FutsalPage futsalPage(){
        if (futsalPage == null){
            futsalPage = new FutsalPage();
        }
        return futsalPage;
    }


    public ChampionsLeaguePage championsLeaguePage(){
        if (championsLeaguePage==null){
            championsLeaguePage = new ChampionsLeaguePage();
        }
        return championsLeaguePage;
    }
    public EmailValidation emailValidation(){
        if (emailValidation==null){
            emailValidation = new EmailValidation();
        }
        return emailValidation;
    }
    public MoreSportsPage moreSportsPage(){
        if (moreSportsPage==null){
            moreSportsPage=new MoreSportsPage();
        }
        return moreSportsPage;
    }
    public ArchivePage archivePage(){
        if (archivePage==null){
            archivePage=new ArchivePage();
        }
        return archivePage;
    }

}


