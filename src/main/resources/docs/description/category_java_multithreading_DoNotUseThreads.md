Since: PMD 4.1

The J2EE specification explicitly forbids the use of threads. Threads are resources, that should be managed and monitored by the J2EE server.
If the application creates threads on its own or uses own custom thread pools, then these threads are not managed, which could lead to resource exhaustion.
Also EJB's might be moved between machines in a cluster and only managed resources can be moved along.

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
