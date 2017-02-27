//#Patterns: java_imports_ImportFromSamePackage

package foo;
//#Info: java_imports_ImportFromSamePackage
import foo.Buz; // no need for this
//#Info: java_imports_ImportFromSamePackage
import foo.*; // or this

public class Bar{}