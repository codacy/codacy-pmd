//#Patterns: rulesets_java_strings.xml_InsufficientStringBufferDeclaration

public class Foo {
    public void bar() {
//#Warn: rulesets_java_strings.xml_InsufficientStringBufferDeclaration
StringBuffer bad = new StringBuffer(); bad.append("This is a long string that will exceed the default 16 characters"); StringBuffer good = new StringBuffer(41); good.append("This is a long string, which is pre-sized");


    }
}

