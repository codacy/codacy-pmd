//#Patterns: category_java_multithreading_DoNotUseThreads

// This is not allowed

//#Warn: category_java_multithreading_DoNotUseThreads
public class UsingThread extends Thread {

} // Neither this,

//#Warn: category_java_multithreading_DoNotUseThreads
public class OtherThread implements Runnable {
// Nor this ...

    public void methode() {
    }
}
