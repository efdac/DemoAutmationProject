package com.swaglabs.utlies;

import org.openqa.selenium.WebDriver;

public class BrowserActions {
    private BrowserActions() {

    }

    public static void navigateToURL(WebDriver driver, String url) {
        driver.get(url);
    }

}
