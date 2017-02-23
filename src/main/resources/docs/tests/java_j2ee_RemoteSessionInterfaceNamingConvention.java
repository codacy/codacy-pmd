//#Patterns: java_j2ee_RemoteSessionInterfaceNamingConvention

public interface MyBeautifulHome extends javax.ejb.EJBHome {

} // proper name

//#Warn: java_j2ee_RemoteSessionInterfaceNamingConvention
public interface MissingProperSuffix extends javax.ejb.EJBHome {

} // non-standard name