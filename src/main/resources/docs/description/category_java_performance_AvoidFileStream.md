Since: PMD 6.0.0

The FileInputStream and FileOutputStream classes contains a finalizer method which will cause garbage
collection pauses.
See [JDK-8080225](https://bugs.openjdk.org/browse/JDK-8080225) for details.

The FileReader and FileWriter constructors instantiate FileInputStream and FileOutputStream,
again causing garbage collection issues while finalizer methods are called.

* Use `Files.newInputStream(Paths.get(fileName))` instead of `new FileInputStream(fileName)`.
* Use `Files.newOutputStream(Paths.get(fileName))` instead of `new FileOutputStream(fileName)`.
* Use `Files.newBufferedReader(Paths.get(fileName))` instead of `new FileReader(fileName)`.
* Use `Files.newBufferedWriter(Paths.get(fileName))` instead of `new FileWriter(fileName)`.

Please note, that the `java.nio` API does not throw a `FileNotFoundException` anymore, instead
it throws a `NoSuchFileException`. If your code dealt explicitly with a `FileNotFoundException`,
then this needs to be adjusted. Both exceptions are subclasses of `IOException`, so catching
that one covers both.

Example(s):
```
// these instantiations cause garbage collection pauses, even if properly closed

    FileInputStream fis = new FileInputStream(fileName);
    FileOutputStream fos = new FileOutputStream(fileName);
    FileReader fr = new FileReader(fileName);
    FileWriter fw = new FileWriter(fileName);

    // the following instantiations help prevent Garbage Collection pauses, no finalization

    try(InputStream is = Files.newInputStream(Paths.get(fileName))) {
    }
    try(OutputStream os = Files.newOutputStream(Paths.get(fileName))) {
    }
    try(BufferedReader br = Files.newBufferedReader(Paths.get(fileName), StandardCharsets.UTF_8)) {
    }
    try(BufferedWriter wr = Files.newBufferedWriter(Paths.get(fileName), StandardCharsets.UTF_8)) {
    }
```
