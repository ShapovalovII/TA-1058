import io.trueautomation.client.driver.TrueAutomationDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import static io.trueautomation.client.TrueAutomationHelper.ta;

public class exampleTest {
    private WebDriver driver;

    @BeforeTest
    public void beforeTest() {
        Dimension dimension = new Dimension(1640, 1000);
        driver = new TrueAutomationDriver();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.manage().window().setSize(dimension);
    }

    @Test
    public void exampleTest() throws InterruptedException {
        driver.get("https://calc.by/math-calculators/scientific-calculator.html");

        driver.findElement(By.xpath(ta("Calc:1:c","//a[@id='btn_1']"))).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath(ta("Calc:2:c", "//a[@id='btn_2']"))).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath(ta("Calc:3:c", "//a[@id='btn_3']"))).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath(ta("Calc:4:c", "//a[@id='btn_4']"))).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath(ta("Calc:5:c", "//a[@id='btn_5']"))).click();

        Thread.sleep(3000);
    }

    @AfterTest
    public void afterTest() {
        driver.quit();
    }
}
