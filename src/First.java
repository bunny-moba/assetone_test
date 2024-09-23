import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class First {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        WebDriver driver = new EdgeDriver();
        driver.get("https://www.google.com");
        driver.quit();   
    }
}