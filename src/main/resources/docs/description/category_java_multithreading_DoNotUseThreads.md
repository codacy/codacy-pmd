Since: PMD 4.1

The J2EE specification explicitly forbids the use of threads.

Example(s):
```
// This is not allowed
public class UsingThread extends Thread {

}

// Neither this,
public class OtherThread implements Runnable {
    // Nor this ...
    public void methode() {
        Runnable thread = new Thread(); thread.run();
    }
}
```
