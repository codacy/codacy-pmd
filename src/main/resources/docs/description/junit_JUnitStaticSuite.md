The suite() method in a JUnit test needs to be both public and static.

Ex:

import junit.framework.*;

public class Foo extends TestCase {
   public void suite() {}         // oops, should be static
   private static void suite() {} // oops, should be public
}

[SOURCE](https://pmd.github.io/pmd-5.3.3/pmd-java/rules/java/junit.html#JUnitStaticSuite)
