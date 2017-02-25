//#Patterns: java_controversial_DoNotCallGarbageCollectionExplicitly

public class Foo {

    public CGCall() {
        //#Warn: java_controversial_DoNotCallGarbageCollectionExplicitly
        System.gc();
    }

    public void doSomething() {
        //#Warn: java_controversial_DoNotCallGarbageCollectionExplicitly
        Runtime.getRuntime().gc();
    }

    public void doSomething() {
        //#Warn: java_controversial_DoNotCallGarbageCollectionExplicitly
        Runtime.getRuntime().gc();
    }

}
