//#Patterns: category_java_errorprone_SuspiciousOctalEscape

public class Foo {

    public void bar() {
        //#Warn: category_java_errorprone_SuspiciousOctalEscape
        System.out.println("suspicious: \128");
    }

}
