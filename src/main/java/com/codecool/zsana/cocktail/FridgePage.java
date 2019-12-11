package com.codecool.zsana.cocktail;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FridgePage extends BasePage {

    @FindBy(xpath = "//div[@class='v-list v-sheet v-sheet--tile theme--dark v-list--dense']//div[@class='v-list-item__content']/div[.='Check Fridge']")
    WebElement checkFridgeLink;

    @FindBy(xpath = "//*[@id='input-40']")
    WebElement ingredientSearchBar;

    @FindBy(xpath = "//*[@id=\"list-1299\"]")
    WebElement ingredientDropDownList;


    public FridgePage(WebDriver driver) {
        super(driver);
    }

    void goToFridgePage() {
        checkFridgeLink.click();
    }

    void clickOnIngredientSearchBar() {
        ingredientSearchBar.click();
    }

    boolean isDropdownListAppearing() {
        clickOnIngredientSearchBar();
        return ingredientDropDownList.isDisplayed();
    }


}
