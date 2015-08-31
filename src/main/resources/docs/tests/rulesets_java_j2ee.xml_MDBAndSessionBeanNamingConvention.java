//#Patterns: j2ee_MDBAndSessionBeanNamingConvention

public class SomeBean implements SessionBean{

} // proper name
//#Warn: j2ee_MDBAndSessionBeanNamingConvention
public class MissingTheProperSuffix implements SessionBean {

} // non-standard name