//#Patterns: category_java_codestyle_AvoidUsingNativeCode

public class SomeJNIClass {

    public SomeJNIClass() {
        //#Warn: category_java_codestyle_AvoidUsingNativeCode
        System.loadLibrary("nativelib");
    }

    static {
        //#Warn: category_java_codestyle_AvoidUsingNativeCode
        System.loadLibrary("nativelib");
    }

    public void invalidCallsInMethod() throws SecurityException, NoSuchMethodException {
        //#Warn: category_java_codestyle_AvoidUsingNativeCode
        System.loadLibrary("nativelib");
    }

}
