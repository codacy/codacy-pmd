//#Patterns: category_java_multithreading_AvoidSynchronizedAtMethodLevel


public class Foo {
  // Try to avoid this:
	//#Warn: category_java_multithreading_AvoidSynchronizedAtMethodLevel
  synchronized void foo() {
  }
  // Prefer this:
  void bar() {
    synchronized(this) {
    }
  }

  // Try to avoid this for static methods:
  //#Warn: category_java_multithreading_AvoidSynchronizedAtMethodLevel
  static synchronized void fooStatic() {
  }
  
  // Prefer this:
  static void barStatic() {
    synchronized(Foo.class) {
    }
  }
}

