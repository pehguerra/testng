package testClasses;

import appCode.SomeClassToTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestAsserts {

    @Test
    public void testSum() {
        System.out.println("Running Test -> testSum");
        SomeClassToTest obj = new SomeClassToTest();
        int result = obj.sumNumbers(1, 2);
        Assert.assertEquals(result, 3);
    }

    @Test
    public void testStrings() {
        System.out.println("Running Test -> testStrings");
        String expectedString = "Hello World";
        SomeClassToTest obj = new SomeClassToTest();
        String result = obj.addString("Hello", "World");
        Assert.assertEquals(result, expectedString);
    }

    @Test
    public void testArrays() {
        System.out.println("Running Test -> testArrays");
        int[] expectedArray = {1, 2, 3};
        SomeClassToTest obj = new SomeClassToTest();
        int[] result = obj.getArray();
        Assert.assertEquals(result, expectedArray);
    }
}
