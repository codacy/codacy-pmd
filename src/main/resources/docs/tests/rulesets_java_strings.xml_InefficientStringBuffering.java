//#Patterns: rulesets_java_strings.xml_InefficientStringBuffering

public class Foo {
    public void bar() {

        // Avoid this, two buffers are actually being created here

        //#Warn: rulesets_java_strings.xml_InefficientStringBuffering
        StringBuffer sb = new StringBuffer("tmp = "+System.getProperty("java.io.tmpdir"));
        // do this instead
        StringBuffer sb2 = new StringBuffer("tmp = ");
        sb2.append(System.getProperty("java.io.tmpdir"));


    }
}

