package org.deployd.test;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestNgListener implements ITestListener {
    @Override
    public void onTestStart(ITestResult result) {
        System.out.println("New Test Started" + result.getName());
        //AgentUtil.proxyStart();
        //AgentUtil.proxy.addHeader("CUSTOM","CUVAL");
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        System.out.println("Test Successfully Finished" + result.getName());
    }

    @Override
    public void onTestFailure(ITestResult result) {
        System.out.println("Test Failed" + result.getName());
    }

    @Override
    public void onTestSkipped(ITestResult result) {
        System.out.println("Test Skipped" + result.getName());
    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
        System.out.println("Test Failed but within success percentage" + result.getName());
    }

    @Override
    public void onStart(ITestContext context) {
        System.out.println("This is onStart method" + context.getOutputDirectory());
    }

    @Override
    public void onFinish(ITestContext context) {
        System.out.println("This is onFinish method" + context.getPassedTests());
        AgentUtil.proxyStop();
    }
}
