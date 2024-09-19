//#Patterns: category_java_codestyle_LocalVariableCouldBeFinal

public class Bar {
    public void foo() {
        //#Info: category_java_codestyle_LocalVariableCouldBeFinal
        String txtA = "a";
        
        final String txtB = "b"; 
    }
}
