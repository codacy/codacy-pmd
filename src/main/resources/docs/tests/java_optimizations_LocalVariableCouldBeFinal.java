//#Patterns: java_optimizations_LocalVariableCouldBeFinal

public class Bar {
    public void foo() {
        //#Warn: java_optimizations_LocalVariableCouldBeFinal
        String txtA = "a";
        
        final String txtB = "b"; 
    }
}
