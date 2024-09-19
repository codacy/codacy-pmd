//#Patterns: category_java_performance_UseStringBufferLength

public class Foo {
    public void bar() {
//#Warn: category_java_performance_UseStringBufferLength
StringBuffer sb = new StringBuffer(); if (sb.toString().equals("")) {} // inefficient if (sb.length() == 0) {} // preferred


    }
}

