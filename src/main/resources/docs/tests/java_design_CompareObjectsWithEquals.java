//#Patterns: java_design_CompareObjectsWithEquals
public class Foo {

    boolean soStuff(String a, String b) {
        //#Warn: java_design_CompareObjectsWithEquals
        return a == b;
    }
}

