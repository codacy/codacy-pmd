Since: PMD 6.4.0

Do not use hard coded values for cryptographic operations. Please store keys outside of source code.

Example(s):
```
public class Foo {
    void good() {
        SecretKeySpec secretKeySpec = new SecretKeySpec(Properties.getKey(), "AES");
    }

    void bad() {
        SecretKeySpec secretKeySpec = new SecretKeySpec("my secret here".getBytes(), "AES");
    }
}
```
