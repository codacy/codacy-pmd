//#Patterns: java_optimizations_RedundantFieldInitializer

public class Foo {
    
    //#Warn: java_optimizations_RedundantFieldInitializer
    boolean a = false; 
    boolean b;
    
    //#Warn: java_optimizations_RedundantFieldInitializer
    byte c = 0;
    byte d;

    //#Warn: java_optimizations_RedundantFieldInitializer
    short e = 0;
    short f;

    //#Warn: java_optimizations_RedundantFieldInitializer
    char g = 0;
    char h;

    //#Warn: java_optimizations_RedundantFieldInitializer
    int i = 0;
    int j;

    //#Warn: java_optimizations_RedundantFieldInitializer
    long k = 0;
    long m;

    //#Warn: java_optimizations_RedundantFieldInitializer
    float n = .0f;    
    float o;

    //#Warn: java_optimizations_RedundantFieldInitializer
    double p = 0d;   
    double q;
    
    //#Warn: java_optimizations_RedundantFieldInitializer
    Object r = null;
    Object s;

    //#Warn: java_optimizations_RedundantFieldInitializer
    MyClass mca[] = null;
    MyClass mcb[];
}
