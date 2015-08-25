//#Patterns: rulesets_java_javabeans.xml_MissingSerialVersionUID

//#Warn: rulesets_java_javabeans.xml_MissingSerialVersionUID
public class Foo implements java.io.Serializable {
    String name; // Define serialization id to avoid serialization related bugs
    // i.e., public static final long serialVersionUID = 4328743;

}