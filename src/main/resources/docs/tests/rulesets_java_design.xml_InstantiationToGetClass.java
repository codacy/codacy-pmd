//#Patterns: design_InstantiationToGetClass
public class Foo {

    public void Bar() {

 
  //#Info: design_InstantiationToGetClass
Class c = new String().getClass();

  // with this:
Class c2 = String.class;


    }
}

