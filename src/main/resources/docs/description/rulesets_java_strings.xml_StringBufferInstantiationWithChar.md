Individual character values provided as initialization arguments will be converted into integers. This can lead to internal buffer sizes that are larger than expected. Some examples:

Ex:

// misleading instantiation, these buffers
// are actually sized to 99 characters long
StringBuffer  sb1 = new StringBuffer('c');   
StringBuilder sb2 = new StringBuilder('c');
  
// in these forms, just single characters are allocated
StringBuffer  sb3 = new StringBuffer("c");
StringBuilder sb4 = new StringBuilder("c");

    

[SOURCE](https://pmd.github.io/pmd-5.3.3/pmd-java/rules/java/strings.html#StringBufferInstantiationWithChar)
