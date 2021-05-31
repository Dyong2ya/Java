package d_array;

import java.util.Arrays;

public class Quiz {

	public static void main(String[] args) {
//		// 거스름돈 동전 개수
//		int money = (int)(Math.random() * 500) * 10;
//		int[] coin = {500, 100, 50, 10};
//		
//		System.out.println("거스름돈 : " + money);
//		
//		for(int i = 0; i < coin.length; i++){
//			int count = money/coin[i];
//			money %= coin[i]; //위에서 빼진 나머지로 계산 
//			System.out.println(coin[i] + "원 " + count + "개");
//		}
//		
//		/*
//		 * 거스름돈에 동전의 단위마다 몇 개의 동전이 필요한지 출력해주세요.
//		 * 
//		 * 거스름돈: 2860원
//		 * 500원: 5개
//		 * 100원: 3개
//		 * 50원: 1개
//		 * 10원: 1개
//		 */

		
		//그래프그리기 -(1~500이랑 비슷)
//		int[] arr = new int[20];
//		for(int i = 0; i < arr.length; i++){
//			arr[i] = (int)(Math.random() * 5) + 1;
//		}
//		System.out.println(Arrays.toString(arr));
//		/*
//		 * 1~5사이의 숫자가 발생된 만큼 *을 사용해 그래프를 그려주세요
//		 * 
//		 * 1 : *** 3
//		 * 2 : **** 4
//		 * 3 : ** 2
//		 * 4 : ***** 5
//		 * 5 : ****** 6 
//		 */
//		
//		int[] count = new int[5]; //숫자를 셀 배열
//		for(int i = 0; i < arr.length; i++){
//			count[arr[i] - 1]++; //랜덤값이 1이면 0번값을 증가시켜야되니까
//		}
//		for(int i = 0; i < count.length; i++){
//			System.out.print(i + 1 + " : ");
//			for(int j = 0; j < count[i]; j++){
//			System.out.print("*");
//			}
//			System.out.println(" " + count[i]);
//		}
		
		
		//중복된 값이 제거된 배열(랜덤학생뽑기랑 비슷)
		int[] arr = new int[10];
		for(int i = 0; i < arr.length; i++){ //반복문이 하나니까 표처럼 생각하지마
			arr[i] = (int)(Math.random() * 5) + 1;
		}
		System.out.println(Arrays.toString(arr));
		/*
		 * 1~5사이의 랜덤한 값이 10개 저장된 배열에서 중복된 값이 제거된 배열을 만들어 주세요
		 * [1, 3, 3, 1, 5, 3, 1, 5, 4, 4]
		 * [1, 3, 5, 4]
		 */
		
		int[] temp = new int[5];
		int count = 0;
		for(int i = 0; i < arr.length; i++){
			boolean flag = true;
			for(int j =0; j < temp.length; j++){
				if(arr[i] == temp[j]){ //배열을 돌면서 같은게 있으면 바꿔주는거야
					flag = false;
				}
			}
			if(flag){ //변수값이 그대로 왔으면 중복x
				temp[count++] = arr[i];
			}
		}
		int[] result = new int[count]; //count값이 몇 개가 생성될 지 모르니까 새로운 배열을 하나 만드는거야
		for(int i = 0; i < result.length; i++){
			result[i] = temp[i];
		}
		System.out.println(Arrays.toString(result));
	}	
}



