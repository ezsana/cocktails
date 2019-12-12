package com.codecool.zsana.cocktail;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignInPage extends BasePage {

    private String validPassword = System.getenv("VALID_PASSWORD");
    private String validUserName = System.getenv("VALID_USERNAME");
    private String invalidPassword = System.getenv("INVALID_PASSWORD");
    private String invalidUsername = System.getenv("INVALID_USERNAME");

    String loginUrl = "http://localhost:8081/login"; // this changes!!!

    @FindBy(css = "input[type='text']")
    WebElement signInNameBar;

    @FindBy(css = "input[type='password']")
    WebElement signInPasswordBar;

    @FindBy(css = "button.mr-4 > .v-btn__content")
    WebElement submitLoginBtn;

    public SignInPage(WebDriver driver) {
        super(driver);
    }

    void validLogin() {
        driver.navigate().to(loginUrl);
        signInNameBar.sendKeys(validUserName);
        signInPasswordBar.sendKeys(validPassword);
        submitLoginBtn.click();
    }

    boolean hasNameAppearedInWelcomeMessage(SignedInHomePage signedInHomePage) {
        return signedInHomePage.welcomeMessage.getText().equals("Welcome " + validUserName);
    }
/*
    boolean areCocktailsSeenInSearchBar(SignedInHomePage signedInHomePage) {
        return signedInHomePage.cocktailSearchBar.
    }
*/
}
