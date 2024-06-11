package activities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Activity9 {
    public static void main(String[] args) {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();

        driver.get("https://v1.training-support.net/selenium/ajax");
        // Explicit wait
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        // Find and click the "Change content" button on the page.
        driver.findElement(By.cssSelector(".violet")).click();

        // Wait for the text to say "HELLO!". Print the message that appears on the page.
        String header1 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.tagName("h1"))).getText();
        System.out.println("New h1 says: " + header1);

        // Wait for the text to change to contain "I'm late!". Print the new message on the page.
        wait.until(ExpectedConditions.textToBePresentInElementLocated(By.tagName("h3"), "I'm late!"));
        String header3 = driver.findElement(By.tagName("h3")).getText();
        System.out.println("New h3 says: " + header3);

        driver.quit();
    }
}
