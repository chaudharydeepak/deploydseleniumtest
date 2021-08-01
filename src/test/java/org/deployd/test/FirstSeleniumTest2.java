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

public class FirstSeleniumTest2 {

    private WebDriver driver;

    @BeforeTest
    public void beforeTest() {
//        System.setProperty("webdriver.gecko.driver", "/usr/local/bin/geckodriver");
//        FirefoxBinary firefoxBinary = new FirefoxBinary();
//        firefoxBinary.addCommandLineOptions("--headless");
//        FirefoxOptions options = new FirefoxOptions();
//        options.setBinary(firefoxBinary);
//        options.setHeadless(true);
//        driver = new FirefoxDriver(options);
        System.out.println("initializing web driver components");
        System.setProperty("webdriver.gecko.driver", "/Users/deepakchaudhary/dc_consulting/deployd/geckodriver");
        System.setProperty("webdriver.chrome.driver","/usr/local/bin/chromedriver");
        ChromeOptions chromeOptions = new ChromeOptions();
        //FirefoxBinary firefoxBinary = new FirefoxBinary();
        //firefoxBinary.addCommandLineOptions("--headless");
        //FirefoxOptions options = new FirefoxOptions();
        //options.setBinary(firefoxBinary);
        chromeOptions.setHeadless(true);

        //driver = new FirefoxDriver(options);
        driver = new ChromeDriver(chromeOptions);
    }

    @Test
    public void buildingTestMethod3() {
        driver.get("https://dpdsel4.free.beeceptor.com/");
        assertEquals(driver.getTitle(),"");
    }

    @AfterTest
    public void afterTest() {
        //driver.close();
        driver.quit();
    }
}