package com.codecool.zsana.cocktail;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignInPage extends BasePage {

    @FindBy(xpath = "//*[@id='input-69']")
    WebElement signInNameBar;

    @FindBy(xpath = "//*[@id='input-72']")
    WebElement signInPasswordBar;

    @FindBy(xpath = "//button[@class='mr-4 v-btn v-btn--contained theme--dark v-size--default success']")
    WebElement submitLoginBtn;

    public SignInPage(WebDriver driver) {
        super(driver);
    }

}
