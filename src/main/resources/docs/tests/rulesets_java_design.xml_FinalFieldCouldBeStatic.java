//#Patterns: design_FinalFieldCouldBeStatic

public class Foo {
	//#Info: design_FinalFieldCouldBeStatic
  public final int BAR = 42; // this could be static and save some space

  public static final int BARGOOD = 42;
}