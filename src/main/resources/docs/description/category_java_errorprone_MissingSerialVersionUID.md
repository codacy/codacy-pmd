Since: PMD 3.0

Serializable classes should provide a serialVersionUID field.
The serialVersionUID field is also needed for abstract base classes. Each individual class in the inheritance
chain needs an own serialVersionUID field. See also [Should an abstract class have a serialVersionUID](https://stackoverflow.com/questions/893259/should-an-abstract-class-have-a-serialversionuid).

Example(s):
```
public class Foo implements java.io.Serializable {
    String name;
    // Define serialization id to avoid serialization related bugs
    // i.e., public static final long serialVersionUID = 4328743;
}
```
