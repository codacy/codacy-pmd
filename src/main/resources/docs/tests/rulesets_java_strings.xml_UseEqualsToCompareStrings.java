//#Patterns: strings_UseEqualsToCompareStrings

public class Foo {

  public boolean test(String s) {
      //#Warn: strings_UseEqualsToCompareStrings
      if (s == "one") return true; // unreliable if (\"two\".equals(s)) return true; // better return false;
  }

}

