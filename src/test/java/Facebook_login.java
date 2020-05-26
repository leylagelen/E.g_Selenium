import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Facebook_login {
    public static void main(String[] args) {

        try {
            System.setProperty("webdriver.chrome.driver", "chromedriver.exe/path");
            WebDriver driver = new ChromeDriver(); //Open with chrome browser
            driver.manage().window().maximize();
            driver.get("https://www.facebook.com/"); // Web page url
            Thread.sleep(2000); // sleep during 5 seconds

            // We send login data, emial and password
            WebElement login_email = driver.findElement(By.id("email"));
            login_email.sendKeys("youremail");
            WebElement login_password = driver.findElement(By.id("pass"));
            login_password.sendKeys("yourpassword");
            WebElement button = driver.findElement(By.xpath("//*[@id=\"loginbutton\"]"));
            button.click();
            System.out.println("Login");
            Thread.sleep(5000);

            //Log out from facebook profile
            WebDriverWait wait = new WebDriverWait(driver, 10);
            WebElement accountSettings = wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Account")));
            accountSettings.click(); //this will click on setting link to open menu
            WebElement logOut = wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Sign out")));
            logOut.click();
            System.out.println("Log Out");
            Thread.sleep(5000);
            driver.close(); // close driver
            System.out.println("TEST PASSED");
        } catch (Exception e) {
            System.out.println("TEST FAILED");
        }
    }
}
    /*Test case steps;
        1- Open Chrome browser
        2- Send facebook url
        3- Send email address and password to text area for login
        4- Click Login button
        5- Wait and log out from account and close driver
        */