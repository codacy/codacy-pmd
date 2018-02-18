//#Patterns: category_java_errorprone_ConstructorCallsOverridableMethod

public class SeniorClass {
  public SeniorClass(){
      //#Warn: category_java_errorprone_ConstructorCallsOverridableMethod
      toString(); //may throw NullPointerException if overridden
  }
  public String toString(){
    return "IAmSeniorClass";
  }
}

public class JuniorClass extends SeniorClass {
  private String name;
  public JuniorClass(){
    super(); //Automatic call leads to NullPointerException
    name = "JuniorClass";
  }
  public String toString(){
    return name.toUpperCase();
  }
}
