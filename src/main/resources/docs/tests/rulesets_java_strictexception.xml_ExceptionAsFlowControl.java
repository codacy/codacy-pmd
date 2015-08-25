//#Patterns: rulesets_java_strictexception.xml_ExceptionAsFlowControl

public class Foo {

    public void bar() {
        try {
            try {
            } catch (Exception e) {
                throw new WrapperException(e);
                 // this is essentially a GOTO to the WrapperException catch block
                 }
            //#Warn: rulesets_java_strictexception.xml_ExceptionAsFlowControl
        } catch (WrapperException e) {
        // do some more stuff
        }
    }
}

