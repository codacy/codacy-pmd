//#Patterns: migrating_ReplaceEnumerationWithIterator
//#Warn: migrating_ReplaceEnumerationWithIterator
public class Foo implements Enumeration {
    private int x = 42;

    public boolean hasMoreElements() {
        return true;
    }

    public Object nextElement() {
        return String.valueOf(i++);
    }

}