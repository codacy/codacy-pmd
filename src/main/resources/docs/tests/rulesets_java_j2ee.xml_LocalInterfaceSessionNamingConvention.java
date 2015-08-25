//#Patterns: rulesets_java_j2ee.xml_LocalInterfaceSessionNamingConvention

public interface MyLocal extends javax.ejb.EJBLocalObject {

} // proper name
//#Warn: rulesets_java_j2ee.xml_LocalInterfaceSessionNamingConvention
public interface MissingProperSuffix extends javax.ejb.EJBLocalObject {

} // non-standard name