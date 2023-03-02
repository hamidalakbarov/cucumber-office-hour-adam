package com.cydeo.pages.librarian;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Librarian_UsersPage extends LibrarianBasePage{

    @FindBy(xpath = "//a[.=' Add User']")
    public WebElement addUserButton;

    @FindBy(name = "full_name")
    public WebElement fullNameInput;

    @FindBy(name = "password")
    public WebElement passwordInput;

    @FindBy(name = "email")
    public WebElement emailInput;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement saveChangesButton;

    @FindBy(css = "div.toast-message")
    public WebElement message;

    @FindBy(xpath = "//a[.='Log Out']")
    public WebElement logOutButton;
}
