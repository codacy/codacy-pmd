Since: PMD 6.26.0

Reports assignments to variables that are never used before the variable is overwritten,
            or goes out of scope. Unused assignments are those for which
            1. The variable is never read after the assignment, or
            2. The assigned value is always overwritten by other assignments before the next read of
            the variable.

            The rule doesn't consider assignments to fields except for those of `this` in a constructor,
            or static fields of the current class in static initializers.

            The rule may be suppressed with the standard `@SuppressWarnings(&quot;unused&quot;)` tag.

            The rule subsumes {% rule &quot;UnusedLocalVariable&quot; %}, and {% rule &quot;UnusedFormalParameter&quot; %}.
            Those violations are filtered
            out by default, in case you already have enabled those rules, but may be enabled with the property
            `reportUnusedVariables`. Variables whose name starts with `ignored` are filtered out, as
            is standard practice for exceptions.

Example(s):
```
class A {
                // this field initializer is redundant,
                // it is always overwritten in the constructor
                int f = 1;

                A(int f) {
                    this.f = f;
                }
            }
        
        
class B {

    int method(int i, int j) {
        // this initializer is redundant,
        // it is overwritten in all branches of the `if`
        int k = 0;

        // Both the assignments to k are unused, because k is
        // not read after the if/else
        // This may hide a bug: the programmer probably wanted to return k
        if (i < j)
            k = i;
        else
            k = j;

        return j;
    }

}
        

        
class C {

    int method() {
        int i = 0;

        checkSomething(++i);
        checkSomething(++i);
        checkSomething(++i);
        checkSomething(++i);

        // That last increment is not reported unless
        // the property `checkUnusedPrefixIncrement` is
        // set to `true`
        // Technically it could be written (i+1), but it
        // is not very important
    }

}
        

        
class C {

    // variables that are truly unused (at most assigned to, but never accessed)
    // are only reported if property `reportUnusedVariables` is true

    void method(int param) { } // for example this method parameter

    // even then, you can suppress the violation with an annotation:

    void method(@SuppressWarning("unused") int param) { } // no violation, even if `reportUnusedVariables` is true

    // For catch parameters, or for resources which don't need to be used explicitly,
    // you can give a name that starts with "ignored" to ignore such warnings

    {
        try (Something ignored = Something.create()) {
            // even if ignored is unused, it won't be flagged
            // its purpose might be to side-effect in the create/close routines

        } catch (Exception e) { // this is unused and will cause a warning if `reportUnusedVariables` is true
            // you should choose a name that starts with "ignored"
            return;
        }
    }

}
```
