//#Patterns: category_java_errorprone_AvoidMultipleUnaryOperators

public class Foo {

    public void bar()

    {
        // These are typo bugs, or at best needlessly complex and confusing:
        //#Warn: category_java_errorprone_AvoidMultipleUnaryOperators
        int i = - -1;
        //#Warn: category_java_errorprone_AvoidMultipleUnaryOperators
        int z = ~~2;
        //#Warn: category_java_errorprone_AvoidMultipleUnaryOperators
        boolean b = !!true;

        // These are better:
        int ii = 1;
        int jj = -1;
        int zz = 2;
        boolean bb = true;
        boolean cc = false;


    }
}


