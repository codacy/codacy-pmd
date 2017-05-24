Since: PMD 0.1

Empty Catch Block finds instances where an exception is caught, but nothing is done.  
In most circumstances, this swallows an exception which should either be acted on 
or reported.

Example(s):
```
public void doSomething() {
  try {
    FileInputStream fis = new FileInputStream("/tmp/bugger");
  } catch (IOException ioe) {
      // not good
  }
}
```
