//#Patterns: category_java_bestpractices_JUnit4SuitesShouldUseSuiteAnnotation
public class BadExample extends TestCase{
//#Warn: category_java_bestpractices_JUnit4SuitesShouldUseSuiteAnnotation
    public static Test suite(){
        return new Suite();
    }
}

@RunWith(Suite.class) @SuiteClasses( { TestOne.class, TestTwo.class }) public class GoodTest { }
