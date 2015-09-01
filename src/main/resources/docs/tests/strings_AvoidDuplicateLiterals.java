//#Patterns: strings_AvoidDuplicateLiterals
public class Foo {

    private void bar() {
        //#Warn: strings_AvoidDuplicateLiterals
            buz("Howdy");
            buz("Howdy");
            buz("Howdy");
            buz("Howdy");
        }

    private void buz(String x) {

    }


}

