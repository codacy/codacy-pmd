Since: PMD 6.37.0

Reports usages of primitive wrapper constructors. They are deprecated
            since Java 9 and should not be used. Even before Java 9, they can
            be replaced with usage of the corresponding static `valueOf` factory method
            (which may be automatically inserted by the compiler since Java 1.5).
            This has the advantage that it may reuse common instances instead of creating
            a new instance each time.

            Note that for `Boolean`, the named constants `Boolean.TRUE` and `Boolean.FALSE`
            are preferred instead of `Boolean.valueOf`.

Example(s):
```
public class Foo {
                private Integer ZERO = new Integer(0);      // violation
                private Integer ZERO1 = Integer.valueOf(0); // better
                private Integer ZERO1 = 0;                  // even better
            }
```
