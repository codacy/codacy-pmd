//#Patterns: controversial_SuspiciousOctalEscape

public class Foo {

    public void bar() {
        //#Err: controversial_SuspiciousOctalEscape
        System.out.println("suspicious: \128");
    }

}
