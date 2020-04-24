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
public class UsingExecutorService {

    public void methodX() {
        ExecutorService executorService = Executors.newFixedThreadPool(5);
    }
}

// Nor this,
public class Example implements ExecutorService {

}

// Nor this,
public class Example extends AbstractExecutorService {

}

// Nor this
public class UsingExecutors {

    public void methodX() {
        Executors.newSingleThreadExecutor().submit(() -> System.out.println("Hello!"));
    }
}
```
