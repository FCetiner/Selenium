package day01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_IlkClass {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","src/driver/chromedriver.exe");

    WebDriver driver=new ChromeDriver();

    // biz driver objesi oluşturduğumuzda boş bir chrome browser açılır
    driver.get("https://www.amazon.com");
        //driver.get methodu drivera gideceği web adresini girmemizi sağlar

        Thread.sleep(3000);
        //Belirtilen süre beklenmesini sağlar


        driver.close();
        //driver kapatır



    }
}
