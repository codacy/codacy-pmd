//#Patterns: rulesets_java_j2ee.xml_DoNotCallSystemExit

public class Foo {
    public void bar() {
        //#Warn: rulesets_java_j2ee.xml_DoNotCallSystemExit
        System.exit(0);
        // never call this when running in an application server!

    }

    public void foo() {
        //#Warn: rulesets_java_j2ee.xml_DoNotCallSystemExit
        Runtime.getRuntime().exit(0);
        // never stop the JVM manually, the container will do this.

    }
}

