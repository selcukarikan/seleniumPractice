package day01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class mediaMarkt {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/selcuk/Desktop/selenium dependencies/drivers/chromedriver");
        WebDriver driver=new ChromeDriver();
        // 1) driver olusturun
        driver.get("https://www.mediamarkt.de/");
        //2) Tam ekran yapin
        driver.manage().window().maximize();
       //3) Driver'in sayfanin yüklenmesi için 10.000 milisaniye beklemesini ayarlayin
   driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);
       // 4) medimarkt.de adresine gidin
        driver.get("https://www.mediamarkt.de/");
    //5) web sayfasinin sayfa basligini(title) alin ve ekrana yazdirin
        System.out.println("Web sayfasinin title : "+ driver.getTitle());
    //6) web sayfasinin url'ini alin ve ekrana yazdirin
        System.out.println("Web sayfasi adresi :"+driver.getCurrentUrl());
    //7) web sayfasinin title'inin "Medimarkt" icerdigini kontrol edin
        if (driver.getTitle().contains("Mediamarkt")){
            System.out.println("title Mediamarkt kelimesini icerir");
        }else{
            System.out.println("title Mediamarkt kelimesini icermiyor");
        }
    //8) gittigidiyor.com adresine gidin
        driver.get("https://www.gittigidiyor.com");
//9) web sayfasinin sayfa basligini(title) alin ve ekrana yazdirin
//10) web sayfasinin url'ini alin ve ekrana yazdirin
//11) Title'in Gittigidiyor icerdigini kontrol edin.
//12) sahibinden.com sayfasina geri don.
//13) sayfayi yenile
//14) onceki sayfaya don
driver.close();

    }
}