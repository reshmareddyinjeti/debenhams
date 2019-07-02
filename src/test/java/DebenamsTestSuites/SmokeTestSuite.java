package DebenamsTestSuites;

import PageObjects.RegistrationPage;
import PageObjects.ResultsPage;
import org.junit.Test;

public class SmokeTestSuite extends Hooks{
    private RegistrationPage registrationPage=new RegistrationPage();
private ResultsPage resultsPage=new ResultsPage();

    @Test
    public void createAccount(){
        registrationPage.createAccount("reshmareddyinjeti@gmail.com","sandipani555");

    }
    @Test
    public void size(){
        resultsPage.WomenSection("10");


    }
    @Test
    public void categories(){
        resultsPage.selectCustomerCategire("Dresses");

    }
}
