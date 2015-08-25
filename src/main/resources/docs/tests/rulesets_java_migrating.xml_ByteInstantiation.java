//#Patterns: rulesets_java_migrating.xml_ByteInstantiation

public class Foo {

    public void bar() {

            //#Warn: rulesets_java_migrating.xml_ByteInstantiation
			new Byte("a");
    }

}

