import java.util.Scanner;
import java.util.Random;
public class Game {

	public static void game(int input,int random)
		{
			switch (input) {
			case 1: switch (random) { case 1: System.out.println("[나: 가위!] VS [컴퓨터: 가위!]"); System.out.println("무승부..."); break;
			case 2: System.out.println("[나: 가위!] VS [컴퓨터: 바위!]"); System.out.println("패배..."); break;
			case 3: System.out.println("[나: 가위!] VS [컴퓨터: 보!]"); System.out.println("승리!"); break;
			}break;
			case 2: switch (random) { case 1: System.out.println("[나: 바위!] VS [컴퓨터: 가위!]"); System.out.println("승리!"); break;
			case 2: System.out.println("[나: 바위!] VS [컴퓨터: 바위!]"); System.out.println("무승부..."); break;
			case 3: System.out.println("[나: 바위!] VS [컴퓨터: 보!]"); System.out.println("패배..."); break;
			}break;
			case 3: switch (random) { case 1: System.out.println("[나: 보!] VS [컴퓨터: 가위!]"); System.out.println("패배..."); break;
			case 2: System.out.println("[나: 보!] VS [컴퓨터: 바위!]"); System.out.println("승리!"); break;
			case 3: System.out.println("[나: 보!] VS [컴퓨터: 보!]"); System.out.println("무승부..."); break;
			}break;
			}
				
		}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random rn = new Random();
		System.out.println("[1: 가위 2:바위 3:보]");
		int input=sc.nextInt();
		int random=rn.nextInt(3)+1;
		game(input,random);
		
		
	}

}
