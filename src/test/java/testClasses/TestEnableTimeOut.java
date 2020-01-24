package testClasses;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestEnableTimeOut {

    @BeforeClass
    public void setUp() {
        System.out.println("testEnableTimeOut -> before class");
    }

    @AfterClass
    public void cleanUp() {
        System.out.println("testEnableTimeOut -> after class");
    }

    @Test(enabled = false)
    public void testMethod1() {
        System.out.println("Running Test -> testEnableTimeOut -> testMethod1");
    }

    @Test(timeOut = 300)
    public void testMethod2() throws InterruptedException {
        Thread.sleep(200);
        System.out.println("Running Test -> testEnableTimeOut -> testMethod2");
    }
}
