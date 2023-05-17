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
@UseTestDataFrom("src/test/resources/AnimalsData.csv")
public class LoginAndLogoutUserStoryTest {

    String username,password,errorMessage;
    Boolean valid;
    @Managed(uniqueSession = true, driver="chrome")
    public WebDriver webdriver;

    @Steps
    public MyEndUserSteps bob;

    @Test
    public void login_test() throws InterruptedException {
        bob.is_the_home_page();
        bob.loginUser(username, password);
        if(valid) {
            bob.logoutUser();
        } else {
            Assert.assertTrue(bob.canSeeMessage(errorMessage));
        }
    }

} 