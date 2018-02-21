//#Patterns: category_java_performance_RedundantFieldInitializer

public class Foo {
    
    //#Warn: category_java_performance_RedundantFieldInitializer
    boolean a = false; 
    boolean b;
    
    //#Warn: category_java_performance_RedundantFieldInitializer
    byte c = 0;
    byte d;

    //#Warn: category_java_performance_RedundantFieldInitializer
    short e = 0;
    short f;

    //#Warn: category_java_performance_RedundantFieldInitializer
    char g = 0;
    char h;

    //#Warn: category_java_performance_RedundantFieldInitializer
    int i = 0;
    int j;

    //#Warn: category_java_performance_RedundantFieldInitializer
    long k = 0;
    long m;

    //#Warn: category_java_performance_RedundantFieldInitializer
    float n = .0f;    
    float o;

    //#Warn: category_java_performance_RedundantFieldInitializer
    double p = 0d;   
    double q;
    
    //#Warn: category_java_performance_RedundantFieldInitializer
    Object r = null;
    Object s;

    //#Warn: category_java_performance_RedundantFieldInitializer
    MyClass mca[] = null;
    MyClass mcb[];
}
