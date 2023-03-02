package com.cydeo.pages.librarian;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public abstract class LibrarianBasePage{

    public LibrarianBasePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    public void navigateTo(String page) {
        WebElement linkToPage = Driver.getDriver().findElement(By.xpath("//span[.='" + page + "']"));
        linkToPage.click();
    }

    @FindBy(xpath = "//a[@data-toggle='dropdown']")
    public WebElement dropdown;



}
