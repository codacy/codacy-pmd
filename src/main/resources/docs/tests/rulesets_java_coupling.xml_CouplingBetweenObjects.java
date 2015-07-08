//#Patterns: rulesets_java_coupling.xml_CouplingBetweenObjects: { "threshold": "3" }

public class Foo {
    private Blah var1;
    private Bar var2;
    private ObjectA var44;
    private ObjectB var55;

    //#Warn: rulesets_java_coupling.xml_CouplingBetweenObjects
    void doWork() {
        Bardo var55;
        ObjectAA var44;
        ObjectBB var55;
        ObjectC var66;
        ObjectZ var93;
    }
}