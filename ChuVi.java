package oopJava;
import java.util.Scanner;
public class ChuVi {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("\n Nhap a: ");
		char a = sc.next().charAt(2);
		int c =(int)a;
		a = (char)(c+1);
		System.out.print("\n Chu cai sau chu a la: ");
		System.out.print(a);
	}

}
