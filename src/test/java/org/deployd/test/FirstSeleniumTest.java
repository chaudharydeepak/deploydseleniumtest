package org.deployd.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class FirstSeleniumTest {

    private WebDriver driver;

    @BeforeTest
    public void beforeTest() {
        System.out.println("initializing web driver components");
        System.setProperty("webdriver.gecko.driver", "/Users/deepakchaudhary/dc_consulting/deployd/geckodriver");
        System.setProperty("webdriver.chrome.driver","/usr/local/bin/chromedriver");
        ChromeOptions  chromeOptions = new ChromeOptions();
        //FirefoxBinary firefoxBinary = new FirefoxBinary();
        //firefoxBinary.addCommandLineOptions("--headless");
        //FirefoxOptions options = new FirefoxOptions();
        //options.setBinary(firefoxBinary);
        chromeOptions.setHeadless(true);

        //driver = new FirefoxDriver(options);
        driver = new ChromeDriver(chromeOptions);
    }

    @Test
    public void buildingTestMethod() {
        //driver.get("https://admin:SGI2030@ai.lurn.tools/admin/v2/dashboarddetails");
        driver.get("https://dpdsel.free.beeceptor.com/");
        assertEquals(driver.getTitle(),"");
    }

    @Test
    public void buildingTestMethod2() {
        //driver.get("https://admin:SGI2030@ai.lurn.tools/admin/v2/dashboard");
        driver.get("https://dpdsel2.free.beeceptor.com/");
        assertEquals(driver.getTitle(),"");
    }

    @Test
    public void buildingTestMethod3() {
        //driver.get("https://ai.lurn.tools/");
        driver.get("https://dpdsel3.free.beeceptor.com/");
        assertEquals(driver.getTitle(),"");
    }

    @AfterTest
    public void afterTest() {
        //driver.close();
        driver.quit();
    }
}