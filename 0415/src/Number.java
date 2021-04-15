import java.util.Random;
import  java.util.Scanner;
public class Number {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random rn = new Random();
		int RandomData,clear=0;
		
		System.out.print("10개의 랜덤 숫자 중 하나를 맞춰보세요(1~50까지): ");
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
			System.out.print("\n당첨! 일치하는 숫자가 있습니다.");
		}
		else
		{
			System.out.println("\n꽝! 다음 기회에~");
		}
	}
}