import io.github.bonigarcia.wdm.WebDriverManager;
import org.bouncycastle.asn1.eac.PublicKeyDataObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FirstTestNgClass {

    WebDriver driver;

    @BeforeTest
    public void prepare() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
       driver = new ChromeDriver();
       Thread.sleep(3000);

    }

    @AfterTest
    public void tearDown(){
        driver.quit();
    }

    @Test (priority = -2)
    public void  openWebsite()  {
        System.out.println("open the browser");
        driver.navigate().to("https://www.google.com");

    }

    @Test (priority = 0)
    public void signUp(){
        System.out.println("signing in");
    }
    @Test(priority = 1)
    public void logIn() {
        System.out.println("logging in");
    }

    @Test (priority = 2)
    public void addToCart(){
        System.out.println("add items");
    }

    @Test(priority = 3)
    public void logOut(){
        System.out.println("logging out");
    }

}
