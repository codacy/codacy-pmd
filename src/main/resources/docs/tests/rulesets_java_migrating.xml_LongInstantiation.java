//#Patterns: rulesets_java_migrating.xml_LongInstantiation
public class Foo {
    //#Warn: rulesets_java_migrating.xml_LongInstantiation
    private Long i = new Long(0);
    // change to Long i = Long.valueOf(0);

}