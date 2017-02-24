//#Patterns: java_controversial_AvoidUsingNativeCode

public class SomeJNIClass {

    public SomeJNIClass() {
        //#Warn: java_controversial_AvoidUsingNativeCode
        System.loadLibrary("nativelib");
    }

    static {
        //#Warn: java_controversial_AvoidUsingNativeCode
        System.loadLibrary("nativelib");
    }

    public void invalidCallsInMethod() throws SecurityException, NoSuchMethodException {
        //#Warn: java_controversial_AvoidUsingNativeCode
        System.loadLibrary("nativelib");
    }

}
