package com.codecool.zsana.cocktail;

import org.junit.jupiter.api.*;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class CocktailPictureTest extends BasePageTest {

    private SignInPage signInPage;
    private SignedInHomePage signedInHomePage;

    @BeforeAll
    void setupTests() {
        super.setUp();
        signInPage = new SignInPage(getDriver());
        signedInHomePage = new SignedInHomePage(getDriver());
        signInPage.validLogin();
    }

    @AfterAll
    void tearDown() {
        signedInHomePage.clickOnLogoutBtn();
        super.shutDown();
    }

    /**
     * Scenario: user can choose a cocktail from the pictures on the home page
     *     @GIVEN that user is logged in
     *     @AND user is on homepage
     *     @WHEN user clicks on a cocktail picture
     *     @THEN user is able to see the details of chosen cocktail on a new page
     */

    @Test
    void isChoosingACocktailAvailable() {
        signedInHomePage.clickOna1Picture();
        Assertions.assertTrue(signedInHomePage.isUserOna1Page());
    }

}
