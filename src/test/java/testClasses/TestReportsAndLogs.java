package testClasses;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.*;

public class TestReportsAndLogs {

    @BeforeClass
    public void setUp() {
        Reporter.log("TestReportsAndLogs Reporter -> This runs once before class", true);
    }

    @AfterClass
    public void cleanUp() {
        Reporter.log("TestReportsAndLogs Reporter -> This runs once after class", true);
    }

    @BeforeMethod
    public void beforeMethod() {
        Reporter.log("TestReportsAndLogs Reporter -> This runs before every method", true);
    }

    @AfterMethod
    public void afterMethod() {
        Reporter.log("TestReportsAndLogs Reporter -> This runs after every method", true);
    }

    @Test
    public void testMethod1() {
        Reporter.log("TestReportsAndLogs Reporter -> testMethod1", true);
    }

    @Test
    public void testMethod2() {
        Reporter.log("TestReportsAndLogs Reporter -> testMethod2", true);
        Assert.assertTrue(false);
    }

    @Test
    public void testMethod3() {
        Reporter.log("TestReportsAndLogs Reporter -> testMethod1", true);
    }
}
