//#Patterns: rulesets_java_j2ee.xml_DoNotUseThreads

// This is not allowed

//#Warn: rulesets_java_j2ee.xml_DoNotUseThreads
public class UsingThread extends Thread {

} // Neither this,

//#Warn: rulesets_java_j2ee.xml_DoNotUseThreads
public class OtherThread implements Runnable {
// Nor this ...

    public void methode() {
        //#Warn: rulesets_java_j2ee.xml_DoNotUseThreads
        Runnable thread = new Thread();
        thread.run();
    }
}