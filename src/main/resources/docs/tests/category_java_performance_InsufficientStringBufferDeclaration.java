//#Patterns: category_java_performance_InsufficientStringBufferDeclaration

public class Foo {
    public void bar() {
//#Warn: category_java_performance_InsufficientStringBufferDeclaration
StringBuffer bad = new StringBuffer(); bad.append("This is a long string that will exceed the default 16 characters"); StringBuffer good = new StringBuffer(41); good.append("This is a long string, which is pre-sized");


    }
}

