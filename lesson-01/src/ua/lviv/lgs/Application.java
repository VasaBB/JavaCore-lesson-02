package ua.lviv.lgs;

import java.util.Arrays;
import java.util.Collections;

import javax.print.attribute.standard.NumberUp;

public class Application {
	
	public static void main(String[] args) {
		byte a = 3;
		short b = -30000;
		int c = 2000000;
		long d = 900000000;
		float e = -2.2f;
		double f = 6.4;
		char j = 'a';
		boolean g = true;
		boolean m = false;
		
		System.out.println("byte = " +a);
		System.out.println("short = " +b);
		System.out.println("int = " +c);
		System.out.println("long = " +d);
		System.out.println("float = " +e);
		System.out.println("double = " +f);
		System.out.println("char = " +j);
		System.out.println("boolean = " +g);
		System.out.println("boolean = " +m);
		
		
		Boolean g1 = g;
		Character j1 = j;
		Byte a1 = a;
		Short b1 = b;
		Integer c1 = c;
		Long d1 = d;
		Float e1 = e ;
		Double f1 = f;
		
		System.out.println("Boolean g1 = " + g );
		System.out.println("Character j1 = " + j);
		System.out.println("Byte max = " + Byte.MAX_VALUE);
		System.out.println("Byte min = " + Byte.MIN_VALUE);
		System.out.println("Shotr max = " + Short.MAX_VALUE);
		System.out.println("Shotr min = " + Short.MIN_VALUE);
		System.out.println("Integer max = " + Integer.MAX_VALUE);
		System.out.println("Integer min = " + Integer.MIN_VALUE);
		System.out.println("Lomg max = " + Long.MAX_VALUE);
		System.out.println("Lomg min = " + Long.MIN_VALUE);
		System.out.println("Float max = " + Float.MAX_VALUE);
		System.out.println("Float min = " + Float.MIN_VALUE);
		System.out.println("Double max = " + Double.MAX_VALUE);
		System.out.println("Double min = " + Double.MIN_VALUE);
		
		int [] array = {22, 44, 66, 200, -100, -269};
		int max = array[0];
		for (int i : array) {
			if (i > max)
				max = i;
		}
		
		System.out.println("Max number =" + max);
		
		int min = array[0];
		for (int i : array) {
			if (i < min)
				min = i;
		}
		
		System.out.println("Min number =" + min);




		
		
		
		
		
		
		
	}

}
