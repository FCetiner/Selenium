package day00_practiceLesson;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C02 {
        //  ...Exercise2...
//  1-driver olusturalim
//  2-java class'imiza chromedriver.exe'yi tanitalim
//  3-driver'in tum ekrani kaplamasini saglayalim
//  4-driver'a sayfanın yuklenmesini 10.000 milisaniye (10 saniye) boyunca beklesini
//    söyleyelim. Eger oncesinde sayfa yuklenirse, beklemeyi bıraksin.
//  5-"sahibinden.com" adresine gidelim
//  6-bu web adresinin sayfa basligini(title) ve adres(url)ini alalim
//  7-title ve url'nin "Oto" kelimesinin icerip icermedigini kontrol edelim
//  8-Ardindan "gittigidiyor.com" adresine gidelim
//  9-bu adresin basligini alalim ve "Sitesi" kelismesini icerip icermedigini
//    kontrol edelim
//  10-Bi onceki web sayfamiza geri donelim
//  11-sayfayi yenileyelim
//  12-Daha sonra web sayfamiza tekrar donelim ve oldugumuz sayfayi kapatalim
//  13-En son adim olarak butun sayfalarimizi kapatmis olalim
public static void main(String[] args) {

    System.setProperty("webdriver.chrome.driver","src/driver/chromedriver.exe");
    WebDriver driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

    driver.get("https://www.sahibinden.com");
    String shbTitle=driver.getTitle();
    String shbUrl=driver.getCurrentUrl();

    System.out.println("Sahibinden title : "+shbTitle);
    System.out.println("Sahibinden url : "+shbUrl);
    String arananKelime="Oto";
    System.out.println(shbTitle.contains(arananKelime) ? "Oto yazisi vardir" : "Oto yazisi yoktur");
    System.out.println(shbUrl.contains(arananKelime) ? "Oto yazisi vardir" : "Oto yazisi yoktur");
    driver.navigate().to("https://www.gittigidiyor.com");


    boolean isTrue=driver.getTitle().contains("Sitesi");
    System.out.println(isTrue ? "Test Pass" : "Test Fail");


    driver.navigate().back();
    driver.navigate().refresh();
    driver.navigate().forward();
    driver.quit();


}

}
