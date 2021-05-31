package d_array;

import java.util.Arrays;

public class Array {

	public static void main(String[] args) {
		/*
		 * 배열
		 * -여러개의 값을 하나의 변수에 저장해서 사용하는 것이다.
		 * -참조형 타입이다.
		 * -인덱스로 값을 구분한다.
		 * -길이를 변경할 수 없다.
		 * -1씩 증가해서 반복문이랑 같이 사용되는 경우가 많다.
		 */

		int[] array; //배열의 주소를 '저장할 공간'이 만들어진다.(선언) 아예 int[]라는 데이터타입이 있다고 생각하면 쉬워
		array = new int[5]; //배열이 생성되고 그 주소가 저장된다. -5개의 int를 저장할 수 있고 길이변경x 주소는 변수에 들어가게 된다.(초기화)
		
		/*
		 * 변수 = 주소(100번지)
		 * 
		 * 100번지
		 * {0, 0, 0, 0, 0} -첫번째 0만 100번지, 그 이후로 101,102,103..번지
		 */
		
		array = new int[]{1, 2, 3, 4, 5}; //기본값이 0이 아니라 1,2,3,4,5가 된다
		
//		array = {1, 2, 3, 4, 5};
		//선언과 초기화를 한 번에 해야한다 ↓
		int[] array2 = {1, 2, 3, 4, 5};
		
		System.out.println(array[0]); //배열을 출력할 때는 변수(array)만 쓰게 되면 주소가 나온다. 인덱스[0부터 시작됨(첫번째 값)]를 이용하여 출력
		System.out.println(array[1]);
		System.out.println(array[2]);
		System.out.println(array[3]);
		System.out.println(array[4]);
		
		array[0] = 10; //값저장
		array[1] = 20;
		array[2] = 30;
		array[3] = 40;
		array[4] = 50;
		
		System.out.println(array[0]);
		System.out.println(array[1]);
		System.out.println(array[2]);
		System.out.println(array[3]);
		System.out.println(array[4]);
		
		//for문
		for(int i = 0; i < array.length; i++){ //배열은 0부터 시작해서 초기화를 0으로 시작해서 length만큼 쓰면 인덱스길이만큼 간다
			System.out.println(array[i]);	
		}
		
		for(int i = 0; i < array.length; i++){
			array[i] = (i + 1) * 10;
		}
		
		//10개의 정수를 저장할 수 있는 배열을 선언 및 초기화 해주세요.
		int[] arr = new int[10];
		
		//배열의 모든 인덱스에 1~100 사이의 랜덤한 값을 저장해주세요.
		for(int i = 0; i < arr.length; i++){
			arr[i] = (int)(Math.random() * 100) + 1;
		}
		System.out.println(Arrays.toString(arr));
		//배열에 저장된 값을 문자열로 반환
		
		//배열에 저장된 모든 값의 합계와 평균을 출력해주세요.
		int sum = 0;//합계저장할 변수 
//		sum += arr[0];
//		sum += arr[1];
//		sum += arr[2];
		for(int i = 0; i < arr.length; i++){
			sum += arr[i];
		}
		double avg = (double)sum / arr.length;
		System.out.println("합계 : " + sum + " / 평균 : " + avg);
		
		//배열에 저장된 값들 중 최소값과 최대값을 출력해주세요 -하나의 수를 정하고 그 수랑 비교하면서 더 작은 수를, 더 큰 수를 찾으면 돼
		int min = arr[0];
		int max = arr[0]; //첫번째값을 기억
		
		for(int i = 0; i < arr.length; i++){
			if(min > arr[i]){
				min = arr[i]; //위에서 arr[i]가 더 작다고 나왔으니까 min을 거기에 넣어주면 된다
			}	
			if(max < arr[i]){
				max = arr[i];
			}
		}
		System.out.println("min : " + min + " / max : " + max);
		
		//배열의 값을 섞어주세요.
		int[] shuffle = new int[10];
		for(int i = 0; i < shuffle.length; i++){
			shuffle[i] = i + 1; //인덱스땜에 0부터 시작하면 안되잖아 / 만약에 이렇게 설정 안 해놓으면  [0,0,0,0,0,0,0,0...]이렇게 나와
		}
		System.out.println(Arrays.toString(shuffle));

		for(int i = 0; i < shuffle.length * 10; i++){ //*10은 랜덤값을 더 많이 섞어주려고. 굳이 없어도 ㄱㅊ
			int random = (int)(Math.random() * shuffle.length);
			int temp = shuffle[0];
			shuffle[0] = shuffle[random];
			shuffle[random] = temp;	//temp값은 빈 병이라 생각하면 돼
		}
		System.out.println(Arrays.toString(shuffle));
		
		//1~10 사이의 랜덤값을 500번 생성하고, 각 숫자가 생성된 횟수를 출력해주세요		
		int[] counts = new int[10];
		
		for(int i = 0; i < 500; i++){
			int random = (int)(Math.random() * 10) + 1; //10을 이렇게 바꿔도 돼 counts.length

			counts[random - 1]++;
//			if(random == 1){
//				counts[0]++;
//			}else if(random ==2){
//				counts[1]++;
//			}else if(random == 3){
//				counts[2]++;	
//			} //주석처리된 부분을 잘 생각해봐[1(0자리),2(1자리),3,4,5,6,7,8,9,10] - 이미 1~10의 자리는 배정되어 있어. 거기서 랜덤값이 그 자리에 맞게 되면 ++해주는 게 맞지
		 }
		System.out.println(Arrays.toString(counts));

	}
}

