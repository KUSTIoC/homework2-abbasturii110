import java.util.Scanner;

public class RectangleTest
{
public static void main( String args[] )
{
Scanner input = new Scanner( System.in );

Rectangle rectangle = new Rectangle();

int choice = getMenuChoice();

while ( choice != 3 )
{
switch ( choice )
{
case 1:
System.out.print( "Enter length: " );
rectangle.setLength( input.nextDouble() );
break;

case 2:
System.out.print ( "Enter width: " );
rectangle.setWidth( input.nextDouble() );
break;
} 

System.out.println ( rectangle.toString() );

choice = getMenuChoice();

 

} 
} 


private static int getMenuChoice()
{
Scanner input = new Scanner( System.in );

System.out.println( "1. Set Length" );
System.out.println( "2. Set Width" );
System.out.println( "3. Exit" );
System.out.print( "Choice: " );

return input.nextInt();
}
}