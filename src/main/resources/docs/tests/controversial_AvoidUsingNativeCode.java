//#Patterns: controversial_AvoidUsingNativeCode

public class SomeJNIClass {

    public SomeJNIClass() {
        //#Warn: controversial_AvoidUsingNativeCode
        System.loadLibrary("nativelib");
    }

    static {
        //#Warn: controversial_AvoidUsingNativeCode
        System.loadLibrary("nativelib");
    }

    public void invalidCallsInMethod() throws SecurityException, NoSuchMethodException {
        //#Warn: controversial_AvoidUsingNativeCode
        System.loadLibrary("nativelib");
    }

}
