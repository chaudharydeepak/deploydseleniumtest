package org.deployd.test;

import net.lightbody.bmp.BrowserMobProxy;
import net.lightbody.bmp.BrowserMobProxyServer;
import net.lightbody.bmp.client.ClientUtil;
import org.openqa.selenium.Proxy;
import org.openqa.selenium.firefox.FirefoxOptions;

public class AgentUtil {

    static BrowserMobProxy proxy = new BrowserMobProxyServer();

    public static void proxyStart() {
        System.out.println("starting proxy --->");
        proxy.addHeader("currTestID", "~~~~~ TEST ID ~~~~~");
        proxy.start(0);
        Proxy seleniumProxy = ClientUtil.createSeleniumProxy(proxy);
        FirefoxOptions opts = new FirefoxOptions();
        String proxyOption = "--proxy-server=" + seleniumProxy.getHttpProxy();
        opts.addArguments(proxyOption);
    }

    public static void proxyStop() {
        proxy.stop();
        System.out.println("stopping proxy <---");
    }
}
