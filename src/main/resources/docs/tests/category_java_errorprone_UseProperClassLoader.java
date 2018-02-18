//#Patterns: category_java_errorprone_UseProperClassLoader

public class Foo {
    //#Warn: category_java_errorprone_UseProperClassLoader
    ClassLoader cl = Bar.class.getClassLoader();
}
