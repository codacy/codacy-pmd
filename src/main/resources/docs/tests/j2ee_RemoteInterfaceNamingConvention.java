//#Patterns: j2ee_RemoteInterfaceNamingConvention


/* Poor Session suffix */
//#Warn: j2ee_RemoteInterfaceNamingConvention
public interface BadSuffixSession extends javax.ejb.EJBObject {

}

/* Poor EJB suffix */
//#Warn: j2ee_RemoteInterfaceNamingConvention
public interface BadSuffixEJB extends javax.ejb.EJBObject {

}

/* Poor Bean suffix */
//#Warn: j2ee_RemoteInterfaceNamingConvention
public interface BadSuffixBean extends javax.ejb.EJBObject {

}