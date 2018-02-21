//#Patterns: category_java_bestpractices_UnusedFormalParameter
public class Foo {

    //#Warn: category_java_bestpractices_UnusedFormalParameter
    private void bar(String howdy) {
        // howdy is not used
    }

    private void bar(String howdy) {
        System.out.println(howdy);
    }
}
