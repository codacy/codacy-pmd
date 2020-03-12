Since: PMD 6.3.0

Do not use hard coded initialization vector in cryptographic operations. Please use a randomly generated IV.

Example(s):
```
public class Foo {
    void good() {
        SecureRandom random = new SecureRandom();
        byte iv[] = new byte[16];
        random.nextBytes(bytes);
    }

    void bad() {
        byte[] iv = new byte[] { 00, 00, 00, 00, 00, 00, 00, 00, 00, 00, 00, 00, 00, 00, 00, 00, };
    }

    void alsoBad() {
        byte[] iv = "secret iv in here".getBytes();
    }
}
```
