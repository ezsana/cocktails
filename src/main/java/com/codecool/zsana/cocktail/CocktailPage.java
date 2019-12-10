package com.codecool.zsana.cocktail;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CocktailPage extends BasePage {

    @FindBy(xpath = "//*[@id='inspire']/div/main/div/div/div/div[1]/div/div/table")
    WebElement cocktailDetailsTable;

    @FindBy(xpath = "//*[@id='inspire']/div/main/div/div/div/div[1]/div/div/table/tbody/tr[7]/td[2]")
    WebElement ratingRowInTable;

    @FindBy(xpath = "//div[@class='v-responsive v-image grey lighten-2']/div[@class='v-responsive__content']")
    WebElement cocktailPictureOnCocktailPage;

    @FindBy(xpath = "//div[@class='v-rating']/i[3]")
    WebElement thirdStarInRating;

    @FindBy(xpath = "//button[@class='mr-2 v-btn v-btn--contained theme--dark v-size--default']")
    WebElement ratingBtn;

    @FindBy(xpath = "//*[@id='inspire']/div/main/div/div/div/div[3]/div/div/table/tbody/tr[1]/td/form/div[2]/div")
    WebElement commentSection;

    @FindBy(xpath = "//*[@id='inspire']/div/main/div/div/div/div[3]/div/div/table/tbody/tr[3]")
    WebElement commentRow;

    @FindBy(xpath = "//*[@id=\"inspire\"]/div/main/div/div/div/div[3]/div/div/table/tbody/tr[3]/td/tbody/tr/td[3]/div")
    WebElement ratingInCommentRow;

    public CocktailPage(WebDriver driver) {
        super(driver);
    }

}
