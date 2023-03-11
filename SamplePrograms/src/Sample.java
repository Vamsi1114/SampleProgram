import java.util.Scanner;

public class Sample {

	public static void main(String[] args) {
		int x,y;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the first number :");
		x = sc.nextInt();
		System.out.print("Enter the second number :");
		y = sc.nextInt();
		if(x%y==0)
			System.out.print(x+" "+"is divisible by"+" "+y);
		else
			System.out.print(x+" "+"is not divisible by"+" "+y);
	}

}
