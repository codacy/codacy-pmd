//#Patterns: strings_AppendCharacterWithChar

public class Foo {
    public void bar() {

        StringBuffer sb = new StringBuffer();
        //#Warn: strings_AppendCharacterWithChar
        sb.append("a"); // avoid this

        //StringBuffer sb = new StringBuffer(); sb.append('a'); // use this instead
    }
}

