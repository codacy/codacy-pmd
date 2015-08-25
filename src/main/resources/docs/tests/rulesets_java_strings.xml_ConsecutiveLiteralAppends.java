//#Patterns: rulesets_java_strings.xml_ConsecutiveLiteralAppends

public class Foo {
    public void bar() {
//#Warn: rulesets_java_strings.xml_ConsecutiveLiteralAppends
StringBuffer buf = new StringBuffer(); buf.append("Hello").append(" ").append("World"); // poor buf.append("Hello World"); // good


    }
}

