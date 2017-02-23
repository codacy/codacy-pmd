//#Patterns: java_design_ConstructorCallsOverridableMethod

public class SeniorClass {
  public SeniorClass(){
      //#Warn: java_design_ConstructorCallsOverridableMethod
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