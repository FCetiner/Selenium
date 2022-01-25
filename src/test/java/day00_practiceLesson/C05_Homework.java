package day00_practiceLesson;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C05_Homework {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","src/driver/chromedriver.exe");
        WebDriver driver =new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        // ...Exercise4...
// Navigate to website  https://testpages.herokuapp.com/styled/index.html
        driver.navigate().to("https://testpages.herokuapp.com/styled/index.html");
// Under the  ORIGINAL CONTENTS
// click on Alerts
        driver.findElement(By.xpath("//a[@id='alerts']")).click();
// print the URL
        String alertsUrl=driver.getCurrentUrl();
        System.out.println("alertsUrl = " + alertsUrl);
// navigate back
        driver.navigate().back();
// print the URL
       String testPageUrl=driver.getCurrentUrl();
        System.out.println("testPageUrl = " + testPageUrl);
// Click on Basic Ajax
        driver.findElement(By.xpath("//a[@id='basicajax']")).click();
// print the URL
        String basicAjaxUrl=driver.getCurrentUrl();
        System.out.println("basicAjaxUrl = " + basicAjaxUrl);
// enter value-> 20 and Enter
        driver.findElement(By.id("lteq30")).sendKeys("20"+ Keys.ENTER);
// and then verify Submitted Values is displayed open page
        boolean isDisplayed= driver.findElement(By.xpath("//p[text()='Submitted Values']")).isDisplayed();
        System.out.println(isDisplayed ? "Submitted Values test PASS" : "Submitted Values test  FAILED");
// close driver
        driver.close();
    }
}
