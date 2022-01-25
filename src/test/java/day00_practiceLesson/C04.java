package day00_practiceLesson;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C04 {
    // ...Exercise5...

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/driver/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        // Navigate to  https://testpages.herokuapp.com/styled/index.html
        driver.get("https://testpages.herokuapp.com/styled/index.html");
// Click on  Calculate under Micro Apps
        driver.findElement(By.id("calculatetest")).click();
//    Type any number in the first input
        driver.findElement(By.id("number1")).sendKeys("3");
//    Type any number in the second input
        driver.findElement(By.id("number2")).sendKeys("5");
// Click on Calculate
        driver.findElement(By.id("function")).sendKeys("minus");
// Get the result
        driver.findElement(By.id("calculate")).click();
// Print the result
        String result=(driver.findElement(By.xpath("//span[@id='answer']"))).getText();
        System.out.println("işlemin sonucu : "+result);

        driver.close();









    }
}
