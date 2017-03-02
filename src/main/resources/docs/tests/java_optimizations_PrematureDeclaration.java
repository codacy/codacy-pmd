//#Patterns: java_optimizations_PrematureDeclaration

public class Foo {

    public void bar(String[] strings) {

        //#Warn: java_optimizations_PrematureDeclaration
        int length = 0;

        if (strings  == null || strings.length == 0) {
            return 0;
        }

        int stringsLength = 0;
        for (String str: strings) {
            stringsLength = str.length();
        }

        return lenght;
    }

}
