package listenersPackage;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestNGMethod;
import org.testng.ITestResult;

public class CustomListener2 implements ITestListener {
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
}
