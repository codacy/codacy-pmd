//#Patterns: java_design_NonCaseLabelInSwitchStatement

public class Foo {
  void bar(int a) {
   switch (a) {
     case 1:
       // do something
       break;
       //#Warn: java_design_NonCaseLabelInSwitchStatement
     mylabel: // this is legal, but confusing!
       break;
     default:
       break;
    }
  }
}

