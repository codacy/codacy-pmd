//#Patterns: category_java_errorprone_AssignmentToNonFinalStatic

public class StaticField {
   static int x;
   public FinalFields(int y) {
    //#Warn: category_java_errorprone_AssignmentToNonFinalStatic
    x = y; // unsafe
   }
}
