package day00_selenium_homework_documents;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Q03_2 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/driver/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //1.  https://id.heroku.com/login sayfasina gidin
        driver.get("https://id.heroku.com/login");

        //2.  Bir mail adersi giriniz
        WebElement mailAdresKutusu=driver.findElement(By.id("email"));
        mailAdresKutusu.sendKeys("baskabiri@baskamail.com");
        //3.  Bir password giriniz
        WebElement passwordKutusu=driver.findElement(By.xpath("//input[@id='password']"));
        passwordKutusu.sendKeys("123456");
        //4.  Login butonuna tiklayiniz
        driver.findElement(By.name("commit")).click();
        //5.  "There was a problem with your login." texti gorunur ise
        //6.  "kayit yapilamadi" yazdiriniz
        //8.  eger yazi gorunur degilse "kayit yapildi" yazdiriniz
        WebElement hataliLoginYazisiElementi=driver.findElement(By.xpath("//div[@role='alert']"));
        if(hataliLoginYazisiElementi.isDisplayed()){
            System.out.println("kayit yapilamadi");
        } else{
            System.out.println("kayit yapildi");
        }

        //9.  Tum sayfalari kapatiniz
        driver.quit();
    }
}
