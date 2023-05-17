package org.example.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

@DefaultUrl("https://petstore.octoperf.com/actions/Account.action")
public class AnimalsSitePage extends PageObject {
    @FindBy(name = "username")
    private WebElementFacade usernameField;

    @FindBy(name = "password")
    private WebElementFacade passwordField;

    @FindBy(name = "signon")
    private WebElementFacade loginButton;

    @FindBy(linkText = "Sign Out")
    private WebElementFacade logoutButton;

    @FindBy(className = "messages")
    private WebElementFacade invalidLoginMessage;

    @FindBy(linkText = "Dogs")
    private WebElementFacade dogsButton;

    @FindBy(id = "Catalog")
    private WebElementFacade catalog;

    @FindBy(linkText = "Proceed to Checkout")
    private WebElementFacade proceedToCheckoutButton;

    @FindBy(name = "newOrder")
    private WebElementFacade continueButton;

    @FindBy(linkText = "Confirm")
    private WebElementFacade confirmButton;

    @FindBy(linkText = "Return to Main Menu")
    private WebElementFacade returnToMainMenuButton;

    public void enterUsername(String username) {
        usernameField.type(username);
    }

    public void enterPassword(String password) {
        passwordField.type(password);
    }

    public void clickLogin() {
        loginButton.click();
    }

    public void logout() {
        logoutButton.click();
    }

    public boolean isErrorLoginVisible(String message) {
        return invalidLoginMessage.isCurrentlyVisible() && invalidLoginMessage.getText().equals(message);
    }

    public void addToCartFirst() {
        WebElementFacade button = catalog.findBy(By.tagName("table")).findBy(By.tagName("tbody")).findBy(By.linkText("Add to Cart"));
        button.click();
    }

    @FindBy(id = "SidebarContent")
    private WebElementFacade sidebar;

    public void clickDogs() {
//        dogsButton.click();
        sidebar.findElements(By.tagName("a")).get(1).click();
    }

    public void clickDog(String dogType) {
        WebElementFacade button = catalog.findBy(By.tagName("table")).findBy(By.tagName("tbody")).findBy(By.linkText(dogType));
        button.click();
    }

    public void proceedToCheckout() {
        proceedToCheckoutButton.click();
    }

    public void clickContinue() {
        continueButton.click();
    }

    public void clickConfirm() {
        confirmButton.click();
    }

    public void returnToMainMenu() {
        returnToMainMenuButton.click();
    }

    public boolean containsHeader(String name) {
        return catalog.findElements(By.tagName("h2"))
                .stream()
                .anyMatch(header -> header.isDisplayed() && header.getText().equals(name));
    }
}
