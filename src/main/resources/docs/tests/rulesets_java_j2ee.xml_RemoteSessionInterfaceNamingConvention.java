//#Patterns: j2ee_RemoteSessionInterfaceNamingConvention

public interface MyBeautifulHome extends javax.ejb.EJBHome {

} // proper name

//#Warn: j2ee_RemoteSessionInterfaceNamingConvention
public interface MissingProperSuffix extends javax.ejb.EJBHome {

} // non-standard name