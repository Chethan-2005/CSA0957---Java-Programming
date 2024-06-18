import java.util.Scanner;
public class twoelements {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number of elements you want:");
    int n = sc.nextInt();
    int a[] = new int[n];
    System.out.println("Enter all the numbers:");
    for (int i = 0; i < n; i++) {
      a[i] = sc.nextInt();
    }
    int min1 = 0;
    int min2 = 1;
    int minimum = a[0] + a[1];
    for (int i = 0; i < n - 1; i++) {
      for (int j = i + 1; j < n; j++) {
        int sum = a[i] + a[j];
        if (Math.abs(minimum) > Math.abs(sum)) {
          minimum = sum;
          min1 = i;
          min2 = j;
        }
      }
    }
    System.out.println("Element 1:" + a[min1]);
    System.out.println("Element 2:" + a[min2]);
    int sum = 0;
    sum = a[min1] + a[min2];
    System.out.println("The Sum Of Two Elements is:" + sum);
  }
}