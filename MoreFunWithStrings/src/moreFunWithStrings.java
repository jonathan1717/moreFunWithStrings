import java.util.Scanner;

public class moreFunWithStrings 
{
	
	public static void main( String[] args ) 
{
//		exercise1(  );
//		exercise2(  );
	}
	
	public static void exercise1(  )
		{
		Scanner userInput = new Scanner( System.in );
		System.out.println( "What is your name?" );
		String name = userInput.nextLine(  );
		System.out.println( "Hello, " + name + "!" );
		
		Scanner userInput1 = new Scanner( System.in );
		System.out.println( "Please say something and I will give you facts about that sentence." );
		String text = userInput1.nextLine(  );
		text=text.toLowerCase(  );
		int characterCounter= text.length(  );
		String textWithOutSpaces = text.replace( " ","" );
		int letterCounter= textWithOutSpaces.length(  );
		int consonantCounter=0;
		
		for ( int i=0; i <textWithOutSpaces.length(  ); i++ )
		{
			switch ( textWithOutSpaces.substring ( i,i+1 ) )
			{
				case "b":
				case "c":
				case "d":
				case "f":
				case "g":
				case "h":
				case "j":
				case "k":
				case "l":
				case "m":
				case "n":
				case "p":
				case "q":
				case "r":
				case "s":
				case "t":
				case "v":
				case "w":
				case "x":
				case "y":
				case "z":
				{
					consonantCounter++;
				}
				
			}
			
		}
		
		int vowelCounter= letterCounter-consonantCounter;			
		System.out.println( "There are " + consonantCounter + " consonants." );
		System.out.println( "There are " + vowelCounter + " vowels" );
		System.out.println( "There are " + letterCounter + " letters." );
		System.out.println( "There are " + characterCounter + " characters" );
		
}
		
	public static void exercise2(  )
	{
		System.out.println( "Enter text" );
		Scanner userInput = new Scanner( System.in );
		String text = userInput.nextLine(  );
		int counter = 0;
		for ( int i=0; i <text.length(  ); i++ )
		
		{  
			counter++;
			System.out.println( text.substring( 0,counter ) );
		}
		
		
		
		
	}
	
}