//#Patterns: category_java_design_ExceptionAsFlowControl

public class Foo {

    public void bar() {
        try {
            try {
            } catch (Exception e) {
                throw new WrapperException(e);
                 // this is essentially a GOTO to the WrapperException catch block
                 }
            //#Warn: category_java_design_ExceptionAsFlowControl
        } catch (WrapperException e) {
        // do some more stuff
        }
    }
}

