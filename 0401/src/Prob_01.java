import java.util.Scanner;
public class Prob_01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("����, ����, ���� ������ 3���� ���� �Է�>>");
		int math=sc.nextInt();
		int science=sc.nextInt();
		int english=sc.nextInt();
		Grade me = new Grade();
		System.out.println("����� "+me.average(math,science,english));
		}

}//asdasd
class Grade
{
	public int average(int math, int science, int english)
	{
		return (math+science+english)/3;
	}	
 }