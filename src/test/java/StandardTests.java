import static org.junit.jupiter.api.Assertions.fail;
import static org.junit.jupiter.api.Assumptions.assumeTrue;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class StandardTests {
    private static String name;

    @BeforeAll
    static void initAll() {
        name = "sahar";
        System.out.println("initALL");
    }

    @BeforeEach
    void init() {
//        name="Eshan";
        System.out.println("init");
    }



    @Test
    void succeedingTest2() throws InterruptedException {
        Thread.sleep(5000);
        System.out.println("succeedingTest2");
        System.out.println("name=" + name);
    }
    @Test
    void succeedingTest() {
        name = "";
        System.out.println("succeedingTest");
        System.out.println("name=" + name);
    }
    @Test
    void failingTest() {
        System.out.println("failingTest");
        fail("a failing test");

    }

    @Test
    @Disabled("for demonstration purposes")
    void skippedTest() {
        // not executed
        System.out.println("skippedTest");
    }

    @Test
    void abortedTest() {
        System.out.println("abortedTest");
        assumeTrue("abc".contains("Z"));
        fail("test should have been aborted");
    }

    @AfterEach
    void tearDown() {
        System.out.println("tearDown");

    }

    @AfterAll
    static void tearDownAll() {
        System.out.println("tearDownAll");

    }

}