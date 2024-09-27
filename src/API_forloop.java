import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
//import org.openqa.selenium.support.ui.Select;  
//import org.openqa.selenium.WebElement;
import java.util.concurrent.TimeUnit;

public class API_forloop {

/**
 * @param args
 * @throws Exception
 */
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
    Thread.sleep(2000);
    driver.findElement(By.xpath("//button[normalize-space()='Yes']")).click();
    Thread.sleep(2000);
    driver.findElement(By.className("btn")).click();
    Thread.sleep(2000);
    driver.findElement(By.cssSelector("a[href='/dashboard']")).click();
    driver.findElement(By.xpath("//span[normalize-space()='IoT Master Management']")).click();
    driver.findElement(By.xpath("//a[normalize-space()='Api Logs']")).click();


    // Selecting each API and looping for each one getting its result

   // driver.findElement(By.xpath("//div[@role='combobox']")).click();
    //driver.findElement(By.cssSelector("label[title='Aether Current State']")).click();
   // driver.findElement(By.xpath("//div[@class='ng-select-container']")).click();
   String[] optionIds = {"a7b904e06ecb-0", "a7b904e06ecb-1", "a7b904e06ecb-2", "a7b904e06ecb-3"};

     // Loop through the dropdown items (assuming IDs range from 0 to 12)
     for (int i = 0; i < optionIds.length; i++) {
        // Build the dynamic CSS selector for each item
        Thread.sleep(5000);
        driver.findElement(By.cssSelector(".ng-arrow-wrapper")).click();
        String cssSelector = "div[id='" + optionIds[i] + "'] div[class='custom-control custom-checkbox']";


        
        // Find the element using the dynamic CSS selector and click it
        WebElement option = driver.findElement(By.cssSelector(cssSelector));
        option.click();

        driver.findElement(By.className("btn")).click();
        // Optionally, capture or validate the data after each selection
        // For example, capturing the selected text or status
        String status = driver.findElement(By.xpath("//td[contains(text(),'Fail")).getText();
        System.out.println("Option " + i + ": " + status);

        // If needed, add some wait to allow actions to complete
        try {
            Thread.sleep(1000); // sleep for 1 second
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


    // Checking and matching the success result




  // here new changes from PC
    driver.quit();
    };
}


