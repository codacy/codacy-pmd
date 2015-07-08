//#Patterns: rulesets_java_design.xml_UncommentedEmptyMethodBody
public class Foo {
    //#Err: rulesets_java_design.xml_UncommentedEmptyMethodBody
    public void bar() {
    }

    public void good() {
    	//Method bla bla stuff
    }
}

