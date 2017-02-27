//#Patterns: java_strings_ConsecutiveAppendsShouldReuse
public class Foo {

    public void bar() {
        String foo = " ";

        StringBuffer buf = new StringBuffer();
        //#Warn: java_strings_ConsecutiveAppendsShouldReuse
        buf.append("Hello"); // poor
        //#Warn: java_strings_ConsecutiveAppendsShouldReuse
        buf.append(foo);
        buf.append("World");

        StringBuffer buf2 = new StringBuffer();
        buf2.append("Hello").append(foo).append("World"); // good

    }
}

