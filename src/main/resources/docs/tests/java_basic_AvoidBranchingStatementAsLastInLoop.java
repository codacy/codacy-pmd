//#Patterns: java_basic_AvoidBranchingStatementAsLastInLoop
public class Foo {

    public void bar() {


        for (int i = 0; i < 10; i++) {
            if (i * i <= 25) {
                continue;
            }
            //#Warn: java_basic_AvoidBranchingStatementAsLastInLoop
            break;
        }

        // this makes more sense...
        for (int i = 0; i < 10; i++) {
            if (i * i > 25) {
                break;
            }
        }
    }

}