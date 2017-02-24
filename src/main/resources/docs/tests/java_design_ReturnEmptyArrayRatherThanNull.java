//#Patterns: java_design_ReturnEmptyArrayRatherThanNull

public class Example {
    // Not a good idea...
    //#Warn: java_design_ReturnEmptyArrayRatherThanNull
    public int[] badBehavior() {
                   // ...
        return null;
    }

    // Good behavior
    public String[] bonnePratique() {
      //...
     return new String[0];
    }
}