//#Patterns: rulesets_java_imports.xml_UnnecessaryFullyQualifiedName

import java.util.List;

public class Foo {
    //#Warn: rulesets_java_imports.xml_UnnecessaryFullyQualifiedName
    private java.util.List list1; // Unnecessary FQN
    private List list2; // More appropriate given import of 'java.util.List'
}
