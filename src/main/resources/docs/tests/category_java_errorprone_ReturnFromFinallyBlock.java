//#Patterns: category_java_errorprone_ReturnFromFinallyBlock

public class Bar {
    public String foo() {
        try {
            throw new Exception( "My Exception" );
        } catch (Exception e) {
            throw e;
        } finally {
            //#Warn: category_java_errorprone_ReturnFromFinallyBlock
            return "A. O. K."; // return not recommended here
        }
    }
}
