//#Patterns: java_j2ee_LocalInterfaceSessionNamingConvention

public interface MyLocal extends javax.ejb.EJBLocalObject {

} // proper name
//#Warn: java_j2ee_LocalInterfaceSessionNamingConvention
public interface MissingProperSuffix extends javax.ejb.EJBLocalObject {

} // non-standard name