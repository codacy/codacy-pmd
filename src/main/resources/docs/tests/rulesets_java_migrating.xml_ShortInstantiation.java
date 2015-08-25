//#Patterns: rulesets_java_migrating.xml_ShortInstantiation

public class Foo {
    //#Warn: rulesets_java_migrating.xml_ShortInstantiation
    private Short i = new Short(0);
    // change to Short i = Short.valueOf(0);
}