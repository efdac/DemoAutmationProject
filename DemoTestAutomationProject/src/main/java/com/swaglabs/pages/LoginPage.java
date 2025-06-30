package com.swaglabs.pages;
import com.swaglabs.utlies.BrowserActions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPage {
    //locators (user nam,password,buttons)
    private final WebDriver driver;
    private final By username = By.id("user-name");
    private final By password = By.id("password");
    private final By LoginButton = By.id("Login-button");

    //constructor
    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    //Navigation to the Login page (لي البروحكت بتاعك يبدا بنافيجشن دايما وينتهي باسيرشن يانوني)
    public void navigationtoLoginPage(){
        BrowserActions.navigateToURL(driver, "https://www.saucedemo.com/");
    }

    //Actions (functions بتاعتهم)(wait - scrolling - find - sendkeys)
    public  Void enterusername(String username) {
        ElementActions.sendData(driver, this.username,username);
    }
    public  Void enterPassword(String password) {
        ElementActions.sendData(driver, this.password,password);
    }
    public void clickLoginButtons(){
        ElementActions.ClickElement(driver, loginButton);

    }

    //valdations
    //fuction check succeful login
    public void click

}
