//#Patterns: optimizations_SimplifyStartsWith

public class Foo {
    
    public boolean checkIt(String x) {
        //#Warn: optimizations_SimplifyStartsWith
        return x.startsWith("a"); //suboptimal
    }

    public boolean fasterCheckIt(String x) {
        return x.charAt(0) == 'a'; //faster approach
    }

}
