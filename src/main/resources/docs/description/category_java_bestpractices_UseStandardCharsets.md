Since: PMD 6.34.0

Starting with Java 7, StandardCharsets provides constants for common Charset objects, such as UTF-8.
Using the constants is less error prone, and can provide a small performance advantage compared to `Charset.forName(...)`
since no scan across the internal `Charset` caches is needed.

Example(s):
```
public class UseStandardCharsets {
    public void run() {

        // looking up the charset dynamically
        try (OutputStreamWriter osw = new OutputStreamWriter(out, Charset.forName("UTF-8"))) {
            osw.write("test");
        }

        // best to use StandardCharsets
        try (OutputStreamWriter osw = new OutputStreamWriter(out, StandardCharsets.UTF_8)) {
            osw.write("test");
        }
    }
}
```
