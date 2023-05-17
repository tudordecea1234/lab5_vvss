package org.example.steps.serenity;

import net.thucydides.core.annotations.Step;
import org.example.pages.AnimalsSitePage;

public class MyEndUserSteps {
    AnimalsSitePage page;

    @Step
    public void enters(String keyword) {
//        dictionaryPage.enter_keywords(keyword);
    }

    @Step
    public void starts_search() {
//        dictionaryPage.lookup_terms();
    }

    @Step
    public void should_see_definition(String definition) {
//        assertThat(dictionaryPage.getDefinitions(), hasItem(containsString(definition)));
    }

    @Step
    public void is_the_home_page() {
        page.open();
    }

    @Step
    public void loginUser(String username, String password) {
        page.enterUsername(username);
        page.enterPassword(password);
        page.clickLogin();
    }

    @Step
    public void logoutUser() {
        page.logout();
    }

    @Step
    public boolean canSeeMessage(String message) {
        return page.isErrorLoginVisible(message);
    }

    @Step
    public void looks_for(String term) {
        enters(term);
        starts_search();
    }

    public void clickDogs() {
        page.clickDogs();
    }

    public void clickDogType(String dogType) {
        page.clickDog(dogType);
    }

    public void addToCart() {
        page.addToCartFirst();
    }

    public void proceedToCheckout() {
        page.proceedToCheckout();
    }

    public void clickContinue() {
        page.clickContinue();
    }

    public void clickConfirm() {
        page.clickConfirm();
    }

    public void returnToMainMenu() {
        page.returnToMainMenu();
    }

    public boolean containsHeader(String name) {
        return page.containsHeader(name);
    }
}
