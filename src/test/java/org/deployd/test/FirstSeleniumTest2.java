package org.deployd.test;

import org.openqa.selenium.WebDriver;
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
        System.setProperty("webdriver.gecko.driver", "/Users/deepakchaudhary/dc_consulting/deployd/geckodriver");
        FirefoxBinary firefoxBinary = new FirefoxBinary();
        firefoxBinary.addCommandLineOptions("--headless");
        FirefoxOptions options = new FirefoxOptions();
        options.setBinary(firefoxBinary);
        options.setHeadless(true);
        driver = new FirefoxDriver(options);
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