import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Hello, from WebDriver!");

        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.manage().timeouts().setScriptTimeout(15, TimeUnit.SECONDS);

        driver.get("https://pastebin.com/index");

        WebElement searchPasteCode = driver.findElement(By.id("paste_code"));
        searchPasteCode.sendKeys("Hello from WebDriver");

        WebElement searchExpirationTime = driver.findElement(By.xpath
                ("//*[@id=\"myform\"]/div[3]/div[2]/div[2]"));
        searchExpirationTime.click();
        WebElement searchTenTime = driver.findElement(By.xpath
                ("//*[@id=\"myform\"]/div[3]/div[2]/div[2]/span"));
        searchTenTime.click();


        WebElement searchPasteTitle = driver.findElement(By.xpath
                ("//*[@id=\"myform\"]/div[3]/div[5]/div[2]/input"));
        searchPasteTitle.sendKeys("helloweb");

        WebElement searchButtonCreate = driver.findElement(By.id("submit"));
        searchButtonCreate.click();

        Thread.sleep(5000);
        driver.quit();
    }
}