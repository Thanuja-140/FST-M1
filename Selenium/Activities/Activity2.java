package activities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity2 {
    public static void main(String[] args){
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();

        // Open a new browser to https://v1.training-support.net/selenium/login-form
        driver.get("https://v1.training-support.net/selenium/login-form");
        // Get the title of the page and print it to the console.
        String pageTitle = driver.getTitle();
        System.out.println(pageTitle);
        // Find the username field using any locator and enter "admin" into it.
        driver.findElement(By.id("username")).sendKeys("admin");
        driver.findElement(By.id("password")).sendKeys("password");
        driver.findElement(By.xpath("//button[@type='submit']")).click();

        String confirmationMessage = driver.findElement(By.id("action-confirmation")).getText();
        System.out.println("confirmationMessage");
        driver.quit();
    }
}
