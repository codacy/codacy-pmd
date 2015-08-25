//#Patterns: rulesets_java_migrating.xml_JUnit4SuitesShouldUseSuiteAnnotation
public class BadExample extends TestCase{
//#Warn: rulesets_java_migrating.xml_JUnit4SuitesShouldUseSuiteAnnotation
    public static Test suite(){
        return new Suite();
    }
}

@RunWith(Suite.class) @SuiteClasses( { TestOne.class, TestTwo.class }) public class GoodTest { }