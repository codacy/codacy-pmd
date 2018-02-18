//#Patterns: category_java_errorprone_MissingSerialVersionUID

//#Warn: category_java_errorprone_MissingSerialVersionUID
public class Foo implements java.io.Serializable {
    String name; // Define serialization id to avoid serialization related bugs
    // i.e., public static final long serialVersionUID = 4328743;

}
