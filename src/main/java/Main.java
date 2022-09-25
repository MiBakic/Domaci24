import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.*;

import java.time.Duration;

//Napisati program koji na sajtu:
//http://automationpractice.com
//dodaje najmanje 3 proizvoda u cart,
// nnastavlja do cart-a, izbacuje jedan proizvod,
// a drugom povecava kolicinu za 1.
public class Main {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Bakic\\Desktop\\selenium\\chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.get("http://automationpractice.com");

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        WebElement quickView1 = driver.findElement(By.xpath("//*[@id=\"homefeatured\"]/li[1]/div/div[1]/div/a[1]/img"));
        quickView1.click();
        WebElement addToCart1 = driver.findElement(By.xpath("//*[@id=\"add_to_cart\"]/button/span"));
        addToCart1.click();
        WebElement continue1 = driver.findElement(By.xpath("//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/span"));
        continue1.click();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        WebElement quickView2 = driver.findElement(By.xpath("//*[@id=\"homefeatured\"]/li[2]/div/div[1]/div/a[2]/span"));
        quickView1.click();
        WebElement addToCart2 = driver.findElement(By.xpath("//*[@id=\"add_to_cart\"]/button/span"));
        addToCart1.click();
        WebElement continue2 = driver.findElement(By.xpath("//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/span"));
        continue1.click();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        WebElement quickView3 = driver.findElement(By.xpath("//*[@id=\"homefeatured\"]/li[3]/div/div[1]/div/a[2]"));
        quickView1.click();
        WebElement addToCart3 = driver.findElement(By.xpath("//*[@id=\"add_to_cart\"]/button/span"));
        addToCart1.click();
        WebElement continue3 = driver.findElement(By.xpath("//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/span"));
        continue1.click();

        WebElement cartBtn= driver.findElement(By.xpath("//*[@id=\"header\"]/div[3]/div/div/div[3]/div/a"));
        cartBtn.click();

        WebElement minusBtn= driver.findElement(By.xpath("//*[@id=\"cart_quantity_down_4_16_0_0\"]/span"));
        minusBtn.click();

        WebElement addBtn= driver.findElement(By.xpath("//*[@id=\"cart_quantity_up_1_1_0_0\"]/span"));
        addBtn.click();

        driver.quit();




    }
}
