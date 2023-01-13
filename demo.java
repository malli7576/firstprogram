import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;


public class demo {
    public static void main(String[] args) {
        System.out.println("it is a demo class");
        int a=10;
        int b=30;
        System.out.println(a+b);
       // WebDriverManager.chromedriver().setup();
       System.setProperty("webdriver.chrome.driver","C:\\Users\\subra\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.apsrtconline.in/oprs-web/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));
        driver.manage().deleteAllCookies();
        driver.findElement(By.xpath("//a[@title='Track Service']")).click();
        driver.findElement(By.id("serviceCode")).sendKeys("5938");
        driver.findElement(By.id("TrackBusBtn")).click();
        driver.quit();
        List<String> list=new ArrayList<>();
        list.add("chrome");
        list.add("edge");
        list.add("safari");
        System.out.println(list);
        System.out.println("----------");
        System.out.println( list.get(1));
        list.remove(2);
        System.out.println("----------");
        System.out.println(list);
        list.add("chrome");
        list.add("edge");
        System.out.println("----------");
        System.out.println(list);
        List<String> list1 = new LinkedList<>(list);
        System.out.println("list1 is :"+list1);


    }
}
