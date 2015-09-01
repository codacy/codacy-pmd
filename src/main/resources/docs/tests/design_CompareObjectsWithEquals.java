//#Patterns: design_CompareObjectsWithEquals
public class Foo {

    boolean soStuff(String a, String b) {
        //#Err: design_CompareObjectsWithEquals
        return a == b;
    }
}

