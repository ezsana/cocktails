package com.codecool.zsana.cocktail;

import org.junit.jupiter.api.BeforeAll;

public class LoginTest extends BasePageTest {

    SignInPage signInPage;

    @BeforeAll
    void setupTests() {
        super.setUp();
        signInPage = new SignInPage(getDriver());
    }

    /** valid login - user types valid login and password and gets permission to sign into their account */




    /** invalid login - user types wrong username / password and is not able to use the page */

    /** user remains logged in even after leaving the application */

}
