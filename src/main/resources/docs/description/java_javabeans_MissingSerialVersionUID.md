Since: PMD 3.0

Serializable classes should provide a serialVersionUID field.

Example(s):
```
public class Foo implements java.io.Serializable {
 String name;
 // Define serialization id to avoid serialization related bugs
 // i.e., public static final long serialVersionUID = 4328743;
}
```

[Source](https://pmd.github.io/pmd-5.6.1/pmd-java/rules/java/javabeans.html#MissingSerialVersionUID)
