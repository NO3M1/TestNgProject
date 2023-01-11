import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SecondTestNgClass {

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
    
    @Test
    public void  openWebsite() throws InterruptedException {
        System.out.println("open the browser");
        driver.navigate().to("https://www.twitter.com");
        Thread.sleep(3000);
    }

    @Test
    public void signUp(){
        System.out.println("signing in");
    }
    @Test
    public void logIn() {
        System.out.println("logging in");
    }

    @Test
    public void addToCart(){
        System.out.println("add items");
    }

    @Test
    public void logOut(){
        System.out.println("logging out");
    }

    @Test
    public void closeBrowser(){
        System.out.println("closing browser");
    }
}
