//#Patterns: strings_InefficientStringBuffering

public class Foo {
    public void bar() {

        // Avoid this, two buffers are actually being created here

        //#Warn: strings_InefficientStringBuffering
        StringBuffer sb = new StringBuffer("tmp = "+System.getProperty("java.io.tmpdir"));
        // do this instead
        StringBuffer sb2 = new StringBuffer("tmp = ");
        sb2.append(System.getProperty("java.io.tmpdir"));


    }
}

