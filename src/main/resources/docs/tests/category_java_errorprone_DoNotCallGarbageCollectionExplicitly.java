//#Patterns: category_java_errorprone_DoNotCallGarbageCollectionExplicitly

public class Foo {

    public CGCall() {
        //#Warn: category_java_errorprone_DoNotCallGarbageCollectionExplicitly
        System.gc();
    }

    public void doSomething() {
        //#Warn: category_java_errorprone_DoNotCallGarbageCollectionExplicitly
        Runtime.getRuntime().gc();
    }

    public void doSomething() {
        //#Warn: category_java_errorprone_DoNotCallGarbageCollectionExplicitly
        Runtime.getRuntime().gc();
    }

}
