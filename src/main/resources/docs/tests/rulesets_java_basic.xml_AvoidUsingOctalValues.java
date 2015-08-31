//#Patterns: basic_AvoidUsingOctalValues

public class Foo {

        //#Err: basic_AvoidUsingOctalValues
        int i = 012;    // set i with 10 not 12
        //#Err: basic_AvoidUsingOctalValues
        int j = 010;    // set j with 8 not 10

        int z = 30;
}