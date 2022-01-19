package day00_selenium_homework_documents;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q02_Navigate {
    public static void main(String[] args) {


        //        1-driver olusturalim
        //        2-java class'imiza chromedriver.exe'yi tanitalim
        System.setProperty("webdriver.chrome.driver","src/driver/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        //        3-driver'in tum ekrani kaplamasini saglayalim
        driver.manage().window().maximize();
        //        4-https://github.com/ adresine gidelim
        driver.navigate().to("https://github.com/");
        //        5-Ardindan https://www.hepsiburada.com/ adrsine gidelim
        driver.navigate().to("https://www.hepsiburada.com/");
        //        6-Title ve url console da yazdirin ve
        //        yine title ve url in "burada" kelimesini icerip icermedigini kontrol edelim
        String hepsiBuradaActuelTitle=driver.getTitle();
        System.out.println(hepsiBuradaActuelTitle);
        String hepsiBuradaActuelUrl=driver.getCurrentUrl();
        System.out.println(hepsiBuradaActuelUrl);
        String arananKelime="burada";
        if(hepsiBuradaActuelTitle.contains(arananKelime)){
            System.out.println("Title test PASS");
        }else{
            System.out.println("Title test FAILED");
        }

        if(hepsiBuradaActuelUrl.contains(arananKelime)){
            System.out.println("Title test PASS");
        }else{
            System.out.println("Title test FAILED");
        }
        //        7-Sonrasinda https://github.com/ adresine geri donelim ve  sayfayi yenileyelim
        driver.navigate().back();
        driver.navigate().back();
        driver.navigate().refresh();
        //        8-Son adim olarak butun sayfalarimizi kapatmis ola
        driver.quit();
    }
}
