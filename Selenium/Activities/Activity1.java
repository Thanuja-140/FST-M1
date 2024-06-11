package activities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity1 {
    public static void main(String[] args) throws InterruptedException {
        // Get Firefox driver
        WebDriverManager.firefoxdriver().setup();
        // Create driver object
        WebDriver driver = new FirefoxDriver();

        // Open the page
        driver.get("https://training-support.net/");
        // Find and interact with the elements on the page
        // Get the title of the page and print it to the console
        String pageTitle = driver.getTitle();
        System.out.println(pageTitle);

        // Find the "About Us" button on the page using it's id.
        // Click on that button.
        driver.findElement(By.linkText("About Us")).click();

        String newPageTitle = driver.getTitle();
        System.out.println(newPageTitle);

        Thread.sleep(2000);

        // Close the browser
        driver.quit();
    }
}
