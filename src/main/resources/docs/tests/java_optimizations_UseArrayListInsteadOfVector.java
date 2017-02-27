//#Patterns: java_optimizations_UseArrayListInsteadOfVector

public class Foo {
    public void bar() {
        //#Warn: java_optimizations_UseArrayListInsteadOfVector
        Collection c1 = new Vector();

        Collection c2 = new ArrayList(); //much better performance
    }
}
