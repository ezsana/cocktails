package com.codecool.zsana.cocktail;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class FridgePage extends BasePage {

    @FindBy(css = "div.v-list--dense > div:nth-of-type(2) .v-list-item__title")
    WebElement checkFridgeLink;

    @FindBy(css = "input")
    WebElement ingredientSearchBar;

    @FindBy(css = "div[aria-labelledby='pepper-list-item-1305'] .v-list-item__title")
    WebElement pepperLinkInList;

    @FindBy(xpath = "//div[@class='ingredient']")
    WebElement pepperLink;

    @FindBy(xpath = "//div[@class='v-select-list v-card theme--dark']//div[@class='v-list-item__content']/div[.='Maraschino Liqueur']")
    WebElement maraschinoLiqueurLinkInList;

    @FindBy(xpath = "//div[@class='v-list-item__content']/div[.='Maraschino Cherry']")
    WebElement maraschinoSherryLinkInList;

    @FindBy(xpath = "//div[@class='v-card__title']")
    WebElement maraschinoPicture;

    @FindBy(css = "#inspire > div.v-application--wrap > main > div > div > div:nth-child(3) > div > div.v-card__title")
    WebElement picture;

    @FindBy(xpath = "//div[@class='container']/div[.='Maraschino Cherry']")
    WebElement maraschinoSherryLink;

    @FindBy(css = ".ingredient")
    WebElement maraschinoLiqueurLink;

    @FindBy(xpath = "//*[@id='inspire']/div[2]/main/div/div/div[3]")
    WebElement pictureContainer;


    public FridgePage(WebDriver driver) {
        super(driver);
    }

    void goToFridgePage() {
        checkFridgeLink.click();
    }

    void clickOnIngredientSearchBar() {
        try {
            ingredientSearchBar.click();
        } catch (Exception ex) {
            ingredientSearchBar.click();
        }
    }

    boolean isDropdownListAppearing() {
        goToFridgePage();
        clickOnIngredientSearchBar();
        return pepperLinkInList.getText().equals("Pepper");
    }

    boolean isIngredientShown(WebElement element1, WebElement element2) {
        goToFridgePage();
        clickOnIngredientSearchBar();
        element1.click();
        return element2.isDisplayed();
    }

    boolean isIngredientShownUsingKeyboard(String ingredient, WebElement element) {
        goToFridgePage();
        clickOnIngredientSearchBar();
        ingredientSearchBar.sendKeys(ingredient);
        ingredientSearchBar.sendKeys(Keys.ENTER);
        try {
            element.isDisplayed();
            return true;

        } catch (Exception e) {
            return false;
        }
    }

    boolean isCocktailShown(WebElement element1, String cocktailName) {
        goToFridgePage();
        clickOnIngredientSearchBar();
        element1.click();
        return picture.getText().equals(cocktailName);
    }

    void chooseIngredients(WebElement element1, WebElement element2) {
        goToFridgePage();
        clickOnIngredientSearchBar();
        element1.click();
        clickOnIngredientSearchBar();
        element2.click();
    }

    boolean isCocktailShownWithTwoIngredients(WebElement element1, WebElement element2, String cocktailName) {
        chooseIngredients(element1, element2);
        return maraschinoPicture.getText().equals(cocktailName);
    }

    boolean didIngredientLinkDisappear() {
        chooseIngredients(maraschinoLiqueurLinkInList, maraschinoSherryLinkInList);
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        maraschinoSherryLink.click();
        try {
            maraschinoSherryLink.isDisplayed();
            return false;
        } catch (Exception ex) {
            return true;
        }
    }

    boolean didAllCocktailDisappearedFromScreen() {
        chooseIngredients(maraschinoLiqueurLinkInList, maraschinoSherryLinkInList);
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        maraschinoSherryLink.click();
        maraschinoLiqueurLink.click();
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        try {
            pictureContainer.isDisplayed();
            return false;
        } catch (Exception ex) {
            return true;
        }
    }

}
