Since: PMD 6.12.0

Java 7 introduced the try-with-resources statement. This statement ensures that each resource is closed at the end
of the statement. It avoids the need of explicitly closing the resources in a finally block. Additionally exceptions
are better handled: If an exception occurred both in the `try` block and `finally` block, then the exception from
the try block was suppressed. With the `try`-with-resources statement, the exception thrown from the try-block is
preserved.

Example(s):
```
public class TryWithResources {
    public void run() {
        InputStream in = null;
        try {
            in = openInputStream();
            int i = in.read();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (in != null) in.close();
            } catch (IOException ignored) {
                // ignored
            }
        }

        // better use try-with-resources
        try (InputStream in2 = openInputStream()) {
            int i = in2.read();
        }
    }
}
```
