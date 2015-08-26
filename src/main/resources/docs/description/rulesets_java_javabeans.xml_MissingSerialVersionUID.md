Serializable classes should provide a serialVersionUID field.

Ex:


public class Foo implements java.io.Serializable {
 String name;
 // Define serialization id to avoid serialization related bugs
 // i.e., public static final long serialVersionUID = 4328743;
}

[SOURCE](https://pmd.github.io/pmd-5.3.3/pmd-java/rules/java/javabeans.html#MissingSerialVersionUID)
