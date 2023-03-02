package com.cydeo.step_definitions;

import com.cydeo.pages.librarian.Librarian_HomePage;
import com.cydeo.pages.librarian.Librarian_LoginPage;
import com.cydeo.pages.librarian.Librarian_UsersPage;
import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class AddUser_StepDefs {

    Librarian_LoginPage libraryLoginPage = new Librarian_LoginPage();
    Librarian_HomePage librarianHomePage = new Librarian_HomePage();

    Librarian_UsersPage librarian_usersPage = new Librarian_UsersPage();

    @Given("the {string} on the home page")
    public void the_on_the_home_page(String user) {
        Driver.getDriver().get(ConfigurationReader.getProperty("libraryURL"));
        libraryLoginPage.login(user);
    }
    @Given("the librarian navigates to {string} page")
    public void the_librarian_navigates_to_page(String page) {
        librarianHomePage.navigateTo(page);

    }
    @When("the librarian clicks to Add User")
    public void the_librarian_clicks_to_add_user() {
        librarian_usersPage.addUserButton.click();

    }
    @When("the librarian enters full name {string}")
    public void the_librarian_enters_full_name(String fullName) {
        librarian_usersPage.fullNameInput.sendKeys(fullName);
    }
    @When("the librarian enters password {string}")
    public void the_librarian_enters_password(String password) {
        librarian_usersPage.passwordInput.sendKeys(password);
    }
    @When("the librarian enters email {string}")
    public void the_librarian_enters_email(String email) {
        librarian_usersPage.emailInput.sendKeys(email);
    }
    @When("the librarian clicks to save changes")
    public void the_librarian_clicks_to_save_changes() {
        librarian_usersPage.saveChangesButton.click();
    }
    @Then("verify {string} message is displayed")
    public void verify_message_is_displayed(String message) {
        Assert.assertEquals(message, librarian_usersPage.message.getText());
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));
        wait.until(ExpectedConditions.invisibilityOf(librarian_usersPage.message));
        librarian_usersPage.dropdown.click();
        librarian_usersPage.logOutButton.click();
    }
    @Then("verify created user with {string} and {string} able to login")
    public void verify_created_user_with_and_able_to_login(String username, String password) {
        libraryLoginPage.login(username,password);
    }
    @Then("verify created user should be able to see {string}")
    public void verify_created_user_should_be_able_to_see(String name) {
        Assert.assertEquals(name,librarianHomePage.dropdown.getText());
    }
    @Then("created user should be deleted from library")
    public void created_user_should_be_deleted_from_library() {

    }




}
