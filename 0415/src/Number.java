import java.util.Random;
import  java.util.Scanner;
public class Number {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random rn = new Random();
		int RandomData,clear=0;
		
		System.out.print("10���� ���� ���� �� �ϳ��� ���纸����(1~50����): ");
		int input=sc.nextInt();
		
		for (int i=0;i<10;i++)
		{
			RandomData=rn.nextInt(51);
			System.out.print(RandomData+" ");
			if (RandomData==input)
			{
				clear=1;
			}
		}
		if (clear==1)
		{
			System.out.print("\n��÷! ��ġ�ϴ� ���ڰ� �ֽ��ϴ�.");
		}
		else
		{
			System.out.println("\n��! ���� ��ȸ��~");
		}
	}
}