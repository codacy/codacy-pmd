Avoid concatenating non-literals in a StringBuffer constructor or append() since intermediate buffers will need to be be created and destroyed by the JVM.

Ex:

// Avoid this, two buffers are actually being created here
StringBuffer sb = new StringBuffer("tmp = "+System.getProperty("java.io.tmpdir"));
    
    // do this instead
StringBuffer sb = new StringBuffer("tmp = ");
sb.append(System.getProperty("java.io.tmpdir"));

[SOURCE](https://pmd.github.io/pmd-5.3.3/pmd-java/rules/java/strings.html#InefficientStringBuffering)
