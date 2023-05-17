package org.example.features.search;

import net.serenitybdd.junit.runners.SerenityParameterizedRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import net.thucydides.junit.annotations.UseTestDataFrom;
import org.example.steps.serenity.MyEndUserSteps;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityParameterizedRunner.class)
@UseTestDataFrom("src/test/resources/AnimalsBuy.csv")
public class BuyAnimalStoryTest {

    String username,password, dogType,header;
    @Managed(uniqueSession = true, driver="chrome")
    public WebDriver webdriver;

    @Steps
    public MyEndUserSteps bob;

    @Test
    public void buyDog() throws InterruptedException {
        bob.is_the_home_page();
        bob.loginUser(username, password);
        bob.clickDogs();
        bob.clickDogType(dogType);
        Assert.assertTrue(bob.containsHeader(header));
        bob.addToCart();
        bob.proceedToCheckout();
        bob.clickContinue();
        bob.clickConfirm();
        Assert.assertTrue(bob.canSeeMessage("Thank you, your order has been submitted."));
        bob.returnToMainMenu();
        bob.logoutUser();
    }

} 