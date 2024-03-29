package testClasses;

import org.testng.annotations.*;

public class TestBeforeClassAnnotations {

    @BeforeClass
    public void setUp() {
        System.out.println("This runs once before class");
    }

    @AfterClass
    public void cleanUp() {
        System.out.println("This runs once after class");
    }

    @BeforeMethod
    public void beforeMethod() {
        System.out.println("This runs before every method");
    }

    @AfterMethod
    public void afterMethod() {
        System.out.println("This runs after every method");
    }

    @Test
    public void testMethod1() {
        System.out.println("Running Test -> testMethod1");
    }

    @Test
    public void testMethod2() {
        System.out.println("Running Test -> testMethod2");
    }
}
