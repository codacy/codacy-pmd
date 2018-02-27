//#Patterns: category_java_codestyle_FieldDeclarationsShouldBeAtStartOfClass

public class HelloWorldBean {

  // Field declared before methods / inner classes - OK
  private String _thing;

  public String getMessage() {
    return "Hello World!";
  }

  // Field declared after methods / inner classes - avoid this
//#Info: category_java_codestyle_FieldDeclarationsShouldBeAtStartOfClass
  private String _fieldInWrongLocation;
}

