//#Patterns: java_design_AvoidSynchronizedAtMethodLevel


public class Foo {
  // Try to avoid this:
	//#Warn: java_design_AvoidSynchronizedAtMethodLevel
  synchronized void foo() {
  }
  // Prefer this:
  void bar() {
    synchronized(this) {
    }
  }

  // Try to avoid this for static methods:
  //#Warn: java_design_AvoidSynchronizedAtMethodLevel
  static synchronized void fooStatic() {
  }
  
  // Prefer this:
  static void barStatic() {
    synchronized(Foo.class) {
    }
  }
}

