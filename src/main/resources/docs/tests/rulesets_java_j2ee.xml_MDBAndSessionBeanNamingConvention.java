//#Patterns: rulesets_java_j2ee.xml_MDBAndSessionBeanNamingConvention

public class SomeBean implements SessionBean{

} // proper name
//#Warn: rulesets_java_j2ee.xml_MDBAndSessionBeanNamingConvention
public class MissingTheProperSuffix implements SessionBean {

} // non-standard name