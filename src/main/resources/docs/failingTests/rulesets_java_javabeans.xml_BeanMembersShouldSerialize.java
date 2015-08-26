//#Patterns: rulesets_java_javabeans.xml_BeanMembersShouldSerialize

public class Foo {

    private transient int someFoo;  // good, it's transient
    private static int otherFoo;    // also OK
    private int moreFoo;            // OK, has proper accessors, see below
    //#Warn: rulesets_java_javabeans.xml_BeanMembersShouldSerialize
    private int badFoo;             // bad, should be marked transient

    private void setMoreFoo(int moreFoo){
        this.moreFoo = moreFoo;
    }

    private int getMoreFoo(){
        return this.moreFoo;
    }
}

