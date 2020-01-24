package listenersPackage;

import org.testng.*;

public class CustomListeners implements IInvokedMethodListener, ITestListener, ISuiteListener {

    @Override
    public void beforeInvocation(IInvokedMethod method, ITestResult testResult) {
        // Before every method in the Test Class
        System.out.println("beforeInvocation: " + testResult.getTestClass().getName() +
                " => " + method.getTestMethod().getMethodName());
    }

    @Override
    public void afterInvocation(IInvokedMethod method, ITestResult testResult) {
        System.out.println("afterInvocation: " + testResult.getTestClass().getName() +
                " => " + method.getTestMethod().getMethodName());
    }

    @Override
    public void onTestStart(ITestResult result) {
        // When test method start
        System.out.println("onTestStart -> Test Name: " + result.getName());
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        // If test method is successful
        System.out.println("onTestSuccess -> Test Name: " + result.getName());
    }

    @Override
    public void onTestFailure(ITestResult result) {
        // If test method is failed
        System.out.println("onTestFailure -> Test Name: " + result.getName());
    }

    @Override
    public void onTestSkipped(ITestResult result) {
        // If test method is skipped
    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
        // Soft assertions
    }

    @Override
    public void onTestFailedWithTimeout(ITestResult result) {
        // If test method is failed because of time off
    }

    @Override
    public void onStart(ITestContext context) {
        // Before <test> in xml
        System.out.println("onStart -> Test Tag Name: " + context.getName());
        ITestNGMethod methods[] = context.getAllTestMethods();
        System.out.println("These methods will be executed in this test tag:");
        for(ITestNGMethod method : methods) {
            System.out.println(method.getMethodName());
        }
    }

    @Override
    public void onFinish(ITestContext context) {
        // After <test> in xml
        System.out.println("onFinish -> Test Tag Name: " + context.getName());
    }

    @Override
    public void onStart(ISuite suite) {
        // Before <Suite> in xml
        System.out.println("onStart: before suite starts");
    }

    @Override
    public void onFinish(ISuite suite) {
        // After <Suite> in xml
        System.out.println("onFinish: after suite starts");
    }
}
