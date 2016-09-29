class Aufg4a{
	public static void main(String args[]){
		boolean b;
		b = true;
		byte by;
		by = 127;
		short s;
		s = 32767;
		int i;
		i = 2147483647;
		long l;
		l = 9223372036854775807L;
		float f;
		f = 3.4028235E38f;
		double d;
		d = 1.7976931348623157E308;
		char c = (char) i;
		
		System.out.println("boolean: " + b);
		System.out.println("byte: " + by);
		System.out.println("short: " + s);
		System.out.println("int: " + i);
		System.out.println("long: " + l);
		System.out.println("float: " + f);
		System.out.println("double: " + d);
		System.out.println("char: " + c);		
	}
}
