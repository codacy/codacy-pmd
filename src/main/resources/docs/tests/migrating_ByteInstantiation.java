//#Patterns: migrating_ByteInstantiation

public class Foo {

    public void bar() {

            //#Warn: migrating_ByteInstantiation
			new Byte("a");
    }

}

