Since: PMD 6.24.0

Detects casts which could be removed as the operand of the cast is already suitable
for the context type. For instance, in the following:
```
Object context = (Comparable) &quot;o&quot;;
```
The cast is unnecessary. This is because `String` already is a subtype of both
`Comparable` and `Object`.

This will also flag casts that can be avoided because of the autoboxing feature of Java 5.
```
Integer integer = (Integer) 1;
```
The literal would be autoboxed to `Integer` anyway.

Example(s):
```
import java.util.function.Function;
class SomeClass {
   static {
      Object o; long l; int i; Integer boxedInt;

      // reference conversions

      o = (Object) new SomeClass();      // unnecessary
      o = (SomeClass) o;                 // necessary (narrowing cast)
      o = (Comparable<String>) "string"; // unnecessary

      // primitive conversions

      l = (long) 2;   // unnecessary
      l = (long) 2.0; // necessary (narrowing cast)
      l = (byte) i;   // necessary (narrowing cast)

      // boxing/unboxing casts (since java 5)

      o = (Integer) 3;    // unnecessary (autoboxing would apply)
      o = (long) 3;       // necessary (would be boxed to Long)
      l = (int) boxedInt; // necessary (cannot cast Integer to long)

      // casts that give a target type to a lambda/ method ref are necessary

      o = (Function<Integer, String>) Integer::toString; // necessary (no target type)
   }
}

        

import java.util.*;
class SomeClass {
   static {
       /* Casts involving access to collections were common before Java 5, because collections
        * were not generic. This rule may hence be useful when converting from using a raw
        * type like `List` to a parameterized type like `List<String>`.
        */
       List<String> stringList = Arrays.asList("a", "b");
       String element = (String) stringList.get(0); // this cast is unnecessary
   }
}
```
