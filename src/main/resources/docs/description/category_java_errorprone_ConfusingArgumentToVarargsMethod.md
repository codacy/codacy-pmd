Since: PMD 7.1.0

Reports a confusing argument passed to a varargs method.

            This can occur when an array is passed as a single varargs argument, when the array type is not exactly the
            type of array that the varargs method expects. If, that array is a subtype of the component type of the expected
            array type, then it might not be clear what value the called varargs method will receive.
            For instance if you have:
            ```java
            void varargs(Object... parm);
            ```
            and call it like so:
            ```java
            varargs(new String[]{&quot;a&quot;});
            ```
            it is not clear whether you intended the method to receive the value `new Object[]{ new String[] {&quot;a&quot;} }` or
            just `new String[] {&quot;a&quot;}` (the latter happens). This confusion occurs because `String[]` is both a subtype
            of `Object[]` and of `Object`. To clarify your intent in this case, use a cast or pass individual elements like so:
            ```java
            // varargs call
            // parm will be `new Object[] { &quot;a&quot; }`
            varargs(&quot;a&quot;);

            // non-varargs call
            // parm will be `new String[] { &quot;a&quot; }`
            varargs((Object[]) new String[]{&quot;a&quot;});

            // varargs call
            // parm will be `new Object[] { new String[] { &quot;a&quot; } }`
            varargs((Object) new String[]{&quot;a&quot;});
            ```

            Another confusing case is when you pass `null` as the varargs argument. Here it is not clear whether you intended
            to pass an array with a single null element, or a null array (the latter happens). This can similarly be clarified
            with a cast.

Example(s):
```
import java.util.Arrays;

            abstract class C {
                abstract void varargs(Object... args);
                static {
                    varargs(new String[] { "a" });
                    varargs(null);
                }
            }
```
