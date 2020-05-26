// In this TC, i am going to answer some questions to onedio's quiz with select radio button.

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.Augmenter;

import java.io.File;

public class Onedio_Quizz {
    public static void main(String[] args){
         try {
             System.setProperty("webdriver.chrome.driver","chromedriver.exe");
             String url = "https://onedio.co/content/which-star-wars-character-are-you-13981";
             WebDriver driver = new ChromeDriver();
             driver.manage().window().maximize();
             driver.get(url);
             Thread.sleep(2000);

             // We have 10 question and we will create 10 answer for this questions.
             WebElement radio1 = driver.findElement(By.xpath("/html/body/div[4]/article/section[3]/div/div[4]"));
             radio1.click();
             Thread.sleep(1000);

             WebElement radio2 = driver.findElement(By.xpath("/html/body/div[4]/article/section[4]/div/div[1]"));
             radio2.click();
             Thread.sleep(1000);

             WebElement radio3 = driver.findElement(By.xpath("/html/body/div[4]/article/section[5]/div/div[2]"));
             radio3.click();
             Thread.sleep(1000);

             WebElement radio4 = driver.findElement(By.xpath("/html/body/div[4]/article/section[6]/div/div[3]"));
             radio4.click();
             Thread.sleep(1000);

             WebElement radio5 = driver.findElement(By.xpath("/html/body/div[4]/article/section[7]/div/div[5]"));
             radio5.click();
             Thread.sleep(1000);

             WebElement radio6 = driver.findElement(By.xpath("/html/body/div[4]/article/section[8]/div/div[2]"));
             radio6.click();
             Thread.sleep(1000);

             WebElement radio7 = driver.findElement(By.xpath("/html/body/div[4]/article/section[9]/div/div[7]"));
             radio7.click();
             Thread.sleep(1000);

             WebElement radio8 = driver.findElement(By.xpath("/html/body/div[4]/article/section[10]/div/div[3]"));
             radio8.click();
             Thread.sleep(1000);

             WebElement radio9 = driver.findElement(By.xpath("/html/body/div[4]/article/section[11]/div/div[2]"));
             radio9.click();
             Thread.sleep(1000);

             WebElement radio10 = driver.findElement(By.xpath("/html/body/div[4]/article/section[12]/div/div[8]"));
             radio10.click();
             Thread.sleep(1000);

             try{
                 TakesScreenshot srcShot =((TakesScreenshot)driver);
                 File srcFile = srcShot.getScreenshotAs(OutputType.FILE);
                 //String screenShot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BASE64);
                 FileUtils.copyFile(srcFile , new File("/Screenshots/Result.png"));
                 System.out.println("Screenshot has been taken, You can check your result!!!");
             }catch (Exception e){
                 System.out.println("Screenshot failed");
             }

             Thread.sleep(4000);
             driver.close();
             System.out.println("TEST PASSED");

         }catch (Exception e){
             System.out.println("TEST FAILED");
    }
}
}
/* Test Case Steps;
1- Open browser and send url
2- 10 questions in this quiz so we have 10 answers.
3- Create 10 radio button for 10 answers and enter their xpath
4- Take screenshot and save this png file for our path. I created Screenshots file under my project.
5- Close driver.
 */