//#Patterns: category_java_performance_ConsecutiveLiteralAppends

public class Foo {
    public void bar() {
//#Warn: category_java_performance_ConsecutiveLiteralAppends
StringBuffer buf = new StringBuffer(); buf.append("Hello").append(" ").append("World"); // poor buf.append("Hello World"); // good


    }
}

