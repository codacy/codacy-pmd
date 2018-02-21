//#Patterns: category_java_errorprone_CompareObjectsWithEquals
public class Foo {

    boolean soStuff(String a, String b) {
        //#Warn: category_java_errorprone_CompareObjectsWithEquals
        return a == b;
    }
}

