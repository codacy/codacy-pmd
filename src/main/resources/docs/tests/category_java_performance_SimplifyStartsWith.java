//#Patterns: category_java_performance_SimplifyStartsWith

public class Foo {
    
    public boolean checkIt(String x) {
        //#Warn: category_java_performance_SimplifyStartsWith
        return x.startsWith("a"); //suboptimal
    }

    public boolean fasterCheckIt(String x) {
        return x.charAt(0) == 'a'; //faster approach
    }

}
