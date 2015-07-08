//#Patterns: rulesets_java_coupling.xml_LoosePackageCoupling
package some.packagez;

import some.other.packagez.subpackage.subsubpackage.DontUseThisClass;


public class Bar {
    //#Warn: rulesets_java_coupling.xml_LoosePackageCoupling
    DontUseThisClass boo = new DontUseThisClass();
}