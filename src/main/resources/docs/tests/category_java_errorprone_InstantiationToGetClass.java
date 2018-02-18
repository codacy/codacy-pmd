//#Patterns: category_java_errorprone_InstantiationToGetClass
public class Foo {

    public void Bar() {

 
  //#Warn: category_java_errorprone_InstantiationToGetClass
Class c = new String().getClass();

  // with this:
Class c2 = String.class;


    }
}

