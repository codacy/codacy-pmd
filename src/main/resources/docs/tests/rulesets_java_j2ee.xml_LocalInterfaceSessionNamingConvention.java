//#Patterns: j2ee_LocalInterfaceSessionNamingConvention

public interface MyLocal extends javax.ejb.EJBLocalObject {

} // proper name
//#Warn: j2ee_LocalInterfaceSessionNamingConvention
public interface MissingProperSuffix extends javax.ejb.EJBLocalObject {

} // non-standard name