Since: PMD 1.04

This rule counts the number of unique attributes, local variables, and return types within an object. 
A number higher than the specified threshold can indicate a high degree of coupling.

Example(s):
```
import com.Blah;
import org.Bar;
import org.Bardo;

public class Foo {
   private Blah var1;
   private Bar var2;
 
 	//followed by many imports of unique objects
   void ObjectC doWork() {
     Bardo var55;
     ObjectA var44;
     ObjectZ var93;
     return something;
   }
}
```

[Source](https://pmd.github.io/pmd-5.5.4/pmd-java/rules/java/coupling.html#CouplingBetweenObjects)
