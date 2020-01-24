package testClasses;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestPriority {

    @BeforeClass
    public void setUp() {
        System.out.println("testPriority -> before class");
    }

    @AfterClass
    public void cleanUp() {
        System.out.println("testPriority -> after class");
    }

    @Test(priority = 2)
    public void testMethod1() {
        System.out.println("Running Test -> testPriority -> testMethod1");
    }

    @Test(priority = 1)
    public void testMethod2() {
        System.out.println("Running Test -> testPriority -> testMethod2");
    }

    @Test(priority = 0)
    public void testMethod3() {
        System.out.println("Running Test -> testPriority -> testMethod3");
    }
}
