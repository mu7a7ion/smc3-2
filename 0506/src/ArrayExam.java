import java.util.Scanner;
public class ArrayExam {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[5];
		int max=0,count=0;
		
		for (int i=0;i<arr.length;i++){
			
			System.out.println((i+1)+"번째 입력:");
			arr[i]=sc.nextInt();
			if (max<arr[i])
			{
				max=arr[i];
				count=i+1;
			}
		}
		System.out.println("가장 큰 수는" +count+"번째 숫자인"+max);
		
	}

}
