//#Patterns: java_j2ee_DoNotCallSystemExit

public class Foo {
    public void bar() {
        //#Warn: java_j2ee_DoNotCallSystemExit
        System.exit(0);
        // never call this when running in an application server!

    }

    public void foo() {
        //#Warn: java_j2ee_DoNotCallSystemExit
        Runtime.getRuntime().exit(0);
        // never stop the JVM manually, the container will do this.

    }
}

