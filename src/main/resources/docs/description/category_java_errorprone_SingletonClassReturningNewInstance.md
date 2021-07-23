Since: PMD 5.4

A singleton class should only ever have one instance. Failure to check
            whether an instance has already been created may result in multiple
            instances being created.

Example(s):
```
class Singleton {
    private static Singleton instance = null;
    public static Singleton getInstance() {
        synchronized(Singleton.class) {
            return new Singleton(); // this should be assigned to the field
        }
    }
}
```
