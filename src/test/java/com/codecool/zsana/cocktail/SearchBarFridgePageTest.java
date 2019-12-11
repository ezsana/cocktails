package com.codecool.zsana.cocktail;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class SearchBarFridgePageTest extends BasePageTest {

    FridgePage fridgePage;
    SignInPage signInPage;

    @BeforeAll
    void setupTests() {
        super.setUp();
        fridgePage = new FridgePage(getDriver());
        signInPage = new SignInPage(getDriver());
        signInPage.validLogin();
        fridgePage.goToFridgePage();
    }

    /**
     * Scenario: on homepage user clicks in search bar and sees all ingredients
     *     @GIVEN that user is on fridge page
     *     @WHEN user clicks in the search bar of ingredients
     *     @THEN user can see all ingredients in a drop-down list
     */

    @Test
    void doesDropDownListAppear() {
        Assertions.assertTrue(fridgePage.isDropdownListAppearing());
    }


    /**
     * Scenario: clicking on ingredient, ingredient appears under search bar
     *     @GIVEN that user clicked in the search bar
     *     @WHEN user clicks on an ingredient
     *     @THEN ingredient is shown under search bar
     */


}
