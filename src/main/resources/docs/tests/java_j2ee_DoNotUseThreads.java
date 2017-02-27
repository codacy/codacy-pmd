//#Patterns: java_j2ee_DoNotUseThreads

// This is not allowed

//#Warn: java_j2ee_DoNotUseThreads
public class UsingThread extends Thread {

} // Neither this,

//#Warn: java_j2ee_DoNotUseThreads
public class OtherThread implements Runnable {
// Nor this ...

    public void methode() {
    }
}