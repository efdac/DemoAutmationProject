package com.swaglabs.pages;
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
    //Actions (functions بتاعتهم)(wait - scrolling - find - sendkeys)
    public  LoginPage(String username) {
        //Wait


        //scroll
        driver.findElement(this.username).sendkeys(username);

    }



    //valdations


}
