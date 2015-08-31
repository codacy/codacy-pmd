//#Patterns: controversial_UnnecessaryParentheses

public class Foo {
    
    public boolean bar(int x) {

        if (x == 0) {
          //#Info: controversial_UnnecessaryParentheses
          return (true);
        }

        return false;
    }

}
