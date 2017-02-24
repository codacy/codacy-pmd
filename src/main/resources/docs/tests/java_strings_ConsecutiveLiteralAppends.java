//#Patterns: java_strings_ConsecutiveLiteralAppends

public class Foo {
    public void bar() {
//#Warn: java_strings_ConsecutiveLiteralAppends
StringBuffer buf = new StringBuffer(); buf.append("Hello").append(" ").append("World"); // poor buf.append("Hello World"); // good


    }
}

