//#Patterns: controversial_DoNotCallGarbageCollectionExplicitly

public class Foo {

    public CGCall() {
        //#Warn: controversial_DoNotCallGarbageCollectionExplicitly
        System.gc();
    }

    public void doSomething() {
        //#Warn: controversial_DoNotCallGarbageCollectionExplicitly
        Runtime.getRuntime().gc();
    }

    public void doSomething() {
        //#Warn: controversial_DoNotCallGarbageCollectionExplicitly
        Runtime.getRuntime().gc();
    }

}
