//#Patterns: j2ee_DoNotUseThreads

// This is not allowed

//#Warn: j2ee_DoNotUseThreads
public class UsingThread extends Thread {

} // Neither this,

//#Warn: j2ee_DoNotUseThreads
public class OtherThread implements Runnable {
// Nor this ...

    public void methode() {
        //#Warn: j2ee_DoNotUseThreads
        Runnable thread = new Thread();
        thread.run();
    }
}