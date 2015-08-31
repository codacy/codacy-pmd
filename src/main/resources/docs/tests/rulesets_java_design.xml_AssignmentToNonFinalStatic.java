//#Patterns: design_AssignmentToNonFinalStatic

public class StaticField {
    //#Err: design_AssignmentToNonFinalStatic
   static int x;
   public FinalFields(int y) {
    x = y; // unsafe
   }
}
