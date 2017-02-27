//#Patterns: java_strings_AvoidDuplicateLiterals
public class Foo {

    private void bar() {
        //#Warn: java_strings_AvoidDuplicateLiterals
            buz("Howdy");
            buz("Howdy");
            buz("Howdy");
            buz("Howdy");
        }

    private void buz(String x) {

    }


}

