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
		
		System.out.print("boolean�� : ");
		bo = scan.nextBoolean();		// next�ڷ���();
		
		// boolean
		System.out.println("bo = " + bo);
		
		// byte
		System.out.print("byte �� : ");
		by = scan.nextByte();
		System.out.println("by = " + by);
		
		// short
		System.out.print("short �� : ");
		sh = scan.nextShort();
		System.out.println("short = " + sh);
		
		// int
		System.out.print("int �� : ");
		it = scan.nextInt();
		System.out.println("it = " + it);	
		
		// long
		System.out.print("long �� : ");
		lo = scan.nextLong();
		System.out.println("long = " + lo);
		
		// float
		System.out.print("float �� : ");
		fl = scan.nextFloat();
		System.out.println("fl = " + fl);
		
		// double
		System.out.print("double �� : ");
		db = scan.nextDouble();
		System.out.println("db = " + db);
		
		// String
		System.out.print("String �� : ");
		str = scan.next();
		System.out.println("str = " + str);
		
		scan.close();
	}
}



















