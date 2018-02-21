//#Patterns: category_java_errorprone_ReturnEmptyArrayRatherThanNull

public class Example {
    // Not a good idea...
    //#Warn: category_java_errorprone_ReturnEmptyArrayRatherThanNull
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
