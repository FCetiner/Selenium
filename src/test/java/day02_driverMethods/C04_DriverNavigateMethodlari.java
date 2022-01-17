package day02_driverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C04_DriverNavigateMethodlari {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","src/driver/chromedriver.exe");
        WebDriver driver=new ChromeDriver();

        driver.navigate().to("https://www.amazon.com");
        //driver.get ile ayni işlemi yapar ama daha hizlidir
        driver.navigate().to("https://www.techproeducation.com");
        //aynı tarayicida once amazon sonra techpro acar
        driver.navigate().back();//onceki sayfa acilir

        driver.navigate().forward();//saonraki sayfa acilir

        Thread.sleep(3000);
        driver.navigate().refresh();//sayfayi yeniler



    }
}
