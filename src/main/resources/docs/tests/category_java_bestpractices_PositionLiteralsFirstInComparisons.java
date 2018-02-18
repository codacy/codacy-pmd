//#Patterns: category_java_bestpractices_PositionLiteralsFirstInComparisons

class Foo {
  boolean bar(String x) {
	//#Warn: category_java_bestpractices_PositionLiteralsFirstInComparisons
    return x.equals("2"); // should be "2".equals(x)
  }

  boolean bar2(String x) {
    return "2".equals(x);
  }
}

