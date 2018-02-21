//#Patterns: category_java_performance_AvoidInstantiatingObjectsInLoops

public class Foo {
    
    public void foo() {
        for (int i = 0; i < 10; i++) {
            //#Warn: category_java_performance_AvoidInstantiatingObjectsInLoops
            String f = new String("ola");
        }

        String bar;
        for (int i = 0; i < 10; i++) {
            bar = "Ola";
        }
    }

}
