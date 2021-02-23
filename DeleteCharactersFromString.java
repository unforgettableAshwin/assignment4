package week3;

import acm.program.ConsoleProgram;

public class DeleteCharactersFromString extends ConsoleProgram
{
	private static final long serialVersionUID = 1L;

	public void run()
	{
		println( removeAllOccurrences( "sunglasses", 's' ) );
		println( removeAllOccurrences( "This is a test", 't' ) );
		println( removeAllOccurrences( "Summer is here!", 'e' ) );
		println( removeAllOccurrences( "---0---", '-' ) );
	}

	public String removeAllOccurrences( String str, char ch )
	{
		int i;
		StringBuilder sb = new StringBuilder( str );
		while( ( i = sb.indexOf( String.valueOf( ch ) ) ) != -1 )
			sb.deleteCharAt( i );

		return sb.toString();
	}
}
