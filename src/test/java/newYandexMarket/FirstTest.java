package newYandexMarket;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTest {
    public ChromeDriver driver;
    @Before
    public void setup() {
        System.setProperty("webdriver.chrome.driver", "C:/Users/Рим/IdeaProjects/chromedriver.exe");
        driver = new ChromeDriver();
    }
    @Test
    public void firstTest() {
        driver.get("https://market.yandex.ru");
        System.out.println("Test started. Watch in browser!");
        driver.findElement(By.id("header-search")).sendKeys("Mac Book Air");
        driver.findElement(By.id("header-search")).submit();
        driver.findElement((By.linkText("Ноутбук Apple MacBook Air 13 with Retina display Late 2018"))).click();
        driver.findElement((By.className("n-product-title-features__toolbar"))).click();


    }
    @After
    public void exit() {
        System.out.println("Test Finished!");
        try {
            Thread.sleep(50000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.quit();
            }
}