//#Patterns: category_java_errorprone_DoNotCallSystemExit

public class Foo {
    public void bar() {
        //#Warn: category_java_errorprone_DoNotCallSystemExit
        System.exit(0);
        // never call this when running in an application server!

    }

    public void foo() {
        //#Warn: category_java_errorprone_DoNotCallSystemExit
        Runtime.getRuntime().exit(0);
        // never stop the JVM manually, the container will do this.

    }
}

