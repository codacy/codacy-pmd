//#Patterns: category_java_codestyle_RemoteSessionInterfaceNamingConvention

public interface MyBeautifulHome extends javax.ejb.EJBHome {

} // proper name

//#Warn: category_java_codestyle_RemoteSessionInterfaceNamingConvention
public interface MissingProperSuffix extends javax.ejb.EJBHome {

} // non-standard name
