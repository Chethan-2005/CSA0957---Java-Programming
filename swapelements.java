import java.util.Scanner;
class swap{
	public static void main(String[] args){
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter number of elements in an array :");
		int n=sc.nextInt();
		int[] arr=new int[n];
		System.out.println("Enter Elements in an array");
		for(int i=0;i<n;i++){
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++){
			System.out.print(arr[i]+" ");
		}
		if(n>1){
			int temp=arr[0];
			arr[0]=arr[n-1];
			arr[n-1]=temp;
		}
		System.out.println(" ");
		System.out.println("After swapping :");
		for(int i=0;i<n;i++){
			System.out.print(arr[i]+" ");
		}
	}
}