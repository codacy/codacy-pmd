//#Patterns: category_java_codestyle_AvoidUsingNativeCode

public class SomeJNIClass {

    public SomeJNIClass() {
        //#Info: category_java_codestyle_AvoidUsingNativeCode
        System.loadLibrary("nativelib");
    }

    static {
        //#Info: category_java_codestyle_AvoidUsingNativeCode
        System.loadLibrary("nativelib");
    }

    public void invalidCallsInMethod() throws SecurityException, NoSuchMethodException {
        //#Info: category_java_codestyle_AvoidUsingNativeCode
        System.loadLibrary("nativelib");
    }

}
