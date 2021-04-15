import java.util.Random; //램덤함수를 사용하기 위한 import
import  java.util.Scanner; //스캐너를 사용하기위한 import
public class Number {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);  //스캐너 객체 생성
		Random rn = new Random(); //랜덤 함수 객체 생성
		int RandomData,clear=0; //랜덤 값을 받을 변수와 입력값을 비교할 변수 생성
		
		System.out.print("10개의 랜덤 숫자 중 하나를 맞춰보세요(1~50까지): ");
		int input=sc.nextInt(); //위에서 만든 스캐너 객체를 사용하여 입력값을 받아옴
		
		for (int i=0;i<10;i++) //i가 0부터 9까지 10번 반복함
		{
			RandomData=rn.nextInt(51);  //랜덤객체를 불러와서 0부터 50까지 정수를 랜덤하게 뽑아줌
			System.out.print(RandomData+" ");
			if (RandomData==input) //입력값과 랜덤값을 비교
			{
				clear=1;  //비교값과 랜덤값이 같으면 clear에 1을 넣어준다.
			}
		}
		if (clear==1)  //clear가 1일경우 랜덤값에 비교값이랑 일치하는 수가 있다는 것을 알게되어 당첨 출력
		{
			System.out.print("\n당첨! 일치하는 숫자가 있습니다.");
		}
		else //아닐경우 
		{
			System.out.println("\n꽝! 다음 기회에~");
		}
	}
}
