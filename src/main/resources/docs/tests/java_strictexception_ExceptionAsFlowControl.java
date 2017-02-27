//#Patterns: java_strictexception_ExceptionAsFlowControl

public class Foo {

    public void bar() {
        try {
            try {
            } catch (Exception e) {
                throw new WrapperException(e);
                 // this is essentially a GOTO to the WrapperException catch block
                 }
            //#Warn: java_strictexception_ExceptionAsFlowControl
        } catch (WrapperException e) {
        // do some more stuff
        }
    }
}

