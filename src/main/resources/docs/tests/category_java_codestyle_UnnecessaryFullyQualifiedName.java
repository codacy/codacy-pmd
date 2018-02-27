//#Patterns: category_java_codestyle_UnnecessaryFullyQualifiedName

import java.util.List;

public class Foo {
    //#Info: category_java_codestyle_UnnecessaryFullyQualifiedName
    private java.util.List list1; // Unnecessary FQN
    private List list2; // More appropriate given import of 'java.util.List'
}
