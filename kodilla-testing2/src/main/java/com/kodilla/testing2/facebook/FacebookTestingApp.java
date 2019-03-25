package com.kodilla.testing2.facebook;

import com.kodilla.testing2.config.WebDriverConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class FacebookTestingApp {
    public static final String DROPDOWN_BDAY = "//select[contains(@name, \"birthday_day\")]";
    public static final String DROPDOWN_BMONTH = "//select[contains(@name, \"birthday_month\")]";
    public static final String DROPDOWN_BYEAR = "//select[contains(@name, \"birthday_year\")]";

    public static void main(String[] args) {

        WebDriver driver = WebDriverConfig.getDriver(WebDriverConfig.CHROME);
        driver.get("https://www.facebook.com/");
        WebElement selectCombo1 = driver.findElement(By.xpath(DROPDOWN_BDAY));
        Select selectBoardDay = new Select(selectCombo1);
        selectBoardDay.selectByIndex(24);

        WebElement selectCombo2 = driver.findElement(By.xpath(DROPDOWN_BMONTH));
        Select selectBoardMonth = new Select(selectCombo2);
        selectBoardMonth.selectByIndex(11);

        WebElement selectCombo3 = driver.findElement(By.xpath(DROPDOWN_BYEAR));
        Select selectBoardYear = new Select(selectCombo3);
        selectBoardYear.selectByIndex(40);
    }
}
