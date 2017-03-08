Since: PMD 4.0

In JUnit 3, the setUp method was used to set up all data entities required in running tests. 
JUnit 4 skips the setUp method and executes all methods annotated with @Before before all tests

Example(s):
```
public class MyTest {
    public void setUp() {
        bad();
    }
}
public class MyTest2 {
    @Before public void setUp() {
        good();
    }
}
```

[Source](https://pmd.github.io/pmd-5.5.4/pmd-java/rules/java/migrating.html#JUnit4TestShouldUseBeforeAnnotation)
