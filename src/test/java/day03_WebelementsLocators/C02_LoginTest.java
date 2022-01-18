package day03_WebelementsLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class C02_LoginTest {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","src/driver/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //1. Bir class oluşturun: LoginTest
        //2. Main method oluşturun ve aşağıdaki görevi tamamlayın.
        //    a. http://a.testaddressbook.com adresine gidiniz.
        driver.navigate().to("http://a.testaddressbook.com");
        //    b. Sign in butonuna basin
        WebElement signInLinki=driver.findElement(By.id("sign-in"));//sadece locate edip bir veriabla assign ettik
        signInLinki.click();

        //    c. email textbox,password textbox, and signin button elementlerini locate ediniz..
        WebElement emailTextBox=driver.findElement(By.id("session_email"));
        WebElement passwordTextBox= driver.findElement(By.id("session_password"));
        WebElement signInButonu=driver.findElement(By.name("commit"));

        //    d. Kullanıcı adını ve şifreyi aşağıya girin ve oturum aç (sign in)buttonunu tıklayın:
        //        i. Username : testtechproed@gmail.com
        //        ii. Password : Test1234!

        emailTextBox.sendKeys("testtechproed@gmail.com");
        passwordTextBox.sendKeys("Test1234!");

        Thread.sleep(3000);
        signInButonu.click();
        //    e. Expected user id nin testtechproed@gmail.com oldugunu dogrulayin(verify).
        WebElement girisYazisiElementi=driver.findElement(By.tagName("h1"));
        System.out.println(girisYazisiElementi.getText());//get texts yapmazsak referansini yazdirir sadece
        String actualGirisYazisi=girisYazisiElementi.getText();//Webelementinden giris yazisini Stringe aktardik
        String expectedGirisYazisi="Welcome to Adress Book";
        if(actualGirisYazisi.equals(expectedGirisYazisi)){
            System.out.println("Sayfaya giris testi PASS");
        }else{
            System.out.println("Sayfaya giris testi FAILED");
        }
        //    f. “Addresses” ve “Sign Out” textlerinin görüntülendiğini( displayed) doğrulayin(verify).
        WebElement adressWebElementi=driver.findElement(By.linkText("Addresses"));
        WebElement signoutWebElementi=driver.findElement(By.linkText("Sign out"));

        System.out.println(adressWebElementi.isDisplayed());//true veya false dondurur

        if(adressWebElementi.isDisplayed()){
            System.out.println("Adress elementi goruntulama testi PASS");

        } else{
            System.out.println("Adress elementi goruntulama testi FAILED");
        }
        if(signoutWebElementi.isDisplayed()){
            System.out.println("Sign out elementi goruntulama testi PASS");

        } else{
            System.out.println("Sign out elementi goruntulama testi FAILED");
        }

        //3. Sayfada kac tane link oldugunu bulun.

        List<WebElement> linklerListesi=driver.findElements(By.tagName("a"));
        System.out.println("sayfada "+linklerListesi.size()+" adet link bulunmaktadir");

        driver.close();



    }
}
