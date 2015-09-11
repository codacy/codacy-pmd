In JUnit 3, test suites are indicated by the `suite()` method. In JUnit 4, suites are indicated through the `@RunWith(Suite.class)` annotation.

Ex:

```
public class BadExample extends TestCase{

  public static Test suite(){
    return new Suite();
  }
}
```

[Source](https://pmd.github.io/pmd-5.3.3/pmd-java/rules/java/migrating.html#JUnit4SuitesShouldUseSuiteAnnotation)
