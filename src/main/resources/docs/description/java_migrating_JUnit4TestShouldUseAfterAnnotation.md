Since: PMD 4.0

In JUnit 3, the tearDown method was used to clean up all data entities required in running tests. 
JUnit 4 skips the tearDown method and executes all methods annotated with @After after running each test

Example(s):
```
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
```

[Source](https://pmd.github.io/pmd-5.5.4/pmd-java/rules/java/migrating.html#JUnit4TestShouldUseAfterAnnotation)
