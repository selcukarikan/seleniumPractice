package day01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Test_FirstTestEdge {
    public static void main(String[] args) {
        System.setProperty( "webdriver.edge.driver","/Users/selcuk/Desktop/selenium dependencies/drivers/msedgedriver");

        WebDriver driver=new EdgeDriver();
        driver.get("https://www.amazon.com");
    }
}
