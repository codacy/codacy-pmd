//#Patterns: java_naming_SuspiciousEqualsMethodName

public class Foo {
	//#Info: java_naming_SuspiciousEqualsMethodName
   public int equals(Object o) {
     // oops, this probably was supposed to be boolean equals
   }
   //#Info: java_naming_SuspiciousEqualsMethodName
   public boolean equals(String s) {
     // oops, this probably was supposed to be equals(Object)
   }
   //#Info: java_naming_SuspiciousEqualsMethodName
   public boolean equals(Object o1, Object o2) {
     // oops, this probably was supposed to be equals(Object)
   }

   public boolean equals(Object o) {
   	
   }
}