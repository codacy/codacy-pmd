Since Java5 brought a new implementation of the Map designed for multi-threaded access, you can perform efficient map reads without blocking other threads.

They should be used when you are at a very high level of concurrency in your project.

Ex:

	  public class ConcurrentApp { 
	  		public void getMyInstance() { 
	  			Map map1 = new HashMap(); // fine for single-threaded access 
	  			Map map2 = new ConcurrentHashMap(); // preferred for use with multiple threads 
	  			
	  			// the following case will be ignored by this rule 
	  			Map map3 = someModule.methodThatReturnMap(); // might be OK, if the returned map is already thread-safe 
	  		 } 
	  	}

[SOURCE](http://pmd.sourceforge.net/pmd-5.3.2/pmd-java/rules/java/controversial.html#UseConcurrentHashMap)
