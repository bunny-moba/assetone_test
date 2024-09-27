import org.openqa.selenium.support.ui.Select;  
import org.openqa.selenium.WebElement;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class Apilogs {

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
    Thread.sleep(500);
    driver.findElement(By.xpath("//button[normalize-space()='Yes']")).click();
    Thread.sleep(2000);
    driver.findElement(By.className("btn")).click();
    driver.findElement(By.cssSelector("a[href='/dashboard']")).click();
    driver.findElement(By.xpath("//span[normalize-space()='IoT Master Management']")).click();
    driver.findElement(By.xpath("//a[normalize-space()='Api Logs']")).click();


    // Selecting each API and looping for each one getting its result

    //driver.findElement(By.xpath("//div[@role='combobox']")).click();
    //driver.findElement(By.cssSelector("label[title='Aether Current State']")).click();
    Thread.sleep(5000);
    //driver.findElement(By.cssSelector(".ng-arrow-wrapper")).click();
    //driver.findElement(By.cssSelector("div[id='a74927e8ad4f-1'] div[class='custom-control custom-checkbox']")).click();
    //WebDriverWait wait = new WebDriverWait(driver,30);
    //wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".ng-arrow-wrapper")));
    // Checking and matching the success result
    
    WebElement dropdown = driver.findElement(By.cssSelector(".ng-arrow-wrapper"));
    dropdown.click();
    
    String[] optionTexts = {"Aether Current State", "Aether Summary Fuel Previous Day", "Aether Summary MW Current Day", "Aether Tree Vehicle"};

    driver.findElement(By.xpath("//label[normalize-space()='Aether Summary MW Previous Day']")).click();

    /*for (String optionText : optionTexts) {
        // Open the dropdown
        dropdown.click();
        
        // Find the option using visible text and click it
        WebElement option = driver.findElement(By.xpath("(//span[contains(text(),' " + optionText + "')]"));
        option.click();
        
        // Perform your play button click
        driver.findElement(By.className("btn")).click();
        
        // Capture the status
        String status = driver.findElement(By.xpath("//td[contains(text(),'Fail')]")).getText();
        System.out.println(optionText + ": " + status);
        
        Thread.sleep(2000); // Wait between selections
    }*/

  // here new changes from PC
   // driver.quit();
    };
}


