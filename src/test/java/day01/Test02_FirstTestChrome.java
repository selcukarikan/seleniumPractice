package day01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test02_FirstTestChrome {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","/Users/selcuk/Desktop/selenium dependencies/drivers/chromedriver");


        WebDriver driver=new ChromeDriver();
        driver.get("https://www.trendyol.com/");
        driver.manage().window().maximize();

        //1. url kontrol
        String expectecdUrl="https://www.trendyol.com/";
        String actuallUrl=driver.getCurrentUrl();
        if (expectecdUrl.equals(actuallUrl)){
            System.out.println("Test Pass");
        }else{
            System.out.println("Test Failed");
        }
        //2.Title Kontrol trendyol geciyormu?
        String expectedTitle="trendyol";
        String actuallTitle=driver.getTitle();
        System.out.println(actuallTitle);
        if (actuallTitle.contains(expectedTitle)){
            System.out.println("Test Pass");
        }else{
            System.out.println("Test Failed");
        }
driver.close();
    }

}
