//#Patterns: java_basic_CheckSkipResult
public class Foo {

    private java.io.FileInputStream _s;

    public void skip(int n) throws IOException {
        _s = new FileInputStream("file");
        //#Warn: java_basic_CheckSkipResult
        _s.skip(n); // You are not sure that exactly n bytes are skipped
    }

    public void skipExactly(int n) throws IOException {
        while (n != 0) {
            long skipped = _s.skip(n);
            if (skipped == 0)
                throw new EOFException();
            n -= skipped;
        }
    }
}