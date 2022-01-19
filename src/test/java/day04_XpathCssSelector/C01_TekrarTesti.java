package day04_XpathCssSelector;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C01_TekrarTesti {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","src/driver/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));


        //    a.google web sayfasına gidin. https://www. amazon.com/
        driver.get("https://www.amazon.com");
        //    b. Search(ara) “city bike”
        WebElement aramaKutusu=driver.findElement(By.id("twotabsearchtextbox"));
        aramaKutusu.sendKeys("city bike"+ Keys.ENTER);
        //    c. Amazon'da görüntülenen ilgili sonuçların sayısını yazdırın


        WebElement sonucYazisiElementi=driver.findElement(By.xpath("//div[@class='sg-col-14-of-20 sg-col s-breadcrumb sg-col-10-of-16 sg-col-6-of-12']"));
    //class name ile daha once bu elementi locate edemedigimiz halde
        // xpath ile class attiribute kullanarak locate edebildik

    //    WebElement sonucYazisiElementi=driver.findElement(By.className("sg-col-inner"));
        System.out.println(sonucYazisiElementi.getText());

        //    e. Sonra karşınıza çıkan ilk sonucun resmine tıklayın.
       driver.findElement(By.className("s-image")).click();

        //sadece click yapmak gibi basit bir işlemde kullanacagimiz webelementler için
        //variable oluşturmadan direkt locate edip, istediğimiz islemi yapabiliriz

    }
}
