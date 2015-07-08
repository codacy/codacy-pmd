Avoid the creation of unnecessary local variables.
Sometimes people create local variables hold the return value of an expression/function call, and then just to return the variable value.
There is no need to have this temporary variable, you should put the expression/function call on the return itself.

Ex:

    public class Foo {
       public int bar() {
         int x = doSomething();
         return x;  // instead, just 'return doSomething();'
       }

       //better
       public int bar() {
         return doSomething();
       }
    }

[SOURCE](http://pmd.sourceforge.net/pmd-5.3.2/pmd-java/rules/java/design.html#UnnecessaryLocalBeforeReturn)
