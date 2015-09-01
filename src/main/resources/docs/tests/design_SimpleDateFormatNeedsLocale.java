//#Patterns: design_SimpleDateFormatNeedsLocale
public class Foo {

	private SimpleDateFormat sdf = new SimpleDateFormat("pattern", Locale.ITALY);

    //#Warn: design_SimpleDateFormatNeedsLocale
	private SimpleDateFormat sdf2 = new SimpleDateFormat("pattern");
	
}

