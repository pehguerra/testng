package testClasses;

import appCode.SomeClassToTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestSoftAsserts {

    @Test
    public void testSum() {
        SoftAssert sa = new SoftAssert();
        System.out.println("Running Test -> testSum");
        SomeClassToTest obj = new SomeClassToTest();
        int result = obj.sumNumbers(1, 2);
        sa.assertEquals(result, 3);
        System.out.println("Line after assert 1");
        sa.assertEquals(result, 3);
        System.out.println("Line after assert 2");
        sa.assertAll(); // Check if assert failed and fail the test case
    }
}
