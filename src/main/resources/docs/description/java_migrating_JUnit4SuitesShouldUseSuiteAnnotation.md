Since: PMD 4.0

In JUnit 3, test suites are indicated by the suite() method. In JUnit 4, suites are indicated
through the @RunWith(Suite.class) annotation.

Example(s):
```
public class BadExample extends TestCase{

    public static Test suite(){
    	return new Suite();
    }
}

@RunWith(Suite.class)
@SuiteClasses( { TestOne.class, TestTwo.class })
public class GoodTest {
}
```

[Source](https://pmd.github.io/pmd-5.6.1/pmd-java/rules/java/migrating.html#JUnit4SuitesShouldUseSuiteAnnotation)
