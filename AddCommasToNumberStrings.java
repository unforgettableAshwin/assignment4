package week3;

import acm.program.ConsoleProgram;

public class AddCommasToNumberStrings extends ConsoleProgram
{
	private static final long serialVersionUID = 1L;

	public void run()
	{
		while( true )
		{
			String digits = readLine( "Enter a numeric string: " );
			if( digits.length() == 0 )
				break;

			println( addCommasToNumericString( digits ) );
		}
	}

	private String addCommasToNumericString( String digits )
	{
		String formatted = digits;
		int len = digits.length();
		if( len > 3 )
		{
			StringBuilder withCommas = new StringBuilder();
			StringBuilder reversed = new StringBuilder( digits ).reverse();
			for( int x = 0; x < reversed.length(); x++ )
			{
				withCommas.append( reversed.charAt( x ) );
				if( ( x + 1 ) % 3 == 0 && x < len - 1 )
					withCommas.append( ',' );
			}

			formatted = withCommas.reverse().toString();
		}

		return formatted;
	}
}
