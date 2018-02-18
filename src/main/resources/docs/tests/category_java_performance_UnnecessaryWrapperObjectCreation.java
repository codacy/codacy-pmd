//#Patterns: category_java_performance_UnnecessaryWrapperObjectCreation

public class Foo {

    public void bar(String s) {
      int i, i2;

      //#Warn: category_java_performance_UnnecessaryWrapperObjectCreation
      i = Integer.valueOf(s).intValue();
      i = Integer.parseInt(s);

      //#Warn: category_java_performance_UnnecessaryWrapperObjectCreation
      i2 = Integer.valueOf(i).intValue();
      i2 = i;

      //#Warn: category_java_performance_UnnecessaryWrapperObjectCreation
      String s3 = Integer.valueOf(i2).toString();
      s3 = Integer.toString(i2);

    }

}
