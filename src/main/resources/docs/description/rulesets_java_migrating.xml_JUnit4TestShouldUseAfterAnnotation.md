In JUnit 3, the tearDown method was used to clean up all data entities required in running tests. JUnit 4 skips the tearDown method and executes all methods annotated with @After after running each test

Ex:

public class MyTest {
    public void tearDown() {
        bad();
    }
}

public class MyTest2 {
    @After public void tearDown() {
        good();
    }
}

[SOURCE](https://pmd.github.io/pmd-5.3.3/pmd-java/rules/java/migrating.html#JUnit4TestShouldUseAfterAnnotation)
