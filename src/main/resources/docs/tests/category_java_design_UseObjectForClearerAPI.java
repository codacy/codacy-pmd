//#Patterns: category_java_design_UseObjectForClearerAPI

public class MyClass {
    //#Warn: category_java_design_UseObjectForClearerAPI
    public void connect(String username,
        String pssd,
        String databaseName,
        String databaseAdress)
        // Instead of those parameters object
        // would ensure a cleaner API and permit
        // to add extra data transparently (no code change):
        // void connect(UserData data);
         {
        
         }
}
