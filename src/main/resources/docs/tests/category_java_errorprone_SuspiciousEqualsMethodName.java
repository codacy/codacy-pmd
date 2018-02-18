//#Patterns: category_java_errorprone_SuspiciousEqualsMethodName

public class Foo {
	//#Warn: category_java_errorprone_SuspiciousEqualsMethodName
   public int equals(Object o) {
     // oops, this probably was supposed to be boolean equals
   }
   //#Warn: category_java_errorprone_SuspiciousEqualsMethodName
   public boolean equals(String s) {
     // oops, this probably was supposed to be equals(Object)
   }
   //#Warn: category_java_errorprone_SuspiciousEqualsMethodName
   public boolean equals(Object o1, Object o2) {
     // oops, this probably was supposed to be equals(Object)
   }

   public boolean equals(Object o) {
   	
   }
}
