Since: PMD 1.9

The method clone() should throw a CloneNotSupportedException.

Example(s):
```
public class MyClass implements Cloneable{
     public Object clone() { // will cause an error
          MyClass clone = (MyClass)super.clone();
          return clone;
     }
 }
```

[Source](https://pmd.github.io/pmd-5.6.1/pmd-java/rules/java/clone.html#CloneThrowsCloneNotSupportedException)
