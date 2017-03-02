//#Patterns: java_migrating_JUnit4SuitesShouldUseSuiteAnnotation
public class BadExample extends TestCase{
//#Info: java_migrating_JUnit4SuitesShouldUseSuiteAnnotation
    public static Test suite(){
        return new Suite();
    }
}

@RunWith(Suite.class) @SuiteClasses( { TestOne.class, TestTwo.class }) public class GoodTest { }