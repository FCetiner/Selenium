package day01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_IlkClass {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","src/driver/chromedriver.exe");

    WebDriver driver=new ChromeDriver(); //ChromeDriver() bir  contructor
        //Webdriver  bir interface dir Chrome(Opera Firefox vb)
        // classi hangi metodlara sahip olmaak zorunda Wbdriver bunu belirliyor onlarda bu methodlari
        // olusutrmak zorunda Webdriverdan obje uretilelmez cunku obir interfacedir

    // biz driver objesi oluşturduğumuzda boş bir chrome browser açılır
  //  driver.get("https://www.amazon.com");
        //driver.get methodu drivera gideceği web adresini girmemizi sağlar

    //    Thread.sleep(3000);
        //Belirtilen süre beklenmesini sağlar

        driver.get("https://www.trendyol.com");

        Thread.sleep(7000);

        //eger  Process finished with exit code 0 sa programimiz calisiyor
    // 0 dan farkli bir degerse bir yerde hatamizi bulmamiz gereklidir
         driver.close();
        //driver kapatır



    }
}
