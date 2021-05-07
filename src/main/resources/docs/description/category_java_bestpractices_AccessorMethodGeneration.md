Since: PMD 5.5.4

When accessing private fields / methods from another class, the Java compiler will generate accessor methods
with package-private visibility. This adds overhead, and to the dex method count on Android. This situation can
be avoided by changing the visibility of the field / method from private to package-private.

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
