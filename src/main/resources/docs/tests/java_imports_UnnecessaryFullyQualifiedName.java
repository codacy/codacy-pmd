//#Patterns: java_imports_UnnecessaryFullyQualifiedName

import java.util.List;

public class Foo {
    //#Info: java_imports_UnnecessaryFullyQualifiedName
    private java.util.List list1; // Unnecessary FQN
    private List list2; // More appropriate given import of 'java.util.List'
}
