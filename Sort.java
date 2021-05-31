package d_array;

import java.util.Arrays;

public class Sort {

	public static void main(String[] args) {
		/*
		 * 석차구하기
		 * - 점수를 비교하여 작은 점수의 등수를 등가시키는 방식
		 * 
		 * 정렬
		 * -선택정렬: 가장 작은 숫자를 찾아서 앞으로 보내는 방식
		 * -버블정렬: 바로 뒤의 숫자와 비교해서 큰 수를 뒤로 보내는 방식
		 * -삽입정렬: 두 번 째 숫자부터 앞의 숫자들과 비교해서 큰 수는 뒤로 밀고 중간에 삽입하는 방식
		 */
		
		
		int[] arr = new int[10];
		for(int i = 0; i < arr.length; i++){
			arr[i] = (int)(Math.random() * 100) + 1;
		}
		System.out.println(Arrays.toString(arr));
		
		Arrays.sort(arr); //오름차순으로 알아서 정리해줘
		System.out.println(Arrays.toString(arr));
		
		
		
		//삽입정렬-2번째 숫자부터 시작해서
		/*
		 * 1,0
		 * 2,1  2,0
		 * 3,2  3,1  3,0
		 * 4,3  4,2  4,1  4,0
		 * 5,4  5,3  5,2  5,1  5,0
		 * 6,5  6,4  6,3  6,2  6,1  6,0
		 * 7,6  7,5  7,4  7,3  7,2  7,1  7,0
		 * 8,7  8,6  8,5  8,4  8,3  8,2  8,1  8,0
		 * 9,8  9,7  9,6  9,5  9,4  9,3  9,2  9,1  9,0
		 */
//		for(int i = 1; i < arr.length; i++){//바깥 for문1-9
//			int temp = arr[i];
//			int j = 0;
//			for(j = i - 1; j >= 0; j--){
//				if(temp < arr[j]){ //더 큰값을 만나면 뒤로 보내야지
//					arr[j + 1] = arr[j];//한 칸 뒤로 보내는 공식
//				}else{
//					break;
//				}
//			}
//			arr[j + 1] = temp; //포문이 끝난 시점에서 j+1이 빈칸이야 //빈칸을 채우는 경우 작은 값을 만났을 경우 if는 큰 값 else는작은 값 //위에서 끝나서 j가 없어 그럼 포문 밖에서 선언해줘
//		}
		
		
		
		//버블정렬
		/*
		 * 0,1  1,2  2,3  3,4  4,5  5,6  7,8  8,9
		 * 0,1  1,2  2,3  3,4  4,5  5,6  7,8  
		 * 0,1  1,2  2,3  3,4  4,5  5,6  
		 * 0,1  1,2  2,3  3,4  4,5  
		 * 0,1  1,2  2,3  3,4  
		 * 0,1  1,2  2,3 
		 * 0,1  1,2  
		 * 0,1  
		 */										 //9번 돌아→↓
//		for(int i = 0; i < arr.length - 1; i++){ //밑으로 9줄이니까 -1
//			boolean flag = true;
//			for(int j = 0; j < arr.length - i - 1; j++){ //범위는 i가 증가할 수록 감소하기 때문에 range가 점점 감소, 늘어나는 숫자를 빼야 줄어들어 8까지만 도니까
//				if(arr[j] > arr[j + 1]){
//					int temp = arr[j];
//					arr[j] = arr[j + 1];
//					arr[j + 1] = temp; 
//					flag = false; //버블정렬은 중간에 한 바퀴 도는 동안 자리를 한 번도 안 바꾸면 그냥 끝내도 돼
//				}
//			}
//		if(flag){
//			break; //true가 그냥 넘어왔을 때 한 번도 들어오지 않은 경우
//			}
//		}
//		System.out.println(Arrays.toString(arr));
		
		
		//선택정렬
		//최솟값보다 최솟값이 들어있는 위치를 찾는 것이 중요
//		int[] arr = new int[10];
//		for(int i = 0; i < arr.length - 1; i++){ //-1은 최솟값을 찾다가 맨 마지막 숫자는 그 바로 앞 숫자랑 비교하면 끝나니까 굳이 안 돌아도 돼
//			int min = i; //0번 인덱스를 변수에 저장
//			for(int j = i + 1 ; j < arr.length; j++){ //+1 시작하는 값이 증가하니까. 0번째 비교하면 0번째 제외하고 비교하고... 
//				if(arr[j] < arr[min]){
//					min = j;
//				}
//			}
//			int temp = arr[i];
//			arr[i] = arr[min];
//			arr[min] = temp;
//		}
//		System.out.println(Arrays.toString(arr));
		
		
		
		//석차구하기
				
//			int[] arr = new int[10];
//			for(int i = 0; i < arr.length; i++){
//				arr[i] = (int)(Math.random() * 100) + 1;
//			}
//			System.out.println(Arrays.toString(arr));
//			
//		int[] rank = new int[arr.length];
//		for(int i = 0; i < rank.length; i++){
//			rank[i] = 1; //1등으로 시작하지만 다른 값들과 비교해서 더 높은 점수를 ++해주려고 이거 생긴 게 [1,1,1,1,1,1,...]이렇게 생겼어
//		}
//		
//		for(int i = 0; i < arr.length; i++){
//			for(int j = 0; j < arr.length; j++){ //i를 기준으로 j비교
//				if(arr[i] < arr[j]){ //if문이니까 위에 i랑 j값은 걍 예상한거야 신경ㄴㄴ
//					rank[i]++;
//				}
//			}
//		}
//		System.out.println("등수 : " + Arrays.toString(rank));
	
		
		
	
	
	}
}
	




