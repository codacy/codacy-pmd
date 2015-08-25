//#Patterns: rulesets_java_strings.xml_ConsecutiveAppendsShouldReuse
public class Foo {

    public void bar() {
        String foo = " ";

        StringBuffer buf = new StringBuffer();
        //#Warn: rulesets_java_strings.xml_ConsecutiveAppendsShouldReuse
        buf.append("Hello"); // poor
        //#Warn: rulesets_java_strings.xml_ConsecutiveAppendsShouldReuse
        buf.append(foo);
        buf.append("World");

        StringBuffer buf2 = new StringBuffer();
        buf2.append("Hello").append(foo).append("World"); // good

    }
}

