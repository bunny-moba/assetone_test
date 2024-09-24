import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
//import org.openqa.selenium.support.ui.Select;  
//import org.openqa.selenium.WebElement;
import java.util.concurrent.TimeUnit;

public class Apilogs {

@SuppressWarnings("deprecation")
public static void main(String[] args) throws Exception {
    
    WebDriver driver = new EdgeDriver();
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    driver.get("https://assetone.digital.lntecc.com/");   
    driver.manage().window().maximize();
   // String username = "myusername";
    driver.findElement(By.cssSelector("input[placeholder='Login Name'")).sendKeys("pbhargav");
    driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("Bhargav@265");
    String captcha = driver.findElement(By.className("captcha")).getText();
    System.out.println(captcha);

    driver.findElement(By.xpath("//input[@placeholder='Enter Captcha']")).sendKeys(captcha);
    driver.findElement(By.className("btn")).click();
    Thread.sleep(500);
    driver.findElement(By.xpath("//button[normalize-space()='Yes']")).click();
    Thread.sleep(2000);
    driver.findElement(By.className("btn")).click();
    driver.findElement(By.cssSelector("a[href='/dashboard']")).click();
    driver.findElement(By.xpath("//span[normalize-space()='IoT Master Management']")).click();
    driver.findElement(By.xpath("//a[normalize-space()='Api Logs']")).click();


    // Selecting each API and looping for each one getting its result

    driver.findElement(By.xpath("//div[@role='combobox']")).click();
    driver.findElement(By.cssSelector("label[title='Aether Current State']")).click();



    // Checking and matching the success result

    driver.findElement(By.)


   driver.quit();
    };
}


