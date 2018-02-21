//#Patterns: category_java_errorprone_AvoidUsingOctalValues

public class Foo {

        //#Warn: category_java_errorprone_AvoidUsingOctalValues
        int i = 012;    // set i with 10 not 12
        //#Warn: category_java_errorprone_AvoidUsingOctalValues
        int j = 010;    // set j with 8 not 10

        int z = 30;
}
