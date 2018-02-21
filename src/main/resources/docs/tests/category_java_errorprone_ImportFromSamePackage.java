//#Patterns: category_java_errorprone_ImportFromSamePackage

package foo;
//#Warn: category_java_errorprone_ImportFromSamePackage
import foo.Buz; // no need for this
//#Warn: category_java_errorprone_ImportFromSamePackage
import foo.*; // or this

public class Bar{}
