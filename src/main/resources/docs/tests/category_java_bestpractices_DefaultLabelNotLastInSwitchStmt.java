//#Patterns: category_java_bestpractices_DefaultLabelNotLastInSwitchStmt
   
public class Foo {
  void bar(int a) {
   switch (a) {
    case 1:  // do something
       break;
   //#Warn: category_java_bestpractices_DefaultLabelNotLastInSwitchStmt
    default:  // the default case should be last, by convention
       break;
    case 2:
       break;
   }
  }
}   
       

