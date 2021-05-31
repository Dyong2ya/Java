package b_operator;

public class ArithmeticOperator {

	public static void main(String[] args) {
		/*
		 * 산술 연산자
		 * -사칙연산: +, -, *, /, %(나머지)
		 * -복합 연산자: +=, -=, *=, /=, %=
		 * -증감 연산자: ++, --
		 */
		
		int result = 10 + 20 - 30 * 40 / 50 % 60;
		
		//나머지 연산
		result = 10 / 3; //3.3333...
		System.out.println(result);
		result = 10 % 3;
		System.out.println(result);
		
		//Q. 5개의 산술연산자를 사용해 5개의 연산을 수행 후 출력하시오.
//		int x = 5;
//	    int y = 7;
//		System.out.println(x * y);
//		
		result = 3 + 5;
		System.out.println(result);
		result = 100000 - 7;
		System.out.println(result);
		result = 5 * 5;
		System.out.println(result);
		result = 7 / 4;
		System.out.println(result);
		result = 9 % 3;
		System.out.println(result);
		
		//복합연산자
		//변수에 저장되어 있는 값에 연산을 수행할 때 수행할 연산자와 대입연산자를 결합해 사용할 수 있다.
		result = result + 3;
		System.out.println(result);
		
		result += 3;
		System.out.println(result);
		
		result -= 5;
		System.out.println(result);
		
		result *= 2;
		System.out.println(result);
		
		//아래의 문장을 복합연산자를 사용한 문장으로 만들어 주시오.
		result += 10;
		
		//result = result % 5;
		result %= 5;
		
		//result = result - 2 * 3;
		result -= 2 * 3;
		
		//증감연산자
		//증가연산자(++) : 변수의 값을 1 증가시킨다.
		//감소연산자(--) : 변수의 값을 1 감소시킨다.
		int i = 0;
		
		++i; //전위형: 변수의 값을 읽어오기 전에 1 증가된다.
		i++; //후위형: 변수의 값을 읽어온 후에 1 증가된다.
		--i;
		i--;
		
		i = 0;
		System.out.println("++i = " + ++i);
		i = 0;
		System.out.println("i++ = " + i++);
		System.out.println(i);
		
		
		//피연산자의 타입이 서로 같아야만 연산이 가능하다.
		int _int = 10;
		double _double = 3.14;
		double result2 = _int + _double; //표현범위가 더 큰 타입으로 형변환된다.
		System.out.println(result2);
		
		byte _byte = 5;
		short _short = 10;
		_int = _byte + _short; //int보다 작은 타입은 int로 형변환된다.
		System.out.println(_int);
		
		char _char = 'a';
		char _char2 = 'b';
		_int = _char + _char2;
		System.out.println(_int);
		
		//오버플로우, 언더플로우
		//표현범위를 벗어나는 값을 표현할 때 발생하는 현상
		byte b = 127;
		b++;
		System.out.println(b);
		b--;
		System.out.println(b);
		
		//Q. 다음을 한줄씩 계산해서 최종 결과값을 출력하시오.
		//1. 123456 + 654321
		long a = 123456;
		long c = 654321;
		long res = (a + c);
		System.out.println(res);
		//2. 1번의 결과값 * 123456
		res *= a;
		System.out.println(res);
		//3. 2번의 결과값 / 123456
		res /= a;
		System.out.println(res);
		//4. 3번의 결과값 - 654321
		res -= c;
		System.out.println(res);
		//5. 4번의 결과값 % 123456
		res %= a;
		System.out.println(res);
		
		//3개의 int타입 변수를 선언 및 초기화 후 합계와 평균을 구해주세요.
		int gs = 14;
		int cu = 27;
		int ele = 39;
		
		int sum = gs + cu + ele;
		double avg = sum / 3.0;
		System.out.println("합계: " + sum);
		System.out.println("평균: " + avg);
		
		//반올림
		avg = Math.round(avg); //소수점 '첫째자리'에서 반올림해준다.
		System.out.println(avg);
		avg = Math.round(avg * 10) / 10.0; //소수점 '둘째자리'에서 반올림해준다. '셋째자리'는 *100 /100.0
		
		//랜덤
		//Math.random() : 0.0 ~ 1.0미만(0.99999..)
		int random = (int)(Math.random() * 100) + 1;
		System.out.println(random);
		
		
 		
		
		
		
		
		
		
		
	}

}
