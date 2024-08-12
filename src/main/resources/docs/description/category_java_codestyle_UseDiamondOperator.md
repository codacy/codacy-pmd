Since: PMD 6.11.0

In some cases, explicit type arguments in a constructor call for a generic type
may be replaced by diamond type arguments (`&lt;&gt;`), and be inferred by the compiler.
This rule recommends that you use diamond type arguments anywhere possible, since
it avoids duplication of the type arguments, and makes the code more concise and readable.

This rule is useful when upgrading a codebase to Java 1.7, Java 1.8, or Java 9.
The diamond syntax was first introduced in Java 1.7. In Java 8, improvements in Java's
type inference made more type arguments redundant. In Java 9, type arguments inference
was made possible for anonymous class constructors.

Example(s):
```
import java.util.*;
            class Foo {
                static {
                    List<String> strings;
                    strings = new ArrayList<String>(); // unnecessary duplication of type parameters
                    strings = new ArrayList<>();       // using diamond type arguments is more concise

                    strings = new ArrayList(); // accidental use of a raw type, you can use ArrayList<> instead

                    strings = new ArrayList<>() {
                        // for anonymous classes, this is possible since Java 9 only
                    };
                }
            }
```
