A high ratio of statements to labels in a switch statement implies that the switch statement is overloaded.
Consider moving the statements into new methods or creating subclasses based on the switch variable.
Complicated switch statements are harder to understand and mantain.

The technique to break some logic into functions is called Extract Method, support for it can be found under Refactoring options on most IDEs.

Ex:

    public class Foo {
      public void bar(int x) {
        switch (x) {
          case 1: {
            // lots of statements
            break;
          } case 2: {
            // lots of statements
            break;
          }
        }
      }
    }

[SOURCE](http://pmd.sourceforge.net/pmd-5.3.2/pmd-java/rules/java/design.html#SwitchDensity)
