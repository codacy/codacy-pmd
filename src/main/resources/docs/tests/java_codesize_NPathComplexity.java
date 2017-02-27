//#Patterns: java_codesize_NPathComplexity : { "minimum": "5" }

public class Foo {
    //#Warn: java_codesize_NPathComplexity
    void bar() {// this is something more complex than it needs to be,
        if (y) {
            for (j = 0; j < m; j++) {
                if (j > r) {
                    doSomething();
                    while (f < 5 ) {
                        anotherThing();
                        f -= 27;
                    }
                } else {
                    tryThis();
                }
            }
        }
        if ( r - n > 45 ) {
            while (doMagic()) {
                findRabbits();
            }
        }
        try {
            doSomethingDangerous();
        } catch (Exception ex) {
            makeAmends();
        } finally {
            dontDoItAgain();
        }
    }

    void test2() {
        if(y) {
            if(x) {

            }
        } else {

        }
    }
}
