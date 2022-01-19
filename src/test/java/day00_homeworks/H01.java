package day00_homeworks;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class H01 {
    public static void main(String[] args) throws InterruptedException {
        //Simdilik class olusturduktan saonra yazılmasi gereken 4 kural
        System.setProperty("webdriver.chrome.driver","src/driver/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //1.Yeni bir class olusturalim (Homework)
        //2.ChromeDriver kullanarak, facebook sayfasina gidin ve sayfa basliginin (title) “facebook”
        //oldugunu dogrulayin (verify), degilse dogru basligi yazdirin.
        driver.navigate().to("https://www.facebook.com");
        String actuelFacebookTitle=driver.getTitle();
        String expectedFacebookTitle="facebook";
        if(actuelFacebookTitle.equals(expectedFacebookTitle)){
            System.out.println("Facebook giris title testi PASS");
        }else{
            System.out.println("Facebook giris title testi FAILED\nActuel Facebook Title : " +actuelFacebookTitle);
        }
        //3.Sayfa URL’inin “facebook” kelimesi icerdigini dogrulayin, icermiyorsa “actual” URL’i yazdirin.
        String actuelFacebookUrl=driver.getCurrentUrl();
        String arananKelime="facebook";
        if(actuelFacebookUrl.contains(arananKelime)){
            System.out.println("Facebook url testi PASS");
        }else{
            System.out.println("Facebook url testi FAILED\nActuel Facebook URL : "+actuelFacebookUrl);
        }
        Thread.sleep(3000);
        //4.https://www.walmart.com/ sayfasina gidin.
        driver.navigate().to("https://www.walmart.com/");
        //5.Sayfa basliginin “Walmart.com” icerdigini dogrulayin.
        String actuelWalmartTitle=driver.getTitle();
        String walmartTitleArananKelime="Walmart.com";
        if(actuelWalmartTitle.contains(walmartTitleArananKelime)){
            System.out.println("Walmart title testi PASS");
        } else{
            System.out.println("Walmart title testi FAILED");
        }
        //6.Tekrar “facebook” sayfasina donun
        driver.navigate().back();
        //7.Sayfayi yenileyin
        driver.navigate().refresh();
        //8.Sayfayi tam sayfa (maximize) yapin
        driver.manage().window().maximize();
        //9.Browser’i kapatin
        driver.quit();
    }
}
