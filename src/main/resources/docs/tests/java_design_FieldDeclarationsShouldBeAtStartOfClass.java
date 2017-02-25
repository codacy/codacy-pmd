//#Patterns: java_design_FieldDeclarationsShouldBeAtStartOfClass

public class HelloWorldBean {

  // Field declared before methods / inner classes - OK
  private String _thing;

  public String getMessage() {
    return "Hello World!";
  }

  // Field declared after methods / inner classes - avoid this
//#Warn: java_design_FieldDeclarationsShouldBeAtStartOfClass
  private String _fieldInWrongLocation;
}

