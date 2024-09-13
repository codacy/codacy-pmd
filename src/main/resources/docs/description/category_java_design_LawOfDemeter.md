Since: PMD 5.0

The law of Demeter is a simple rule that says &quot;only talk to friends&quot;. It forbids
fetching data from &quot;too far away&quot;, for some definition of distance, in order to
reduce coupling between classes or objects of different levels of abstraction.

The rule uses a notion of &quot;degree&quot;, that quantifies how &quot;far&quot; an object is.
Expressions with too high degree can only be used in certain ways. The degree of
an expression is defined inductively:
- The degree of `this` is 0
- The degree of a method parameter is 1
- The degree of a new object created in a method is 1
- The degree of a static variable is 1
- The degree of a field access expression like `expr.field` is the degree of `expr` plus 1
- The degree of a &quot;getter expression&quot; like `expr.getFoo()` is the degree of `expr` plus 1
- The degree of a &quot;transformation expression&quot; like `expr.withFoo(&quot;&quot;)` is the degree of `expr`
- The degree of a variable is the maximum degree of all the assignments that reach it

Intuitively, the more you call getters, the more the degree increases. Eventually
the degree reaches the report threshold (property `trustRadius`) and the expression
is reported. The details of the calculation are more involved and make room for common
patterns, like usage of collections (objects that are in a list or array have the
same degree as their container), the builder pattern, and getters that do not appear
to break a boundary of abstraction.

Be aware that this rule is prone to many false-positives and low-priority warnings.
You can increase the `trustRadius` property to reduce them drastically. The default
`trustRadius` of 1 corresponds to the original law of Demeter (you're only allowed
one getter call on untrusted values). Given some `trustRadius` value:
- expressions of degree lower or equal to `trustRadius` are not reported
- expressions of degree exactly `trustRadius + 1` are reported, unless they are only returned
from the current method, or passed as argument to another method. Without this exception it
would not be possible to extract any information from e.g. method parameters.
- values of degree strictly greater than `trustRadius + 1` are not reported. The
intuition is that to obtain a value of degree `n &gt; 1` then you must use an expression
of degree `n - 1`, so if you have `n &gt; trustRadius + 1`, there you're using some value
of degree `trustRadius + 1` that will be reported.

See also the references:

*   Andrew Hunt, David Thomas, and Ward Cunningham. The Pragmatic Programmer. From Journeyman to Master. Addison-Wesley Longman, Amsterdam, October 1999.;
*   K.J. Lieberherr and I.M. Holland. Assuring good style for object-oriented programs. Software, IEEE, 6(5):38–48, 1989.;
*   &lt;http://www.ccs.neu.edu/home/lieber/LoD.html&gt;
*   &lt;http://en.wikipedia.org/wiki/Law_of_Demeter&gt;

Example(s):
```
public class Foo {
    /**
     * This example will result in one violation.
     */
    public void example(Bar b) { // b has degree 1
        // `b.getC()` has degree 2, it's breaking a boundary of abstraction and so is reported.
        b.getC().doIt();
        // To respect the law of Demeter, Bar should encapsulate its
        // C member more properly, eg by exposing a method like this:
        b.callDoItOnC();

        // a constructor call, not a method call.
        D d = new D();
        // this method call is ok, because we have create the new
        // instance of D locally.
        d.doSomethingElse();
    }
}
```
