//#Patterns: category_java_performance_BigIntegerInstantiation
public class Foo {
    public void bar() {

//#Warn: category_java_performance_BigIntegerInstantiation
	BigInteger bi = new BigInteger(1);		
//#Warn: category_java_performance_BigIntegerInstantiation
	BigInteger bi2 = new BigInteger("0");
	BigInteger bi3 = new BigInteger(0.0);	
	BigInteger bi4;
//#Warn: category_java_performance_BigIntegerInstantiation
	bi4 = new BigInteger(0);				
    

	BigInteger zbi = BigInteger.ONE;		

	zbi4 = BigInteger.ZERO;				

    }
}

