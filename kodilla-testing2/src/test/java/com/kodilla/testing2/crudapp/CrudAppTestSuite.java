package com.kodilla.testing2.crudapp;

import com.kodilla.testing2.config.WebDriverConfig;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.Random;
import java.util.stream.Collectors;

import static org.junit.Assert.assertTrue;

public class CrudAppTestSuite {
    private static final String BASE_URL = "https://taqba.github.io/tasks.html";
    private static final String TRELLO_URL = "https://trello.com/login";
    private static final String TASK_NAME = "Foo Bar";
    private WebDriver driver;
    private WebDriver driverTrello;
    private Random generator;

    @Before
    public void initTests() {
        driver = WebDriverConfig.getDriver(WebDriverConfig.CHROME);
        driver.get(BASE_URL);

        driverTrello = WebDriverConfig.getDriver(WebDriverConfig.CHROME);
        driverTrello.get(TRELLO_URL);
        generator = new Random();
    }

    @Test
    public void shouldCreateTrelloCard() throws InterruptedException {
        String taskName = createCrudAppTestTask();
        sendTestTaskToTrello(taskName);
        assertTrue(checkTaskExistInTrello(taskName));
        assertTrue(deleteCrudAppTestTask(taskName));
    }

//    @Test
//    public void shouldCheckTrelloCard() throws InterruptedException {
//        assertTrue(checkTaskExistInTrello(TASK_NAME));
//    }

    private boolean checkTaskExistInTrello(String taskName) throws InterruptedException {
        driverTrello.findElement(By.id("user")).sendKeys("jakub.tadych@googlemail.com");
        driverTrello.findElement(By.id("password")).sendKeys("BLAM1234!");
        driverTrello.findElement(By.id("login")).submit();

        boolean result = false;

        Thread.sleep(2000);
        driverTrello.findElements(By.xpath("//a")).stream()
                .filter(aHref->aHref.findElements(By.xpath(".//div[@title=\"Kodilla Application\"]")).size()>0)
                .forEach(aHref->aHref.click());

        Thread.sleep(2000);

        result = driverTrello.findElements(By.xpath("//span")).stream()
                .filter(theSpan->theSpan.getText().contains(taskName))
                .collect(Collectors.toList())
                .size()>0;

        driverTrello.close();

        return result;
    }

    @After
    public void cleanUpAfterTest() {
        driver.close();
    }

    private void sendTestTaskToTrello(String taskName) throws  InterruptedException {
        driver.navigate().refresh();
        while (!driver.findElement(By.xpath("//select[1]")).isDisplayed());

        driver.findElements(By.xpath("//form[@class=\"datatable__row\"]")).stream()
                .filter(anyForm -> anyForm.findElement(By.xpath(".//p[@class=\"datatable__field-value\"]"))
                    .getText().equals(taskName))
                .forEach(theForm -> {
                    WebElement selectElement =  theForm.findElement(By.xpath(".//select[1]"));
                    Select select = new Select(selectElement);
                    select.selectByIndex(1);

                    WebElement buttonCreateCard =
                            theForm.findElement(By.xpath(".//button[contains(@class, \"card-creation\")]"));
                    buttonCreateCard.click();
                });
        Thread.sleep(5000);
    }

    private String createCrudAppTestTask() throws InterruptedException {
        final String XPATH_TASK_NAME = "//form[contains(@action, \"createTask\")]/fieldset[1]/input";
        final String XPATH_TASK_CONCTENT = "//form[contains(@action, \"createTask\")]/fieldset[2]/textarea";
        final String XPATH_TASK_ADD_BTN = "//form[contains(@action, \"createTask\")]/fieldset[3]/button";

        String taskName = TASK_NAME;
        String taskContent = taskName + " content";

        WebElement name= driver.findElement(By.xpath(XPATH_TASK_NAME));
        name.sendKeys(taskName);

        WebElement content = driver.findElement(By.xpath(XPATH_TASK_CONCTENT));
        content.sendKeys(taskContent);

        WebElement addBtn = driver.findElement(By.xpath(XPATH_TASK_ADD_BTN));
        addBtn.click();

        Thread.sleep(2000);
        return taskName;
    }

    private boolean deleteCrudAppTestTask(String taskName) throws InterruptedException {
        final String XPATH_TASK_CONTAINER = "//form[@class=\"datatable__row\"]";
        final String XPATH_TASK_DELETE_BTN = ".//button[@data-task-delete-button]";

        Thread.sleep(3000);

        driver.findElements(By.xpath(XPATH_TASK_CONTAINER)).stream()
                .filter(anyForm -> anyForm.findElement(By.xpath(".//p[@class=\"datatable__field-value\"]"))
                        .getText().equals(taskName))
                .forEach(theForm -> {
                    WebElement buttonCreateCard =
                            theForm.findElement(By.xpath(XPATH_TASK_DELETE_BTN));
                    buttonCreateCard.click();
                });
        Thread.sleep(2000);

        boolean result = driver.findElements(By.xpath(XPATH_TASK_CONTAINER)).stream()
                .filter(anyForm -> anyForm.findElement(By.xpath(".//p[@class=\"datatable__field-value\"]"))
                .getText().equals(taskName))
                .collect(Collectors.toList())
                .size() == 0;
        return result;
    }
}
