package day03_WebelementsLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C03_WebElementGetMethodlari {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/driver/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //    a. http://a.testaddressbook.com adresine gidiniz.
        driver.get("http://a.testaddressbook.com");

        //sign in linkini locate edelim
        WebElement signInLinki=driver.findElement(By.id("sign-in"));

        System.out.println("size : "+signInLinki.getSize());
        System.out.println("AriaRole : "+signInLinki.getAriaRole());

        //yuzde 99 functional testing yapariz. bir özellik calisiyormu ona bakariz
        System.out.println("AccessibleName : "+signInLinki.getAccessibleName());
        System.out.println("Attiribute value : "+signInLinki.getAttribute("id"));
        System.out.println("Location : "+signInLinki.getLocation());
        System.out.println("genislik : "+signInLinki.getRect().width);//getrect() devamında ozellikleri var
        System.out.println("CssValue : "+signInLinki.getCssValue("color"));


        driver.close();

    }
}
