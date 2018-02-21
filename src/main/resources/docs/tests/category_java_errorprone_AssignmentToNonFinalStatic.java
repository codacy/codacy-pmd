//#Patterns: category_java_errorprone_AssignmentToNonFinalStatic

public class StaticField {
    //#Warn: category_java_errorprone_AssignmentToNonFinalStatic
   static int x;
   public FinalFields(int y) {
    x = y; // unsafe
   }
}
