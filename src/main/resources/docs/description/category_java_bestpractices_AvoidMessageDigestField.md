Since: PMD 6.18.0

Declaring a MessageDigest instance as a field make this instance directly available to multiple threads.
            Such sharing of MessageDigest instances should be avoided if possible since it leads to wrong results
            if the access is not synchronized correctly.
            Just create a new instance and use it locally, where you need it.
            Creating a new instance is easier than synchronizing access to a shared instance.

Example(s):
```
import java.security.MessageDigest;
public class AvoidMessageDigestFieldExample {
    private final MessageDigest sharedMd;
    public AvoidMessageDigestFieldExample() throws Exception {
        sharedMd = MessageDigest.getInstance("SHA-256");
    }
    public byte[] calculateHashShared(byte[] data) {
        // sharing a MessageDigest like this without synchronizing access
        // might lead to wrong results
        sharedMd.reset();
        sharedMd.update(data);
        return sharedMd.digest();
    }

    // better
    public byte[] calculateHash(byte[] data) throws Exception {
        MessageDigest md = MessageDigest.getInstance("SHA-256");
        md.update(data);
        return md.digest();
    }
}
```
