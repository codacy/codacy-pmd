//#Patterns: category_java_errorprone_NonCaseLabelInSwitchStatement

public class Foo {
  void bar(int a) {
   switch (a) {
     case 1:
       // do something
       break;
       //#Warn: category_java_errorprone_NonCaseLabelInSwitchStatement
     mylabel: // this is legal, but confusing!
       break;
     default:
       break;
    }
  }
}

