Since: PMD 7.1.0

This rule reports lambda expressions that can be written more succinctly as a method reference. This is the case if the lambda is an expression lambda that only calls one method, passing the entire lambda parameter list in order to the method. For instance:
            ```java
                x -&gt; Foo.call(x) // can be Foo::call
                x -&gt; call(x)     // can be this::call, if call is an instance method
                (x, y, z) -&gt; call(x, y, z) // can be this::call
                () -&gt; foo.get() // can be foo::get
                x -&gt; x.foo()    // can be XType::foo (where XType is the type of x)
            ```

            In some cases rewriting a lambda to a method reference can change the semantics of the code. For instance in `(x) -&gt; someVar.call(x)`, the invocation of the lambda may produce a NullPointerException (NPE) if `someVar` is null. The method reference `someVar::call` will also NPE if `someVar` is null, but it will do so at the point the method reference is created, while the lambda is created without error and its NPE is only thrown if the lambda is invoked (which may be never). Code should probably not rely on this subtle semantic difference, therefore these potentially problematic lambdas are also reported by default. This behavior can be disabled by setting the property `ignoreIfMayNPE` to `true`.

            The property `ignoreIfMayNPE` is true by default. By default, calls whose receiver is itself a method call are ignored, because they could cause side effects. This may be changed by setting the property `ignoreIfReceiverIsMethod` to `false`.

            Scope limitations:
            - This rule will not report lambdas of the form `x -&gt; new CtorCall().something(x)`, because the semantics of the method reference would be to create a single new object, while the lambda creates one object per invocation.
            - The rule cannot know if the qualifier of a method call performs side effects. This means `(x) -&gt; sideEffectingMethod().foo(x)` will be reported. Suppress the warning in this case.

Example(s):
```
import java.util.stream.Stream;

            public class LambdaCanBeMethodReference {
                static {
                    Stream.of("abc", "d")
                            .mapToInt(s -> s.length()) // could be String::length
                            .reduce((x, y) -> Integer.sum(x, y)) // could be Integer::sum
                            .getAsInt();
                }
            }
```
