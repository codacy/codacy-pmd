//#Patterns: j2ee_LocalHomeNamingConvention

public interface MyBeautifulLocalHome extends javax.ejb.EJBLocalHome {


} // proper name
//#Warn: j2ee_LocalHomeNamingConvention
public interface MissingProperSuffix extends javax.ejb.EJBLocalHome {

} // non-standard name