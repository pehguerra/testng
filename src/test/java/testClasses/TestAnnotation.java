package testClasses;

import org.testng.annotations.Test;
import appCode.SomeClassToTest;

public class TestAnnotation {
    @Test
    public void testMethod2() {
        System.out.println("Running Test -> testMethod2");
    }

    @Test
    public void testMethod3() {
        System.out.println("Running Test -> testMethod3");
    }

    @Test
    public void testMethod1() {
        SomeClassToTest obj = new SomeClassToTest();
        int result = obj.sumNumbers(1, 2);
        System.out.println("Running Test -> testMethod1");
    }
}
