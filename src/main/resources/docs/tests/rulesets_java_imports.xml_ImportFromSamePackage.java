//#Patterns: rulesets_java_imports.xml_ImportFromSamePackage

package foo;
//#Warn: rulesets_java_imports.xml_ImportFromSamePackage
import foo.Buz; // no need for this
//#Warn: rulesets_java_imports.xml_ImportFromSamePackage
import foo.*; // or this

public class Bar{}