//#Patterns: category_java_codestyle_AvoidProtectedFieldInFinalClass


public final class Bar {
  private int x;

  //#Info: category_java_codestyle_AvoidProtectedFieldInFinalClass
  protected int y;  // bar cannot be subclassed, so is y really private or package visible?
  Bar() {}
}
