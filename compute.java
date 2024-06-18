import java.util.Scanner;
public class compute{
	public static void main(String args[]){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the n:");
		int n = scanner.nextInt();
		int a = n + (n * n) + (n * n * n);
		System.out.println("The Computation Value of n+nn+nnn is :" +a);
	}
}