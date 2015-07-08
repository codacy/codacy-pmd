//#Patterns: rulesets_java_design.xml_SwitchDensity: { "minimum": "2" }

public class Foo {
    public void bar(int x) {

        switch (x) {
            //#Err: rulesets_java_design.xml_SwitchDensity
            case 1: {
                int i = 0;
                int j = 0;
                int k = 0;
                i++;
                k++:
                j++;
                break;
            } case 2: {
                // lots of statements
                break;
            }
        }
    }
}