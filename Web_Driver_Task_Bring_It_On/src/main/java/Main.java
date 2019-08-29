import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;


public class Main {

    public static void main(String []args) throws InterruptedException {
        System.out.println("Hello, from WebDriver!");

        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().pageLoadTimeout(25, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        driver.manage().timeouts().setScriptTimeout(25, TimeUnit.SECONDS);

        driver.get("https://pastebin.com/index");

        WebElement searchPasteCode = driver.findElement(By.id("paste_code"));
        searchPasteCode.sendKeys("git config --global user.name  \"New Sheriff in Town\"\n");
        searchPasteCode.sendKeys("git reset $(git commit-tree HEAD^{tree} -m \"Legacy code\")\n");
        searchPasteCode.sendKeys("git push origin master --force");

        WebElement searchSyntax = driver.findElement(By.xpath
                ("//*[@id=\"myform\"]/div[3]/div[1]/div[2]"));
        searchSyntax.click();
        WebElement searchSyntaxBash = driver.findElement(By.xpath
                ("//*[@id=\"myform\"]/div[3]/div[1]/div[2]/select/option[3]"));
        searchSyntaxBash.click();


        WebElement searchExpirationPaste = driver.findElement(By.xpath
                ("//*[@id=\"myform\"]/div[3]/div[2]/div[2]"));
        searchExpirationPaste.click();

        WebElement searchTenTime = driver.findElement(By.xpath
                ("//*[@id=\"myform\"]/div[3]/div[2]/div[2]/select/option[2]"));
        searchTenTime.click();

        WebElement searchPasteTitle = driver.findElement(By.xpath
                ("//*[@id=\"myform\"]/div[3]/div[5]/div[2]/input"));
        searchPasteTitle.sendKeys("\"how to gain dominance among developers\"");

        WebElement searchButtonCreate = driver.findElement(By.id("submit"));
        searchButtonCreate.click();

        Thread.sleep(5000);
        driver.quit();
    }
}