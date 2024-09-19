//#Patterns: category_java_errorprone_SimpleDateFormatNeedsLocale
public class Foo {

	private SimpleDateFormat sdf = new SimpleDateFormat("pattern", Locale.ITALY);

    //#Warn: category_java_errorprone_SimpleDateFormatNeedsLocale
	private SimpleDateFormat sdf2 = new SimpleDateFormat("pattern");
	
}

