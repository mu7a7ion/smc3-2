import java.util.Scanner;
public class TestExam {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("500 이하의 자연수를 입력하세요.");
		int input = sc.nextInt();
		int hap=0;
		for (int i=1;i<input;i++)
		{
			if (i%3==0&&i%2!=0)
			{
				System.out.println(i);
				hap+=i;
			}
		}
		System.out.println("1~"+input+"까지 3의 배수이면서 홀수인 수의 합은 "+hap+"입니다.");
	}

}
