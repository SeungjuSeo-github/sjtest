
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class LottoArray {
	
//	숫자 1~45까지 숫자중에서 6개의 숫자를 추출	
	public static void main(String[] args) {
//		int[] arr=new int[6];
		Integer[] arr=new Integer[6]; //역정렬할거면 int대신 Integer사용
		
		Random r=new Random();
		
		for (int i = 0; i < arr.length; i++) {
//			저배열에 6개의 숫자를 담으세요
			int rNum=r.nextInt(45)+1;
			arr[i]=rNum;
			System.out.println("arr : "+i+">>"+arr[i]);
			 
//			중복검사
//			배열에서 값의 위치값을 알아보기
			for (int j = 0; j < i; j++) { 
				//현재위치에서 그 전 단계까지 배열에 입력된 값과 비교
				if (arr[j]==rNum) {
					i--;
					break;
				}
			}	
		}
		System.out.println("정렬전 : "+Arrays.toString(arr));//정렬전
//		정렬명령 sort
		Arrays.sort(arr);
		System.out.println("정렬후 오름차순 : "+Arrays.toString(arr));//정렬후
//		역정렬
		Arrays.sort(arr,Collections.reverseOrder());
		System.out.println("정렬후 내림차순 : "+Arrays.toString(arr));//정렬후
	}

}



