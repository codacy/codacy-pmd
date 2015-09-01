//#Patterns: optimizations_LocalVariableCouldBeFinal

public class Bar {
    public void foo() {
        //#Err: optimizations_LocalVariableCouldBeFinal
        String txtA = "a";
        
        final String txtB = "b"; 
    }
}
