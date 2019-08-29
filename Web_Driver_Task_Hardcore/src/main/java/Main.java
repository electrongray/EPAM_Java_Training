import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.*;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        System.out.println("Hello, from WebDriver!");
        try {
            File myObj = new File("file.txt");
            if (myObj.createNewFile()) {
                System.out.println("File created: " + myObj.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        WebDriver driver = new ChromeDriver();
        driver.get("https://10minutemail.com");
        WebElement searchEmail = driver.findElement(By.xpath
                ("//*[@id=\"mailAddress\"]"));
        searchEmail.getAttribute("value");
        System.out.println(searchEmail.getAttribute("value"));
        try {
            FileWriter myWriter = new FileWriter("file.txt");
            myWriter.write(searchEmail.getAttribute("value"));
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        String data = null;
        try {
            File myObj = new File("file.txt");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                data = myReader.nextLine();
                System.out.println(data);
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        driver.get("file:///C:/data/temp/Web_Driver_Task/file.txt");
        WebElement uploadElement = driver.findElement(By.xpath("/html/body/pre"));
        uploadElement.getAttribute("data");
        driver.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.manage().timeouts().setScriptTimeout(15, TimeUnit.SECONDS);
        driver.get("https://cloud.google.com/");
        WebElement searchAllProducts = driver.findElement(By.xpath
                ("//*[@id=\"gc-wrapper\"]/footer[1]/nav/ul/li[1]/ul/li[12]/a"));
        searchAllProducts.click();
        WebElement searchSeePricing = driver.findElement(By.xpath
                ("//*[@id=\"google-cloud-platform\"]/div[1]/section/div[3]/a[2]"));
        searchSeePricing.click();
        WebElement searchCalculators = driver.findElement(By.xpath
                ("//*[@id=\"cloud-site\"]/div/section[4]/section/div/div[2]/a/span/i"));
        searchCalculators.click();
        System.out.println("Page title is: " + driver.getTitle());
        driver.get("https://cloudpricingcalculator.appspot.com/");
        WebElement searchButtonOk = driver.findElement(By.xpath
                ("//*[@id=\"input-0\"]"));
        searchButtonOk.click();
        WebElement searchCompEngine = driver.findElement(By.xpath
                ("//*[@id=\"ul-0\"]/li[1]/md-autocomplete-parent-scope/span"));
        searchCompEngine.click();
        WebElement searchButton = driver.findElement(By.xpath
                ("//*[@id=\"input_52\"]"));
        searchButton.sendKeys("4");
        WebElement searchButtonFor = driver.findElement(By.xpath
                ("//*[@id=\"input_53\"]"));
        searchButtonFor.sendKeys(" ");
        WebElement searchButtonOS = driver.findElement(By.xpath
                ("//*[@id=\"select_value_label_45\"]/span[2]"));
        searchButtonOS.click();
        WebElement searchButtonOsOk = driver.findElement(By.xpath
                ("//*[@id=\"select_option_54\"]/div[1]"));
        searchButtonOsOk.click();
        WebElement searchButtonMachineType = driver.findElement(By.xpath
                ("//*[@id=\"select_value_label_48\"]/span[2]"));
        searchButtonMachineType.click();
        WebElement searchButtonMachine = driver.findElement(By.xpath
                ("//*[@id=\"select_option_216\"]/div[1]"));
        searchButtonMachine.click();
        WebElement searchSwitch = driver.findElement(By.xpath
                ("//*[@id=\"mainForm\"]/div[1]/div/md-card/md-card-content/div/div[1]/form/div[8]/div[1]/md-input-container/md-checkbox/div[1]"));
        searchSwitch.click();
        WebElement searchButtonNumberGPU = driver.findElement(By.xpath
                ("//*[@id=\"select_value_label_339\"]/span[2]"));
        searchButtonNumberGPU.click();
        WebElement searchButtonNumber = driver.findElement(By.xpath
                ("//*[@id=\"select_option_346\"]/div"));
        searchButtonNumber.click();
        WebElement searchButtonGpuType = driver.findElement(By.xpath
                ("//*[@id=\"select_value_label_340\"]/span[2]"));
        searchButtonGpuType.click();
        WebElement searchButtonGpu = driver.findElement(By.xpath
                ("//*[@id=\"select_option_351\"]/div[1]"));
        searchButtonGpu.click();
        WebElement searchButtonLocalSsd = driver.findElement(By.xpath
                ("//*[@id=\"select_value_label_49\"]/span[2]"));
        searchButtonLocalSsd.click();
        WebElement searchButtonSsd = driver.findElement(By.xpath
                ("//*[@id=\"select_option_170\"]/div[1]"));
        searchButtonSsd.click();
        WebElement searchButtonDataCenter = driver.findElement(By.xpath
                ("//*[@id=\"select_value_label_50\"]/span[2]"));
        searchButtonDataCenter.click();
        WebElement searchButtonData = driver.findElement(By.xpath
                ("//*[@id=\"select_option_184\"]/div"));
        searchButtonData.click();
        WebElement searchButtonUsageCommit = driver.findElement(By.xpath
                ("//*[@id=\"select_value_label_51\"]/span[2]"));
        searchButtonUsageCommit.click();
        WebElement searchButtonUsage = driver.findElement(By.xpath
                ("//*[@id=\"select_option_82\"]/div"));
        searchButtonUsage.click();
        WebElement searchButtonEstimate = driver.findElement(By.xpath
                ("//*[@id=\"mainForm\"]/div[1]/div/md-card/md-card-content/div/div[1]/form/div[13]/button"));
        searchButtonEstimate.click();
        WebElement searchEstimateEmail = driver.findElement(By.xpath
                ("//*[@id=\"email_quote\"]"));
        searchEstimateEmail.click();
        WebElement searchEstimateEmailOk = driver.findElement(By.xpath
                ("//*[@id=\"input_393\"]"));
        searchEstimateEmailOk.sendKeys( "c44074@urhen.com");
        WebElement searchSendEmail = driver.findElement(By.xpath
                ("//*[@id=\"dialogContent_399\"]/form/md-dialog-actions/button[2]"));
        searchSendEmail.click();
        driver.get("https://10minutemail.com");
        Thread.sleep(600000);
        driver.quit();
    }
}