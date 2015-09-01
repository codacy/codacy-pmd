//#Patterns: unusedcode_UnusedFormalParameter
public class Foo {

    //#Warn: unusedcode_UnusedFormalParameter
    private void bar(String howdy) {
        // howdy is not used
    }

    private void bar(String howdy) {
        System.out.println(howdy);
    }
}