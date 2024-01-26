package Ex2_206217358_206696882;

/**
 * Hello world!
 *
 */
public class App 
{
	/**
	 * Section A - a function that converts grades into letters and words according to the table in question 1
	 * @param grade 
	 * @return A letter or word according to the grade received as a parameter
	 */
	public static String convertsNumberToCharacter(int grade)
	{
		if (grade >= 1 && grade <= 49) {
			return "F";
		}
		else if (grade >= 50 && grade <= 59) {
			return "E";
		}
		else if (grade >= 60 && grade <= 69) {
			return "D";
		}
		else if (grade >= 70 && grade <= 79) {
			return "C";
		}
		else if (grade >= 80 && grade <= 89) {
			return "B";
		}
		else if (grade >= 90 && grade <= 100) {
			return "A";
		}
		else {
			return "Error";
		}
	}
	
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }
}
