//#Patterns: rulesets_java_j2ee.xml_LocalHomeNamingConvention

public interface MyBeautifulLocalHome extends javax.ejb.EJBLocalHome {


} // proper name
//#Warn: rulesets_java_j2ee.xml_LocalHomeNamingConvention
public interface MissingProperSuffix extends javax.ejb.EJBLocalHome {

} // non-standard name