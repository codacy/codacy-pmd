//#Patterns: design_AvoidSynchronizedAtMethodLevel


public class Foo {
  // Try to avoid this:
	//#Err: design_AvoidSynchronizedAtMethodLevel
  synchronized void foo() {
  }
  // Prefer this:
  void bar() {
    synchronized(this) {
    }
  }

  // Try to avoid this for static methods:
  //#Err: design_AvoidSynchronizedAtMethodLevel
  static synchronized void fooStatic() {
  }
  
  // Prefer this:
  static void barStatic() {
    synchronized(Foo.class) {
    }
  }
}

