Since: PMD 1.1

If a class is marked as `Serializable`, then all fields need to be serializable as well. In order to exclude
a field, it can be marked as transient. Static fields are not considered.

This rule reports all fields, that are not serializable.

If a class implements the methods to perform manual serialization (`writeObject`, `readObject`) or uses
a replacement object (`writeReplace`, `readResolve`) then this class is ignored.

Note: This rule has been revamped with PMD 6.52.0. It was previously called &quot;BeanMembersShouldSerialize&quot;.
The property `prefix` has been deprecated, since in a serializable class all fields have to be
serializable regardless of the name.

Example(s):
```
class Buzz implements java.io.Serializable {
    private static final long serialVersionUID = 1L;

    private transient int someFoo;          // good, it's transient
    private static int otherFoo;            // also OK, it's static
    private java.io.FileInputStream stream; // bad - FileInputStream is not serializable

    public void setStream(FileInputStream stream) {
        this.stream = stream;
    }

    public int getSomeFoo() {
          return this.someFoo;
    }
}
```
