Since: PMD 5.5.4

When accessing private fields / methods from another class, the Java compiler will generate accessor methods
with package-private visibility. This adds overhead, and to the dex method count on Android. This situation can
be avoided by changing the visibility of the field / method from private to package-private.


_Note:_ This rule is only executed for Java 10 or lower.
Since Java 11, [JEP 181: Nest-Based Access Control](https://openjdk.org/jeps/181) has been implemented. This
means that in Java 11 and above accessor classes are not generated anymore.

Example(s):
```
public class OuterClass {
    private int counter;
    /* package */ int id;

    public class InnerClass {
        InnerClass() {
            OuterClass.this.counter++; // wrong accessor method will be generated
        }

        public int getOuterClassId() {
            return OuterClass.this.id; // id is package-private, no accessor method needed
        }
    }
}
```
