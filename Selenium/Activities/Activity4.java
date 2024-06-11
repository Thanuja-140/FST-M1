package activities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity4 {
    public static void main(String[] args) {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();

        driver.get("https://v1.training-support.net/selenium/target-practice");
        String pageTitle = driver.getTitle();
        System.out.println(pageTitle);

        // Using xpath:
        // Find the 3rd header on the page and print it's text to the console.
        String thirdHeaderText = driver.findElement(By.xpath("//h3[@id='third-header']")).getText();
        System.out.println(thirdHeaderText);

        // Find the 5th header on the page and print it's color:
        String fifthHeaderColor = driver.findElement(By.xpath("//h5[@class='ui green header']")).getCssValue("color");
        System.out.println(fifthHeaderColor);

        // Using any other locator:
        // Find the violet button and print all it's classes.
        String violetButtonClass = driver.findElement(By.cssSelector("button[class='ui violet button']")).getAttribute("class");
        System.out.println(violetButtonClass);

        // Find the grey button and print it's text.
        String greyButtonText = driver.findElement(By.cssSelector("button[class='ui grey button']")).getText();
        System.out.println(greyButtonText);

        driver.quit();
    }
}
