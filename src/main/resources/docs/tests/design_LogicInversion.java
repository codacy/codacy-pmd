//#Patterns: design_LogicInversion
public class Foo {

public boolean bar(int a, int b) {

//#Err: design_LogicInversion
	if (!(a == b)) // use !=
         return false;

//#Err: design_LogicInversion
	if (!(a < b)) // use >=
         return false;

	if (a != b)
         return false;

	if (a >= b)
         return false;


	return true;

    }
}

