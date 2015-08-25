//#Patterns: rulesets_java_strings.xml_UseEqualsToCompareStrings

public class Foo {

  public boolean test(String s) {
      //#Warn: rulesets_java_strings.xml_UseEqualsToCompareStrings
      if (s == "one") return true; // unreliable if (\"two\".equals(s)) return true; // better return false;
  }

}

