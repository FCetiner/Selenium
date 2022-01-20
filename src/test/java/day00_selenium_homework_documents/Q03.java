package day00_selenium_homework_documents;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Q03 {
    public static void main(String[] args) {
       System.setProperty("webdriver.chrome.driver","src/driver/chromedriver.exe");
       WebDriver driver=new ChromeDriver();
       driver.manage().window().maximize();
       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //1.  https://app.hubspot.com/login sayfasina gidin
        driver.navigate().to("https://app.hubspot.com/login");
        //2.  Bir mail adersi giriniz
        WebElement mailAdresKutusu=driver.findElement(By.xpath("//input[@id='username']"));
        mailAdresKutusu.sendKeys("aliveli@bosmail.com");
        //3.  Bir password giriniz
        WebElement passwordKutusu=driver.findElement(By.xpath("//input[@id='password']"));
        passwordKutusu.sendKeys("123456");
        //4.  Login butonuna tiklayiniz
        WebElement loginButonu=driver.findElement(By.id("password-login-button"));
        //5.  "That email address doesn't exist." texti gorunur ise
        //6.  "kayit yapilamadi" yazdiriniz
        //8.  eger yazi gorunur degilse "kayit yapildi" yazdiriniz
        WebElement doesntExistElementi=driver.findElement(By.xpath("//h5[@aria-level='2']"));
        String arananKelime="That email address doesn't exist.";
        if(doesntExistElementi.getText().equals(arananKelime)){
            System.out.println("kayit yapilamadi");
        } else{
            System.out.println("kayit yapildi");
        }

        //9.  Tum sayfalari kapatiniz
        driver.quit();
    }
}
