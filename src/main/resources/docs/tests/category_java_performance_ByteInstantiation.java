//#Patterns: category_java_performance_ByteInstantiation

public class Foo {

    public void bar() {

            //#Warn: category_java_performance_ByteInstantiation
			new Byte("a");
    }

}

