package interaction;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import character.PlayerCharacter;

public class CommandInterface {

	public static void main(String[] args) 
	throws IOException {
		
		PlayerCharacter character = new PlayerCharacter();
		
		System.out.println( "Enter Player Character Basic Info" );
		BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) );
		System.out.println( "Name?" );
		String name = br.readLine();
		System.out.println( "Age?" );
		String age = br.readLine();
		System.out.println( "Origin? Separate with commas" );
		
		// Need to split the city and the state.
		String fullOrigin = br.readLine();
		String[] origin = fullOrigin.split( "," );
		System.out.println( "Height?" );
		String height = br.readLine();
		System.out.println( "Weight?" );
		String weight = br.readLine();
		
		// Print results
		System.out.println( " Your character's information: " );
		System.out.println( name );
		System.out.println( age );
		
		// Print the string array, which can be of
		// a variable length
		for( int i = 0; i < origin.length; i++ ) {
			System.out.print( origin[i] );
		}
		System.out.println(); // Skip a line when finished
		
		System.out.println( height );
		System.out.println( weight );

	}

}
