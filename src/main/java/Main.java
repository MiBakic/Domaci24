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
        driver.manage().window().maximize();
//
        WebElement product1= driver.findElement(By.xpath("//*[@id=\"homefeatured\"]/li[4]/div/div[2]/div[2]/a[1]/span" ));
        product1.click();

        WebElement continueShoppingBtn1= driver.findElement(By.xpath("//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/span/span/i"));
        continueShoppingBtn1.click();

        Wait<WebDriver> waiter1= new FluentWait<>(driver).withTimeout(Duration.ofSeconds(15)).pollingEvery(Duration.ofSeconds(2));

        WebElement product2= driver.findElement(By.xpath("//*[@id=\"homefeatured\"]/li[2]/div/div[2]/div[2]/a[1]/span"));
        product2.click();

        continueShoppingBtn1.click();
        Wait<WebDriver> waiter2= new FluentWait<>(driver).withTimeout(Duration.ofSeconds(15)).pollingEvery(Duration.ofSeconds(2));

        WebElement product3= driver.findElement(By.xpath("//*[@id=\"homefeatured\"]/li[1]/div/div[2]/div[2]/a[1]/span"));
        product3.click();

        WebDriverWait driverWait= new WebDriverWait(driver,Duration.ofSeconds(6));

        WebElement cartBtn= driver.findElement(By.xpath("//*[@id=\"header\"]/div[3]/div/div/div[3]/div/a"));
        cartBtn.click();

        WebElement minusBtn= driver.findElement(By.xpath("//*[@id=\"cart_quantity_down_4_16_0_0\"]/span"));
        minusBtn.click();

        WebElement addBtn= driver.findElement(By.xpath("//*[@id=\"cart_quantity_up_1_1_0_0\"]/span"));
        addBtn.click();

        driver.quit();




    }
}
