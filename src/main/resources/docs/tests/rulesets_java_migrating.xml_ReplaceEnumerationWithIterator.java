//#Patterns: rulesets_java_migrating.xml_ReplaceEnumerationWithIterator
//#Warn: rulesets_java_migrating.xml_ReplaceEnumerationWithIterator
public class Foo implements Enumeration {
    private int x = 42;

    public boolean hasMoreElements() {
        return true;
    }

    public Object nextElement() {
        return String.valueOf(i++);
    }

}