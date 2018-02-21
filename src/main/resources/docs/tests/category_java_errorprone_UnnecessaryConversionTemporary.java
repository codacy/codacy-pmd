//#Patterns: category_java_errorprone_UnnecessaryConversionTemporary

public class Foo {
    public void bar(int x) {
        //#Warn: category_java_errorprone_UnnecessaryConversionTemporary
        String aux = new Integer(x).toString();

        return Integer.toString(x);
    }
}
