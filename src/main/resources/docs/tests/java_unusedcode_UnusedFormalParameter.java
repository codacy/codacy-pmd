//#Patterns: java_unusedcode_UnusedFormalParameter
public class Foo {

    //#Warn: java_unusedcode_UnusedFormalParameter
    private void bar(String howdy) {
        // howdy is not used
    }

    private void bar(String howdy) {
        System.out.println(howdy);
    }
}