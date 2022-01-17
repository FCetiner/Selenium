package day02_driverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C08_ImplicitlyWait {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","src/driver/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        //Alttaki iki komutu her calismamizda kullanacagız
        driver.manage().window().maximize();//Bunu her calismaya basladıgımızda yapmayi adet edinmeliyiz
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        //implicitlywait testimiz boyunca sayfa acilmasi ve element bulunmasi konusunda driverin
        // bekleyecegi maximum sureyi belirler.
        //Bu sure icerisinde gorevini bitirir bitirmez, bir sonreki adima gecer
        //bu sure icerisinde gorevini bitiremeze o zaman hata verir
        //Belirlenen maxsimum sure thread.sleep deki gibi mutlak bekleme suresi degildir
        //
        driver.get("https://www.techproeducation.com");
        Thread.sleep(5000);//Javadan gelen methoddur kodlarin calismasini 5 saniye durdurur
        // her durumda 5 saniye bekler
        driver.close();
    }
}
