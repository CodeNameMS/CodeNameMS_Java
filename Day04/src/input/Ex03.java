package input;
import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		boolean bo;
		byte by;
		short sh;
		int it;
		long lo;
		float fl;
		double db;
		String str;
		
		System.out.print("boolean값 : ");
		bo = scan.nextBoolean();		// next자료형();
		
		// boolean
		System.out.println("bo = " + bo);
		
		// byte
		System.out.print("byte 값 : ");
		by = scan.nextByte();
		System.out.println("by = " + by);
		
		// short
		System.out.print("short 값 : ");
		sh = scan.nextShort();
		System.out.println("short = " + sh);
		
		// int
		System.out.print("int 값 : ");
		it = scan.nextInt();
		System.out.println("it = " + it);	
		
		// long
		System.out.print("long 값 : ");
		lo = scan.nextLong();
		System.out.println("long = " + lo);
		
		// float
		System.out.print("float 값 : ");
		fl = scan.nextFloat();
		System.out.println("fl = " + fl);
		
		// double
		System.out.print("double 값 : ");
		db = scan.nextDouble();
		System.out.println("db = " + db);
		
		// String
		System.out.print("String 값 : ");
		str = scan.next();
		System.out.println("str = " + str);
		
		scan.close();
	}
}



















