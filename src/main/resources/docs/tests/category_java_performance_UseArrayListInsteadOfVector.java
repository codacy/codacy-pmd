//#Patterns: category_java_performance_UseArrayListInsteadOfVector

public class Foo {
    public void bar() {
        //#Warn: category_java_performance_UseArrayListInsteadOfVector
        Collection c1 = new Vector();

        Collection c2 = new ArrayList(); //much better performance
    }
}
