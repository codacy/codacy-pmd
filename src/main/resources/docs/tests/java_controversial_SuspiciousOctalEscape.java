//#Patterns: java_controversial_SuspiciousOctalEscape

public class Foo {

    public void bar() {
        //#Warn: java_controversial_SuspiciousOctalEscape
        System.out.println("suspicious: \128");
    }

}
