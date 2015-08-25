//#Patterns: rulesets_java_j2ee.xml_UseProperClassLoader

public class Foo {
    //#Warn: rulesets_java_j2ee.xml_UseProperClassLoader
    ClassLoader cl = Bar.class.getClassLoader();
}
