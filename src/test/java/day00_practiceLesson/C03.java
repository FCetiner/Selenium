package day00_practiceLesson;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C03 {
    public static void main(String[] args) {
        // ...Exercise3...


        System.setProperty("webdriver.chrome.driver","src/driver/chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        // go to url : https://www.techlistic.com/p/selenium-practice-form.html
        driver.get("https://www.techlistic.com/p/selenium-practice-form.html");
        driver.findElement(By.xpath("//a[text()='Tamam']")).click();
    //    driver.manage().deleteAllCookies();
//fill the firstname
        driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Azra Ada");
//fill the firstname
        driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("ÇETİNER");
//check the gender
        driver.findElement(By.id("sex-0")).click();
//check the experience
        driver.findElement(By.id("exp-0")).click();
//fill the date
        driver.findElement(By.id("datepicker")).sendKeys("20/03/2020");
//choose your profession -> Automation Tester
        driver.findElement(By.id("profession-1")).click();
//choose your tool -> Selenium Webdriver
        WebElement prf= driver.findElement(By.id("tool-2"));
        prf.click();
        prf.sendKeys(Keys.PAGE_DOWN);
//choose your continent -> Antartica
        driver.findElement(By.xpath("//select[@id='continents']")).sendKeys("Antartica");
//choose your command  -> Browser Commands
        driver.findElement(By.xpath("//option[normalize-space()='Browser Commands']")).click();
//click submit button
        driver.findElement(By.xpath("//button[@id='submit']")).click();


        driver.close();


    }
}
