package testClasses;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestParameters {

    @BeforeClass
    @Parameters({"browser", "platform"})
    public void setUp(String browser, String platform) {
        System.out.println("testParameters -> before class");
        System.out.println("1. Parameter value from xml file: " + browser);
        System.out.println("2. Parameter value from xml file: " + platform);
    }

    @Test(priority = 2)
    @Parameters({"response"})
    public void testMethod1(String response) {
        String[] stringArray = response.split(",");
        System.out.println("Running Test -> testParameters -> testMethod1");
        System.out.println("Response from XML file: " + response);
        System.out.println("stringArray[0] from XML file: " + stringArray[0]);
        System.out.println("stringArray[1] from XML file: " + stringArray[1]);
    }
}
