//#Patterns: java_j2ee_LocalHomeNamingConvention

public interface MyBeautifulLocalHome extends javax.ejb.EJBLocalHome {


} // proper name
//#Warn: java_j2ee_LocalHomeNamingConvention
public interface MissingProperSuffix extends javax.ejb.EJBLocalHome {

} // non-standard name