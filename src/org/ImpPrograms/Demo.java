package org.ImpPrograms;

public class Demo {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		1.20 -> "001.20%"    // 1.21
//		11.20-> "011.20%"
		double d1 = 1.20;
		double d2 = 11.20;
		double d3 = 1.21;

		System.out.println(formatStr(d1));
		System.out.println(formatStr(d2));
		System.out.println(formatStr(d3));
	}

	public static String formatStr(double d) {
		return String.format("%06.2f", d);
	}

//	The %06.2f in the format string specifies the format, where:
//	% - Indicates that it's a formatted string.
//	0 - Pads with zeros.
//	6 - Total width of the output, including digits, decimal point, and percentage sign.
//	.2 - Specifies two decimal places.
//	f - Indicates it's a floating-point number.
//	When you enter 1.20, the program will output "001.20%".

}
