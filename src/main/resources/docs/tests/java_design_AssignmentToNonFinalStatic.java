//#Patterns: java_design_AssignmentToNonFinalStatic

public class StaticField {
    //#Warn: java_design_AssignmentToNonFinalStatic
   static int x;
   public FinalFields(int y) {
    x = y; // unsafe
   }
}
