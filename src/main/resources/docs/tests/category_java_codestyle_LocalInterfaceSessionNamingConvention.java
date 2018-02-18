//#Patterns: category_java_codestyle_LocalInterfaceSessionNamingConvention

public interface MyLocal extends javax.ejb.EJBLocalObject {

} // proper name
//#Warn: category_java_codestyle_LocalInterfaceSessionNamingConvention
public interface MissingProperSuffix extends javax.ejb.EJBLocalObject {

} // non-standard name
