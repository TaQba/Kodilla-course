package com.kodilla.testing2.google;

import com.kodilla.testing2.config.WebDriverConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GoogleTestingApp {
    public static final String SEARCHFIELD = "gLFyf";
    public static void main(String[] args) {

        WebDriver driver =WebDriverConfig.getDriver(WebDriverConfig.CHROME);
        driver.get("https://google.com");
        WebElement searchfield= driver.findElement(By.className(SEARCHFIELD));
        searchfield.sendKeys("Kodilla");
        searchfield.submit();
    }
}
