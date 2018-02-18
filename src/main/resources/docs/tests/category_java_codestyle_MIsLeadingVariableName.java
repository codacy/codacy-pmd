//#Patterns: category_java_codestyle_MIsLeadingVariableName
public class Foo {
    private int m_foo; // OK

    //#Warn: category_java_codestyle_MIsLeadingVariableName
    public void bar(String m_baz) {  // Bad
      //#Warn: category_java_codestyle_MIsLeadingVariableName
      int m_boz = 42; // Bad
    }
}
