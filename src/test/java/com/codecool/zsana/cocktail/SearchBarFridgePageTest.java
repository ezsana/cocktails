package com.codecool.zsana.cocktail;

import org.junit.jupiter.api.*;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class SearchBarFridgePageTest extends BasePageTest {

    private FridgePage fridgePage;
    private SignInPage signInPage;
    private SignedInHomePage signedInHomePage;

    @BeforeAll
    void setupTests() {
        super.setUp();
        fridgePage = new FridgePage(getDriver());
        signInPage = new SignInPage(getDriver());
        signedInHomePage = new SignedInHomePage(getDriver());
        signInPage.validLogin();
        fridgePage.goToFridgePage();
    }

    @AfterAll
    void tearDown() {
        signedInHomePage.clickOnLogoutBtn();
        super.shutDown();
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

    @Test
    void isIngredientShown() {
        Assertions.assertTrue(fridgePage.isIngredientShown(fridgePage.pepperLinkInList, fridgePage.pepperLink));
    }

    /**
     * Scenario: clicking on ingredient, cocktails containing this ingredient appear on page
     *     @GIVEN that user clicked in the search bar
     *     @WHEN user clicks on an ingredient
     *     @THEN cocktails are shown on page
     */

    @Test
    void isCocktailShown() {
        Assertions.assertTrue(fridgePage.isCocktailShown(fridgePage.pepperLinkInList, "Duchamp's Punch"));
    }

    /**
     * Scenario: more than one ingredient - with two ingredient in this scenario
     *     @GIVEN user clicked in the search bar
     *     @WHEN that user chooses two different ingredients
     *     @THEN only those cocktails can be seen which are containing those ingredients
     */

    @Test
    void areAdherentCocktailsSeen() {
        Assertions.assertTrue(fridgePage.isCocktailShownWithTwoIngredients(fridgePage.maraschinoLiqueurLinkInList, fridgePage.maraschinoSherryLinkInList, "Brooklyn"));
    }

    /**
     * Scenario: searching is possible by using keyboard
     *     @GIVEN that user clicked in the search bar
     *     @WHEN user types ingredient
     *     @AND presses enter
     *     @THEN cocktails containing that ingredient are shown
     */

    @Test
    void isSearchPossibleUsingKeyboard() {
        Assertions.assertFalse(fridgePage.isIngredientShownUsingKeyboard("pepper", fridgePage.pepperLink));
    }

    /**
     * Scenario: user able to delete ingredient from the list
     *     @GIVEN that there are more (two) ingredients in the list
     *     @WHEN user clicks one of them
     *     @THEN the clicked ingredient is not anymore in the list, only one remains
     */

    @Test
    void isIngredientDisappearing() {
        Assertions.assertTrue(fridgePage.didIngredientLinkDisappear());
    }

    /**
     * Scenario: when user deletes all ingredient, all of the pictures disappears
     *     @Given that there are more (two) ingredients in the list
     *     @WHEN user clicks on all of them
     *     @THEN all cocktail pictures disappears from the page
     */

    @Test
    void areAllPicturesDeletedFromScreen() {
        Assertions.assertTrue(fridgePage.didAllCocktailDisappearedFromScreen());
    }
}
