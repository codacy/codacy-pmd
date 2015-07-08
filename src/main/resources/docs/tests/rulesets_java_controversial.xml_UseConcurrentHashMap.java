//#Patterns: rulesets_java_controversial.xml_UseConcurrentHashMap

import java.util.concurrent.ConcurrentHashMap;

public class Foo {
    public void getMyInstance() {
        //#Warn: rulesets_java_controversial.xml_UseConcurrentHashMap
        Map map1 = new HashMap();
        
        ConcurrentHashMap map2 = new ConcurrentHashMap();
    }
}
