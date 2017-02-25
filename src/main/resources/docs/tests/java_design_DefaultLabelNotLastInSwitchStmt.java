//#Patterns: java_design_DefaultLabelNotLastInSwitchStmt
   
public class Foo {
  void bar(int a) {
      //#Warn: java_design_DefaultLabelNotLastInSwitchStmt
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
       

