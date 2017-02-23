//#Patterns: java_j2ee_UseProperClassLoader

public class Foo {
    //#Warn: java_j2ee_UseProperClassLoader
    ClassLoader cl = Bar.class.getClassLoader();
}
