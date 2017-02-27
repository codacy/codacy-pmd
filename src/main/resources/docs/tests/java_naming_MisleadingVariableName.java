//#Patterns: java_naming_MisleadingVariableName
public class Foo {
    private int m_foo; // OK

    //#Info: java_naming_MisleadingVariableName
    public void bar(String m_baz) {  // Bad
      //#Info: java_naming_MisleadingVariableName
      int m_boz = 42; // Bad
    }
}