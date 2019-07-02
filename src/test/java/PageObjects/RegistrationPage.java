package PageObjects;

import DebenamsTestSuites.Hooks;
import org.openqa.selenium.By;

public class RegistrationPage extends Hooks {
    public void createAccount(String mail,String pass)
    {
     driver.findElement(By.linkText("Create Account/Sign In")) .click();
    driver. findElement(By.name("logonId")).sendKeys(mail);
    driver.findElement(By.name("logonPassword")).sendKeys(pass);
}

}
