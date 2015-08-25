//#Patterns: rulesets_java_strings.xml_UseStringBufferLength

public class Foo {
    public void bar() {
//#Warn: rulesets_java_strings.xml_UseStringBufferLength
StringBuffer sb = new StringBuffer(); if (sb.toString().equals("")) {} // inefficient if (sb.length() == 0) {} // preferred


    }
}

