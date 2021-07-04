//package org.deployd.test;
//
//import net.lightbody.bmp.BrowserMobProxy;
//import net.lightbody.bmp.BrowserMobProxyServer;
//import net.lightbody.bmp.client.ClientUtil;
//import org.openqa.selenium.By;
//import org.openqa.selenium.Proxy;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.firefox.FirefoxOptions;
//
//public class Test {
//
//    public static void main(String[] args) {
//
//        // start the proxy
//        BrowserMobProxy proxy = new BrowserMobProxyServer();
//        proxy.start(0);
//
//        // get the Selenium proxy object
//        Proxy seleniumProxy = ClientUtil.createSeleniumProxy(proxy);
//
//        // put our custom header to each request
//        proxy.addRequestFilter((request, contents, messageInfo)->{
//            request.headers().add("my-test-header", "my-test-value");
//            System.out.println(messageInfo.getOriginalRequest() + " : " + request.headers().entries().toString());
//            return null;
//        });
//
//        FirefoxOptions opts = new FirefoxOptions();
//        String proxyOption = "--proxy-server=" + seleniumProxy.getHttpProxy();
//        opts.addArguments(proxyOption);
//        System.setProperty("webdriver.gecko.driver", "/Users/deepakchaudhary/dc_consulting/deployd/geckodriver");
//        FirefoxDriver driver = new FirefoxDriver(opts);
//        driver.get("http://demo.guru99.com/");
//        WebElement element = driver.findElement(By.xpath("//input[@name='emailid']"));
//        element.sendKeys("abc@gmail.com");
//        WebElement button = driver.findElement(By.xpath("//input[@name='btnLogin']"));
//        button.click();
//
//       // proxy.abort();
//        System.exit(0);
//    }
//}
