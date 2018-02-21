//#Patterns: category_java_errorprone_AvoidDuplicateLiterals
public class Foo {

    private void bar() {
        //#Warn: category_java_errorprone_AvoidDuplicateLiterals
            buz("Howdy");
            buz("Howdy");
            buz("Howdy");
            buz("Howdy");
        }

    private void buz(String x) {

    }


}

