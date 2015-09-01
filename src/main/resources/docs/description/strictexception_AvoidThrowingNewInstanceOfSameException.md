Catch blocks that merely rethrow a caught exception wrapped inside a new instance of the same type only add to code size and runtime complexity.

Ex:

public void bar() {
      try {
       // do something
      }  catch (SomeException se) {
         // harmless comment      
           throw new SomeException(se);
      }
}

[SOURCE](https://pmd.github.io/pmd-5.3.3/pmd-java/rules/java/strictexception.html#AvoidThrowingNewInstanceOfSameException)
