import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class TestNG1 {
    WebDriver driver;

    //Open Browser
    @Test(priority = 1)
    void openbrowser() {
        WebDriverManager.edgedriver().setup();
        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("https://demo.nopcommerce.com/register?returnUrl=%2F");
    }

    //click enterdetails enterdetails page
    @Test(priority = 2)
    void enterdetails() throws Exception {
        driver.findElement(By.className("male")).click();
        driver.findElement(By.id("FirstName")).sendKeys("Mitresh");
        driver.findElement(By.id("LastName")).sendKeys("Lukhi");
        driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/form/div[1]/div[2]/div[4]/div/select[1]/option[23]"));
        driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/form/div[1]/div[2]/div[4]/div/select[2]/option[4]"));
        driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/form/div[1]/div[2]/div[4]/div/select[3]/option[86]"));
        driver.findElement(By.id("Email")).sendKeys("mitresh.22397@gmail.com");
        driver.findElement(By.id("Password")).sendKeys("Mitresh123");
        driver.findElement(By.id("ConfirmPassword")).sendKeys("Mitresh123");
    }

    void Clickonregister() {
        driver.findElement(By.id("register-button")).click();

    }
}


