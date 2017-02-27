//#Patterns: java_design_LogicInversion
public class Foo {

public boolean bar(int a, int b) {

//#Warn: java_design_LogicInversion
	if (!(a == b)) // use !=
         return false;

//#Warn: java_design_LogicInversion
	if (!(a < b)) // use >=
         return false;

	if (a != b)
         return false;

	if (a >= b)
         return false;


	return true;

    }
}

