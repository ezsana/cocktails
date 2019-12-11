package com.codecool.zsana.cocktail;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/** Homepage for not logged-in users - the starter page */

public class InitialHomePage extends BasePage {

    String cocktailUrl = "http://localhost:8081/";

    @FindBy(xpath = "//i[@class='v-icon notranslate mdi mdi-menu theme--dark']")
    WebElement menuIconWithStripes;

    @FindBy(xpath = "//span[@id='welcome']")
    WebElement welcomeMessage;

    @FindBy(xpath = "//span[.='Sign up']")
    WebElement signUpBtn;

    @FindBy(xpath = "//span[.='Login']")
    WebElement loginBtn;

    @FindBy(xpath = "//*[@id=\"input-39\"]")
    WebElement cocktailSearchBar;

    @FindBy(xpath = "//button[@class='v-btn v-btn--contained theme--dark v-size--default']")
    WebElement checkCocktailBtn;

    @FindBy(xpath = "//div[@class='v-list v-sheet v-sheet--tile theme--dark v-list--dense']//div[@class='v-list-item__content']/div[.='Check Fridge']")
    WebElement checkFridgeLink;

    public InitialHomePage(WebDriver driver) {
        super(driver);
    }

}
