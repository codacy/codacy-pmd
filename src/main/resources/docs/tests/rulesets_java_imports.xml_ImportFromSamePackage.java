//#Patterns: imports_ImportFromSamePackage

package foo;
//#Warn: imports_ImportFromSamePackage
import foo.Buz; // no need for this
//#Warn: imports_ImportFromSamePackage
import foo.*; // or this

public class Bar{}