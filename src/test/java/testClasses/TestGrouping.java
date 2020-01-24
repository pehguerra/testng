package testClasses;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestGrouping {

    @BeforeClass(alwaysRun = true)
    public void setUp() {
        System.out.println("testGrouping -> before class");
    }

    @Test(groups = {"cars", "suv"})
    public void testBMWX6() {
        System.out.println("Running Test -> testGrouping ->  BMW X6");
    }

    @Test(groups = {"cars", "sedan"})
    public void testAudiA6() {
        System.out.println("Running Test -> testGrouping -> Audi A6");
    }

    @Test(groups = {"bikes"})
    public void testNinja() {
        System.out.println("Running Test -> testGrouping -> Kawasaki Ninja");
    }

    @Test(groups = {"bikes"})
    public void testHondaCBR() {
        System.out.println("Running Test -> testGrouping -> Honda CBR");
    }

    @AfterClass(alwaysRun = true)
    public void cleanUp() {
        System.out.println("testGrouping -> after class");
    }
}
