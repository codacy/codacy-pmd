//#Patterns: java_strings_UseStringBufferLength

public class Foo {
    public void bar() {
//#Warn: java_strings_UseStringBufferLength
StringBuffer sb = new StringBuffer(); if (sb.toString().equals("")) {} // inefficient if (sb.length() == 0) {} // preferred


    }
}

