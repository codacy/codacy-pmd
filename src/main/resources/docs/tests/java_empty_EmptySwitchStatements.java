//#Patterns: java_empty_EmptySwitchStatements

public class Foo {
    public void bar() {
        int x = 2;
        //#Info: java_empty_EmptySwitchStatements
        switch(x) {  
        }
    }

    public void ola() {
        int y = 0;

        switch(y) {
            case 1: System.out.println("Hello World");
                    break;
        }
    }
}
