import java.util.Scanner;
public class TestExam {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("500 ������ �ڿ����� �Է��ϼ���.");
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
		System.out.println("1~"+input+"���� 3�� ����̸鼭 Ȧ���� ���� ���� "+hap+"�Դϴ�.");
	}

}
