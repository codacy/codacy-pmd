//#Patterns: java_controversial_AvoidPrefixingMethodParameters

public class Foo {
    
    //#Warn: java_controversial_AvoidPrefixingMethodParameters
    public void notSoGoodCode(int inLeftOperand) {
        outRightOperand = 1;
    }

    public void betterCode(int function1, int function2) { 
      //insert more code here 
    }
}
