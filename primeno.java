import java.util.Scanner;
public class primeno {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number of prime numbers you want:");
    int n = sc.nextInt();
    int count = 0;
    int num = 2;
    while (count < n) {
      int i = 2;
      while (i * i <= num) {
        if (num % i == 0) {
          num++;
          i = 2;
        } else {
          i++;
        }
      }
      System.out.print(num + " ");
      count++;
      num++;
    }
  }
}