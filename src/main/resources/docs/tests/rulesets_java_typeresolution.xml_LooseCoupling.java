//#Patterns: rulesets_java_typeresolution.xml_LooseCoupling

public class Foo {

    //Use list instead
    //#Warn: rulesets_java_typeresolution.xml_LooseCoupling
    private ArrayList list = new ArrayList();

    //#Warn: rulesets_java_typeresolution.xml_LooseCoupling
    public HashSet getFoo() {
        return new HashSet();
    }
}
