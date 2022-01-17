package day02_driverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_Tekrar {
    //Normalde selenium'un kendi IDE'si var fakat biz daha kullanışlı oldugu için Intellij kullanıyoruz
    //Intellij'de yeni proje açtığımızda oncelikle selenium kutuphanelerini projeye eklememiz gerekir
    //biz en ilke haliyle projemize kutuphaneleri jar dosyları olarak yükledik
    //bu eklediğimiz dosyalarla artık driver'in ayarlarini yapabiliriz

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","src/driver/chromedriver.exe");
        //set property methodu 2 parametre ister
        //ilki kullanacagımız browser a ait driver
        //ikinci parametre ise selenium sitesinden indirip projemize eklediğimiz chromedriver'in path i(path from content root)
        //windows kullanicilari sona .exe eklerken apple kullanicilari eklememeli

        WebDriver driver=new ChromeDriver();    //driver objesi oluşturduk

        driver.get("https://www.amazon.com");   //Bu kodu çalıştırmasak bile boş bir chrome açılır çünkü constructor çalışır

        Thread.sleep(3000);
        //Java'dan gelir içine yazılan milisaniye kadar kodların çalışmasını bekletir

        driver.close(); // classin sonuna yazilir cunku bu kod calisinca driver kapanir
        //bu koddan sonra yeniden bir browser acmak istiyorsak drivere yeni deger atamaliyiz
        driver=new ChromeDriver();//yukarida driveri kapattıktan sonra yeni işlem yapmak için objeyi yeniden atama yapmalıyız

    }
}
