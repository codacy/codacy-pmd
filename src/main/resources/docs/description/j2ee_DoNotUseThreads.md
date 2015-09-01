The J2EE specification explicitly forbids the use of threads.

Ex:

	
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
				
		

[SOURCE](https://pmd.github.io/pmd-5.3.3/pmd-java/rules/java/j2ee.html#DoNotUseThreads)
