//#Patterns: rulesets_java_migrating.xml_ReplaceVectorWithList

public class Foo {
    void bar() {
        //#Warn: rulesets_java_migrating.xml_ReplaceVectorWithList
        Vector v = new Vector();
    }
}