//#Patterns: optimizations_RedundantFieldInitializer

public class Foo {
    
    //#Warn: optimizations_RedundantFieldInitializer
    boolean a = false; 
    boolean b;
    
    //#Warn: optimizations_RedundantFieldInitializer
    byte c = 0;
    byte d;

    //#Warn: optimizations_RedundantFieldInitializer
    short e = 0;
    short f;

    //#Warn: optimizations_RedundantFieldInitializer
    char g = 0;
    char h;

    //#Warn: optimizations_RedundantFieldInitializer
    int i = 0;
    int j;

    //#Warn: optimizations_RedundantFieldInitializer
    long k = 0;
    long m;

    //#Warn: optimizations_RedundantFieldInitializer
    float n = .0f;    
    float o;

    //#Warn: optimizations_RedundantFieldInitializer
    double p = 0d;   
    double q;
    
    //#Warn: optimizations_RedundantFieldInitializer
    Object r = null;
    Object s;

    //#Warn: optimizations_RedundantFieldInitializer
    MyClass mca[] = null;
    MyClass mcb[];
}
