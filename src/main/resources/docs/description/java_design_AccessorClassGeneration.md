Since: PMD 1.04

Instantiation by way of private constructors from outside of the constructor's class often causes the 
generation of an accessor. A factory method, or non-privatization of the constructor can eliminate this 
situation. The generated class file is actually an interface.  It gives the accessing class the ability 
to invoke a new hidden package scope constructor that takes the interface as a supplementary parameter. 
This turns a private constructor effectively into one with package scope, and is challenging to discern.

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

[Source](https://pmd.github.io/pmd-5.6.1/pmd-java/rules/java/design.html#AccessorClassGeneration)
