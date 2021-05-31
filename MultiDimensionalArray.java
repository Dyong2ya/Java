package d_array;

import java.util.Arrays;

public class MultiDimensionalArray {

	public static void main(String[] args) {
		/*
		 * 다차원 배열
		 * - 배열 안에 배여리 저장되어 있는 형태이다.
		 */
		
		//2차원
		int[][] array2;
		
		//3차원
		int[][][] array3;
		
		int[][] arr = new int[2][3]; //선언과 초기화
		/*
		 * arr변수 = 주소(100번지)
		 * 
		 * 100번지
		 * {200번지, 300번지}
		 * 
		 * 200번지
		 * {0, 0, 0}
		 * 
		 * 300번지
		 * {0, 0, 0}
		 *  
		 *  총 6개의 값
		 */
		
		int arr2[][] = new int[][]{{1, 2, 3}, {4, 5, 6}};
		
		/* 
		 * arr2 = 100번지
		 * 
		 * 100번지
		 * {200번지, 300번지} //2차원배열의주소값
		 * 
		 * 200번지
		 * {1, 2, 3}
		 * 
		 * 300번지
		 * {4, 5, 6}
		 */
		int[] arr3[] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
		
		/* arr3 = 100번지
		 * 
		 * 100번지
		 * {200번지, 300번지, 400번지} //1차원에 주소가 3개 들어있다
		 * 
		 * 200번지
		 * {1, 2, 3}
		 * 
		 * 300번지
		 * {4, 5, 6}
		 * 
		 * 400번지
		 * {7, 8, 9}
		 */
		
		int[][] arr4 = new int[3][]; //1차원의 길이는 정해져 있지만 2차원은 내가 따로 빼서 만들어 쓰는 가변 배열
		/*	
		 * arr4 = 100번지
		 * 
		 * 100번지
		 * {null, null, null}
		 */
		
		arr4[0] = new int[3];
		arr4[1] = new int[4];
		arr4[2] = new int[10];
	
		/*	
		 * 200번지
		 * {0, 0, 0}
		 * 
		 * 300번지
		 * {0, 0, 0, 0}
		 * 
		 * 400번지
		 * {0, 0, 0, 0, 0, 0, 0, 0, 0, 0}
		 */
		
		System.out.println(arr[0][1]);
		
//		arr[0] = 20; //값을 저장할 수 없다.
		//지금까지 length는 1차원 배열길이만 따졌는데 2차원 배열 길이 사용하는 방법
		//arr.length 1차원 배열의 길이 - 2개생기지
		//arr[0].length || arr[1].length 2차원배열의 길이 -1차원 밑으로3개씩
		arr[0] = new int[5]; //-얘 혼자 5개 만들어 주는거야
		arr[0][0] = 10;
		arr[0][1] = 20;
		arr[1][0] = 100;
		
		System.out.println(arr.length); //1차원 배열의 길이
		System.out.println(arr[0].length); //2차원 배열의 길이
		
		for(int i = 0; i < arr.length; i++){
			for(int j = 0; j < arr[i].length; j++){
				System.out.println(arr[i][j]);
			}
		}
		/*
		 * { {10, 20, 0, 0, 0},    //앞에 있는 중괄호가 1차원 뒤가 2차원
		 * 	 {100, 0, 0} }         //0번 인덱스자리{},   1번 인덱스자리{}
		 */
		
		int[][] scores = new int[3][5]; //int[학생수][과목수]
		int[] sum = new int[scores.length]; //합계
		double[] avg = new double[scores.length]; //평균
		for(int i = 0; i < scores.length; i++){
			for(int j = 0; j < scores[i].length; j++){
				scores[i][j] = (int)(Math.random() * 101);
			}
			System.out.println(Arrays.toString(scores[i]));
		}
		
		//각 학생의 합계와 평균을 출력해주세요.
		for(int i = 0; i < scores.length; i++){  //1차원
			for(int j = 0; j< scores[i].length; j++){  //2차원
				sum[i] += scores[i][j]; // 한 명의 합계
			} //for문이 끝나야 합계가 다 구해지니까 그 밑은 평균
			avg[i] = (double)sum[i] / scores[i].length;
			System.out.println("합계 : " + sum[i] + " / 평균 : " + avg[i]);
		}
	}

}
