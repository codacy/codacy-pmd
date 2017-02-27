//#Patterns: java_strings_UseEqualsToCompareStrings

public class Foo {

  public boolean test(String s) {
      //#Warn: java_strings_UseEqualsToCompareStrings
      if (s == "one") return true; // unreliable if (\"two\".equals(s)) return true; // better return false;
  }

}

