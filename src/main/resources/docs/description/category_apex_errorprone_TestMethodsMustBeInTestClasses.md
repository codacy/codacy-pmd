Since: PMD 6.22.0

Test methods marked as a testMethod or annotated with @IsTest,
          but not residing in a test class should be moved to a proper
          class or have the @IsTest annotation added to the class.

          Support for tests inside functional classes was removed in Spring-13 (API Version 27.0),
          making classes that violate this rule fail compile-time. This rule is mostly usable when
          dealing with legacy code.

Example(s):
```
// Violating
private class TestClass {
  @IsTest static void myTest() {
    // Code here
  }
}

private class TestClass {
  static testMethod void myTest() {
    // Code here
  }
}

// Compliant
@IsTest
private class TestClass {
  @IsTest static void myTest() {
    // Code here
  }
}

@IsTest
private class TestClass {
  static testMethod void myTest() {
    // Code here
  }
}
```
