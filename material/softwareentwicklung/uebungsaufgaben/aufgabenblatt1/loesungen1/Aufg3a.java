public class Aufg3a
{
	public static void main(String args[])
	{
	    System.out.println("" + 42);                //int

	    System.out.println("" + -17);               //int

	    System.out.println("" + (2+3));             //int

	    //System.out.println("" + (1.1*10^3));      **gemeint ist 1.1e3
		System.out.println("" + (1.1e3));			//double

	    System.out.println("" + (2.3));             //double

	    //System.out.println("" + (2,3));           **gemeint ist 2.3
	    System.out.println("" + (2.3));				//double

	    System.out.println("" + (20));              //int

	    //System.out.println("" + ('Hello'));       **gemeint ist "Hello"
		System.out.println("" + "Hello");			//String

	    System.out.println("" + ("a"));             //String

	    //System.out.println("" + (TRUE));          **gemeint ist true
		System.out.println("" + true);				//boolean

	    //System.out.println("" + (b));             **b ist Bezeichner
		int b=42;
		System.out.println("" + (b));				//int

	    System.out.println("" + (false));           //boolean

	    System.out.println("" + (3.141592));        //double

	    //System.out.println("" + (1.000.000));     **doppelter Dezimalpunkt
		System.out.println("" + (1000000));			//int

	    //System.out.println("" + (0,524));         **Komma statt Punkt
		System.out.println("" + (0.524));			//double

	    System.out.println("" + (214089067));       //int

	    System.out.println("" + (1.1e-10));         //double

	    System.out.println("" + (+13));             //int

	    System.out.println("" + (1d));              //double

	    System.out.println("" + (0x1d));            //int

	    System.out.println(.34);					// double
	}
}
