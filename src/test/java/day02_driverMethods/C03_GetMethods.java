package day02_driverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C03_GetMethods {
    public static void main(String[] args) {
        // 1. Yeni bir package olusturalim : day01
        //        2. Yeni bir class olusturalim : C01_GetMethods
        System.setProperty("webdriver.chrome.driver","src/driver/chromedriver.exe");
        WebDriver driver=new ChromeDriver();

        //        3. Amazon sayfasina gidelim. https://www.amazon.com/
        driver.get("https://www.amazon.com");
        //        4. Sayfa basligini(title) yazdirin
        System.out.println(driver.getTitle());
        //        5. Sayfa basliginin “Amazon” icerdigini test edin
        String actuelTitle=driver.getTitle();   //expexted result==actual Reseult
        String aranankelime="Amazon";
        if(actuelTitle.contains(aranankelime)){
            System.out.println("Title testi PASS");
        } else {
            System.out.println("Title testi FAILED");
            System.out.println("Sayfanin title'i : " +actuelTitle);
        }
        //        6. Sayfa adresini(url) yazdirin
        System.out.println(driver.getCurrentUrl());
        //        7. Sayfa url’inin “amazon” icerdigini test edin.
        String actuelUrl =driver.getCurrentUrl();
        String urlArananKelime="amazon";
        if(actuelUrl.contains(urlArananKelime)){
            System.out.println("Url testi PASSED");
        } else {
            System.out.println("Url Testi FAILED");
            System.out.println("Actual Url :" + urlArananKelime);
        }
        //        8. Sayfa handle degerini yazdirin
        System.out.println(driver.getWindowHandle());
        //        9. Sayfa HTML kodlarinda “alisveris” kelimesi gectigini test edin
        String actualPageSource =driver.getPageSource();
        String pageArananKelime="alisveris";
        if(actualPageSource.contains(pageArananKelime)){
            System.out.println("PageSource testi PASSED");
        } else {
            System.out.println("PageSource Testi FAILED");
            
        }
        //        10. Sayfayi kapatin.
        driver.close();







    }
}
