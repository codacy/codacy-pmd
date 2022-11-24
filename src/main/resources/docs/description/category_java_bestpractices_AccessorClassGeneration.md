Since: PMD 1.04

Instantiation by way of private constructors from outside the constructor's class often causes the
generation of an accessor. A factory method, or non-privatization of the constructor can eliminate this
situation. The generated class file is actually an interface.  It gives the accessing class the ability
to invoke a new hidden package scope constructor that takes the interface as a supplementary parameter.
This turns a private constructor effectively into one with package scope, and is challenging to discern.

_Note:_ This rule is only executed for Java 10 or lower.
Since Java 11, [JEP 181: Nest-Based Access Control](https://openjdk.org/jeps/181) has been implemented. This
means that in Java 11 and above accessor classes are not generated anymore.

Example(s):
```
public class Outer {
 void method(){
  Inner ic = new Inner();//Causes generation of accessor class
 }
 public class Inner {
  private Inner(){}
 }
}
```
