package day02_driverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C02_DriverGetMethodlari {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","src/driver/chromedriver.exe");
        WebDriver driver=new ChromeDriver();

        driver.get("https://www.amazon.com");

        System.out.println(driver.getTitle());  //Sayfanin title'ini getirir

        System.out.println(driver.getCurrentUrl()); //Sayfanin adresini getirir

        System.out.println(driver.getWindowHandle());   //CDwindow-4E9E630E5AEAF2393066BA96AE5666C7 windowsta o anda açılan pencereye verilen numaradır
        //driver.getWindowHandles() coklu sayfa için kullanilir
        System.out.println(driver.getPageSource()); //
        //ctrl u -> sayfanin kaynak kodlarini gösterir

    }
}
