//#Patterns: rulesets_java_j2ee.xml_RemoteSessionInterfaceNamingConvention

public interface MyBeautifulHome extends javax.ejb.EJBHome {

} // proper name

//#Warn: rulesets_java_j2ee.xml_RemoteSessionInterfaceNamingConvention
public interface MissingProperSuffix extends javax.ejb.EJBHome {

} // non-standard name