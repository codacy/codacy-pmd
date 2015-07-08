This rule counts the number of unique attributes, local variables, and return types within an object. A number higher than the specified threshold can indicate a high degree of coupling.

Coupling is bad because it prevents the replacement or changes of components independently of the whole.

Ex:

    import com.Blah;
    import org.Bar;
    import org.Bardo;

    public class Foo {
       private Blah var1;
       private Bar var2;

        //followed by many imports of unique objects
       void ObjectC doWork() {
         Bardo var55;
         ObjectA var44;
         ObjectZ var93;
         return something;
       }
    }

[SOURCE](http://pmd.sourceforge.net/pmd-5.3.2/pmd-java/rules/java/coupling.html#CouplingBetweenObjects)
