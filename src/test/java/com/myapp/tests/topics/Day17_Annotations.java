package com.myapp.tests.topics;

import org.testng.annotations.*;

public class Day17_Annotations {

    /*
    @Test : @Test : creates a test case. marks a method as a test case. In this class there are 5 test cases
    @Before and @After : there are 5 Before and 5 after anntations
    HYARARSHI suite > test > group > class > method
    @Ignore : Skip/Ignore test cases. Eg; ignore test3
    @Test(enable = false) : Disable the test case. By default, enable=true. Eg: disable test 4
    @Test (priority) = priority number): TestN runs in alphabetical order by default. use priority to prioritize the test
    Best practice:  when you use priority, then use priority for ALL of the test cases. and give different numbers.


     */


    @BeforeSuite
    public void beforeSuite() {
        System.out.println("before suite");
    }

    @AfterSuite
    public void afterSuite() {
        System.out.println("after suite");
    }

    @BeforeTest
    public void beforeTest() {
        System.out.println("before test");
    }

    @AfterTest
    public void afterTest() {
        System.out.println("after test");
    }

    @BeforeGroups
    public void beforeGroups() {
        System.out.println("before groups");
    }

    @AfterGroups
    public void afterGroups() {
        System.out.println("after groups");
    }

    @BeforeClass
    public void beforeClass() {
        System.out.println("before class");
    }

    @AfterClass
    public void afterClass() {
        System.out.println("after class");
    }

    @BeforeMethod
    public static void beforeMethod() {
        System.out.println("before method");
    }

    @AfterMethod
    public static void afterMethod() {
        System.out.println("after method");
    }
    @Test(priority = -3)
    public void test1() {
        System.out.println(" Test 1");
    }

    @Test(priority = -10)
    public void test2() {
        System.out.println(" Test 1 ");
    }

    @Test@Ignore
    public void test3() {
        System.out.println(" Test 3 ");
    }

    @Test(enabled = false)
    public void test4() {
        System.out.println(" Test 4 ");
    }

    @Test(priority = 2)
    public void test5() {
        System.out.println(" Test 5 ");
    }
    @Test
    public void test6() {
        System.out.println(" Test 6 ");
    }


}




