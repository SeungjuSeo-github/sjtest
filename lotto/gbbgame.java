import java.util.*;

public class GBBGame {

	public static void main(String[] args) {

		
//		int user=0; 
		Scanner scan=new Scanner(System.in);
		System.out.println("가위바위보 게임 시작");
		System.out.println("가위(1), 바위(2), 보(3) 입력 :");
		int user = scan.nextInt();
		
		int com = (int)(Math.random()*3)+1;
		System.out.println(com);
		
		if (user == 1) {
			if (com == 2) {
				System.out.println("유저:가위, 컴퓨터:바위, 컴퓨터 승");
			} else if (com == 3) {
				System.out.println("유저:가위, 컴퓨터:보, 유저 승");
			} else {
				System.out.println("유저:가위, 컴퓨터:가위, 무승부");
			}
		} else if (user == 2) {
			if (com == 1) {
				System.out.println("유저:바위, 컴퓨터:가위, 유저 승");
			} else if (com == 3) {
				System.out.println("유저:바위, 컴퓨터:보, 컴퓨터 승");
			} else {
				System.out.println("유저:바위, 컴퓨터:바위, 무승부");
			}
		} else if (user == 3) {
			if (com == 1) {
				System.out.println("유저:보, 컴퓨터:가위, 컴퓨터 승");
			} else if (com == 2) {
				System.out.println("유저:보, 컴퓨터:바위, 유저 승");
			} else {
				System.out.println("유저:보, 컴퓨터:보, 무승부");
			}
		} else {
			System.out.println("잘못기입");
		}
		
		
	}
	
}
		
