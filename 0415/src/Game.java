import java.util.Scanner;
import java.util.Random;
public class Game {

	public static void game(int input,int random)
		{
			switch (input) {
			case 1: switch (random) { case 1: System.out.println("[��: ����!] VS [��ǻ��: ����!]"); System.out.println("���º�..."); break;
			case 2: System.out.println("[��: ����!] VS [��ǻ��: ����!]"); System.out.println("�й�..."); break;
			case 3: System.out.println("[��: ����!] VS [��ǻ��: ��!]"); System.out.println("�¸�!"); break;
			}break;
			case 2: switch (random) { case 1: System.out.println("[��: ����!] VS [��ǻ��: ����!]"); System.out.println("�¸�!"); break;
			case 2: System.out.println("[��: ����!] VS [��ǻ��: ����!]"); System.out.println("���º�..."); break;
			case 3: System.out.println("[��: ����!] VS [��ǻ��: ��!]"); System.out.println("�й�..."); break;
			}break;
			case 3: switch (random) { case 1: System.out.println("[��: ��!] VS [��ǻ��: ����!]"); System.out.println("�й�..."); break;
			case 2: System.out.println("[��: ��!] VS [��ǻ��: ����!]"); System.out.println("�¸�!"); break;
			case 3: System.out.println("[��: ��!] VS [��ǻ��: ��!]"); System.out.println("���º�..."); break;
			}break;
			}
				
		}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random rn = new Random();
		System.out.println("[1: ���� 2:���� 3:��]");
		int input=sc.nextInt();
		int random=rn.nextInt(3)+1;
		game(input,random);
		
		
	}

}
