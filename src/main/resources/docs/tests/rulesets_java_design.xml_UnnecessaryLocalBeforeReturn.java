//#Patterns: rulesets_java_design.xml_UnnecessaryLocalBeforeReturn

public class Foo {
   public int bar() {
     int x = doSomething();
     //#Err: rulesets_java_design.xml_UnnecessaryLocalBeforeReturn
     return x;
   }

   public int bar2() {
       return doSomething();
   }
}