import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class TestNG2 {
    WebDriver driver;

    @Test(priority = 1)
    void loginPage() {
        WebDriverManager.edgedriver().setup();
        WebDriver Driver1 = new EdgeDriver();
        driver.get("https://demo.nopcommerce.com/login?returnUrl=%2F");
    }

    @Test(priority = 2)
    void enterdetails() {
        driver.findElement(By.id("Email")).sendKeys("mitresh.22397@gmail.com");
        driver.findElement(By.className("password")).sendKeys("Mitresh123");
        driver.findElement(By.xpath("//*[@id=\"RememberMe\"]")).click();
    }

    @Test(priority = 3)
    void clicklogin() {
        By.className("button-1 login-button").findElement(driver).click();
    }
}