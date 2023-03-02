package com.cydeo.pages.librarian;

import com.cydeo.utilities.ConfigurationReader;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Librarian_LoginPage extends LibrarianBasePage{

    @FindBy(id = "inputEmail")
    public WebElement emailInput;

    @FindBy(id = "inputPassword")
    public WebElement passwordInput;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement signInButton;

    public void login(String user) {
        String userEmail = ConfigurationReader.getProperty(user + "_username");
        String userPassword = ConfigurationReader.getProperty(user+"_password");
        emailInput.sendKeys(userEmail);
        passwordInput.sendKeys(userPassword);
        signInButton.click();
    }

    public void login(String username, String password) {
        emailInput.sendKeys(username);
        passwordInput.sendKeys(password);
        signInButton.click();
    }
}
