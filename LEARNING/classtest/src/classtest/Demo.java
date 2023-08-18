package classtest;

public class Demo {

	 public static void main(String[] args) {
		 greet();
		 int a = 45;
		 int b = 29;
		 int x = 20;
		 int y = 20;
		 int m = 50;
		 int n = 10;
		 int res = add(x,y);
		 System.out.println(res);
		 int res1 = add(x,y)/2;
		 System.out.println("avg is"+res1);
		 boolean res2 = check(x,y);
		 System.out.println(res2);
		 int res3 = multi(a,b);
		 System.out.println(res3);
		 sub();
		 int res4 = div(m,n);
		 System.out.println(res4);
		 float res5 = div(m,n);
		 System.out.println(res5);

		 
	}
	 public static void greet() {
		 System.out.println("hello bro");
	 }
	 public static int add(int x, int y) {
		 return x+y;
	 }
	 public static void sub() {
		 int a =30;
		 int b =12;
		 System.out.println("sub result is "+(a-b));
	 }
	 public static int div(int m, int n ) {
		 return m/n;
	 }
	 public static float mod (int m, int n ) {
		 return m%n;
	 }
	 public static int multi(int a, int b) {
		 return a*b;
	 }
	 public static boolean check(int x,int y) {
		 return x>y;
	 }
}
//24-07-2023 //