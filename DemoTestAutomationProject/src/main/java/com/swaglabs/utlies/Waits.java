package com.swaglabs.utlies;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Waits {
    public static void main(String[] args) {
        WebDriver driver = // الكود الخاص بتهيئة المتصفح

                WebDriverWait waits = new WebDriverWait(driver, Duration.ofSeconds(10));

        // 1️⃣ انتظار العنصر موجود في الـ DOM
        WebElement elementPresent = waits.until(
                ExpectedConditions.presenceOfElementLocated(By.id("my-element"))
        );

        // 2️⃣ انتظار العنصر ظاهر للمستخدم
        WebElement elementVisible = waits.until(
                ExpectedConditions.visibilityOfElementLocated(By.id("my-element"))
        );

        // 3️⃣ انتظار العنصر قابل للنقر
        WebElement elementClickable = waits.until(
                ExpectedConditions.elementToBeClickable(By.id("my-element"))
        );

        // مثال للتفاعل بعد الانتظار
        elementClickable.click();
    }
}
