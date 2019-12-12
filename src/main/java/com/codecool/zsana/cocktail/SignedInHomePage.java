package com.codecool.zsana.cocktail;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.concurrent.TimeUnit;

/** Homepage for the logged-in users */

public class SignedInHomePage extends BasePage {

    @FindBy(xpath = "//span[@id='welcome']")
    WebElement welcomeMessage;

    @FindBy(xpath = "//span[.='About']")
    WebElement aboutBtn;

    @FindBy(xpath = "//button[@class='v-btn v-btn--flat v-btn--text theme--dark v-size--large']")
    WebElement logoutBtn;

    @FindBy(xpath = "//div[@class='v-content__wrap']//div[2]//div[@class='v-responsive__content']")
    WebElement a1CocktailPicture;

    @FindBy(xpath = "//span[.='Check cocktail']")
    WebElement checkCocktailBtn;

    @FindBy(xpath = "//*[@id='input-39']")
    WebElement cocktailSearchBar;

    @FindBy(xpath = "//div[@class='v-select-list v-card theme--dark']//div[@class='v-list-item__content']/div[.='A1']")
    WebElement a1CocktailLinkFromSearchBar;

    @FindBy(xpath = "//div[@class='v-list v-sheet v-sheet--tile theme--dark v-list--dense']//div[@class='v-list-item__content']/div[.='Check Fridge']")
    WebElement checkFridgeLink;

    String a1PageUrl = "http://localhost:8081/cocktail/A1";

    public SignedInHomePage(WebDriver driver) {
        super(driver);
    }

    void clickOnLogoutBtn() {
        logoutBtn.click();
    }

    void clickOna1Picture() {
        a1CocktailPicture.click();
    }

    boolean isUserOna1Page() {
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        return driver.getCurrentUrl().equals(a1PageUrl);
    }

}
