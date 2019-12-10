package com.codecool.zsana.cocktail;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/** Homepage for the logged-in users */

public class SignedInHomePage extends BasePage {

    @FindBy(xpath = "//span[.='About']")
    WebElement aboutBtn;

    @FindBy(xpath = "//button[@class='v-btn v-btn--flat v-btn--text theme--dark v-size--large']")
    WebElement logoutBtn;

    @FindBy(xpath = "//div[@class='v-content__wrap']//div[2]//div[@class='v-responsive__content']")
    WebElement a1CocktailPicture;

    @FindBy(xpath = "//*[@id='input-40']")
    WebElement cocktailSearchBar;

    @FindBy(xpath = "//span[.='Check cocktail']")
    WebElement checkCocktailBtn;

    @FindBy(xpath = "//div[@class='v-select-list v-card theme--dark']//div[@class='v-list-item__content']/div[.='A1']")
    WebElement a1CocktailLinkFromSearchBar;

    public SignedInHomePage(WebDriver driver) {
        super(driver);
    }

}
