package testClasses;

import base.BaseTestSuite;
import org.testng.annotations.*;

public class TestClass1 extends BaseTestSuite {

    @BeforeClass
    public void setUp() {
        System.out.println("testClass1 -> before class");
    }

    @AfterClass
    public void cleanUp() {
        System.out.println("testClass1 -> after class");
    }

    @BeforeMethod
    public void beforeMethod() {
        System.out.println("testClass1 -> before method");
    }

    @AfterMethod
    public void afterMethod() {
        System.out.println("testClass1 -> after method");
    }

    @Test
    public void testMethod1() {
        System.out.println("Running Test -> testClass1 ->  testMethod1");
    }

    @Test
    public void testMethod2() {
        System.out.println("Running Test -> testClass1 -> testMethod2");
    }
}
