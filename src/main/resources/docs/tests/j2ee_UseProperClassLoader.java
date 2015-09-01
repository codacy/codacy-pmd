//#Patterns: j2ee_UseProperClassLoader

public class Foo {
    //#Warn: j2ee_UseProperClassLoader
    ClassLoader cl = Bar.class.getClassLoader();
}
