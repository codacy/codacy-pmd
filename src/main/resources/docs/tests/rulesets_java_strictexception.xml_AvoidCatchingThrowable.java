//#Patterns: rulesets_java_strictexception.xml_AvoidCatchingThrowable

public class Foo {

    public void bar() {
        try { // do something
        //#Warn: rulesets_java_strictexception.xml_AvoidCatchingThrowable
        } catch (Throwable th) {
        // should not catch Throwable
            th.printStackTrace();
        }
    }
}