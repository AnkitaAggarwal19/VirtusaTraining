//automatic or widening type conversion
/*class TypeCast{
	public static void main(String[] args){
		int a = 10;
		long b = a;
		System.out.println("a = " + a);
		System.out.println("b = " + b);
	}
}*/

//explicit or narrowing type conversion
/*class TypeCast{
	public static void main(String[] args){
		double a = 3.64;
		int b = (int)a;
		System.out.println("a = " + a);
		System.out.println("b = " + b);
	}
}*/

class TypeCast{
	public static void main(String[] args){
		String a = "1234";
		int b = 0;
		String num = "";
		for(int i = 0; i < a.length(); i++)
		{
			b = b + Integer.parseInt(a.charAt(i) + "");
		}
		System.out.println("a = " + a);
		System.out.println("b = " + b);
	}
}
