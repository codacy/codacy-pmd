//#Patterns: java_basic_BigIntegerInstantiation
public class Foo {
    public void bar() {

//#Warn: java_basic_BigIntegerInstantiation
	BigInteger bi = new BigInteger(1);		
//#Warn: java_basic_BigIntegerInstantiation
	BigInteger bi2 = new BigInteger("0");
	BigInteger bi3 = new BigInteger(0.0);	
	BigInteger bi4;
//#Warn: java_basic_BigIntegerInstantiation
	bi4 = new BigInteger(0);				
    

	BigInteger zbi = BigInteger.ONE;		

	zbi4 = BigInteger.ZERO;				

    }
}

