package com.codecool.zsana.cocktail;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignUpPage extends BasePage {

    @FindBy(xpath = "//*[@id='input-48']")
    WebElement signUpNameBar;

    @FindBy(xpath = "//*[@id='input-51']")
    WebElement signUpEmailBar;

    @FindBy(xpath = "//*[@id='input-54']")
    WebElement signUpPasswordBar;

    @FindBy(xpath = "//*[@id='input-58']")
    WebElement acceptTermsAndConditionsBtn;

    @FindBy(xpath = "//form[@class='v-form']")
    WebElement signInBtn;

    @FindBy(xpath = "//span[.='Reset Form']")
    WebElement resetFormBtn;

    public SignUpPage(WebDriver driver) {
        super(driver);
    }

}
