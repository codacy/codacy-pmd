//#Patterns: java_j2ee_MDBAndSessionBeanNamingConvention

public class SomeBean implements SessionBean{

} // proper name
//#Warn: java_j2ee_MDBAndSessionBeanNamingConvention
public class MissingTheProperSuffix implements SessionBean {

} // non-standard name