//#Patterns: unnecessary_UnnecessaryConversionTemporary

public class Foo {
    public void bar(int x) {
        //#Warn: unnecessary_UnnecessaryConversionTemporary
        String aux = new Integer(x).toString();

        return Integer.toString(x);
    }
}
