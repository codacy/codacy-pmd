//#Patterns: migrating_JUnit4SuitesShouldUseSuiteAnnotation
public class BadExample extends TestCase{
//#Warn: migrating_JUnit4SuitesShouldUseSuiteAnnotation
    public static Test suite(){
        return new Suite();
    }
}

@RunWith(Suite.class) @SuiteClasses( { TestOne.class, TestTwo.class }) public class GoodTest { }