package testClasses;

import appCode.SomeClassToTest;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestDependent {

    SomeClassToTest obj;

    @BeforeClass
    public void setUp() {
        System.out.println("testDependent -> before class");
        obj = new SomeClassToTest();
    }

    @AfterClass
    public void cleanUp() {
        System.out.println("testDependent -> after class");
    }

    @Test(dependsOnMethods = {"testMethod2"}, alwaysRun = true)
    public void testMethod1() {
        System.out.println("Running Test -> testDependent -> testMethod1");
    }

    @Test
    public void testMethod2() {
        System.out.println("Running Test -> testDependent -> testMethod2");
        int result = obj.sumNumbers(1, 2);
        Assert.assertEquals(result, 2);
    }

    @Test(dependsOnMethods = {"testMethod1"})
    public void testMethod3() {
        System.out.println("Running Test -> testDependent -> testMethod3");
    }

    @Test
    public void testMethod4() {
        System.out.println("Running Test -> testDependent -> testMethod4");
    }
}
