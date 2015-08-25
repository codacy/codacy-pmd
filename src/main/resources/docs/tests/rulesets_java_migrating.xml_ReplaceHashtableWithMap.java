//#Patterns: rulesets_java_migrating.xml_ReplaceHashtableWithMap

public class Foo {
    void bar() {
        //#Warn: rulesets_java_migrating.xml_ReplaceHashtableWithMap
        Hashtable h = new Hashtable();
    }
}