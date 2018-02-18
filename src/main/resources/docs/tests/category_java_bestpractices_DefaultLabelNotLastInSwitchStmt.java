//#Patterns: category_java_bestpractices_DefaultLabelNotLastInSwitchStmt
   
public class Foo {
  void bar(int a) {
      //#Warn: category_java_bestpractices_DefaultLabelNotLastInSwitchStmt
   switch (a) {
    case 1:  // do something
       break;
    default:  // the default case should be last, by convention
       break;
    case 2:
       break;
   }
  }
}   
       

