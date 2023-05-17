/*
package org.example.features.search;

import net.serenitybdd.junit.runners.SerenityParameterizedRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import net.thucydides.junit.annotations.UseTestDataFrom;
import org.example.steps.serenity.EndUserSteps;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityParameterizedRunner.class)
@UseTestDataFrom("src/test/resources/AnimalsData.csv")
public class BuyClothesUserStoryTest {
    String username,password,errorMessage,clothing;
    Boolean valid;

    @Managed(uniqueSession = true, driver="chrome")
    public WebDriver webdriver;

    @Steps
    public EndUserSteps bob;

    @Test
    public void buyDog() throws InterruptedException {
        bob.is_the_home_page();
        bob.loginUser(username, password);
        bob.searchItem(clothing);

        bob.addToCart();
        bob.proceedToCheckout();
        bob.clickContinue();
        bob.clickConfirm();
        Assert.assertTrue(bob.canSeeMessage("Thank you, your order has been submitted."));
        bob.returnToMainMenu();
        bob.logoutUser();
    }
}
*/
