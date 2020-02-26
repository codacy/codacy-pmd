//#Patterns: category_java_multithreading_DoNotUseThreads

// This is not allowed

//#Warn: category_java_multithreading_DoNotUseThreads
public class UsingThread extends Thread {

} // Neither this,

// This is allowed
public class OtherThread implements Runnable {
    public void methode() {
    }
}
