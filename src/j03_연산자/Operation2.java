package j03_연산자;

/*
 * 논리 연산자(boolean)
 * boolean 자료형에서 값에 대한 정의
 * 0이면 무조건 false
 * 0이 아니면 무조건 true
 * 
 * AND(&&)	곱	
 * 모든 조건이 참이여야지만 true의 결과를 가지고 온다. 
 * 즉, 하나라도 거짓이면 false이다
 * true && true		=>	true
 * true && false 	=>	false
 * false && false	=>	false
 * 
 * 
 * OR(||)	합
 * 하나라도 참이면 무조건 true의 결과를 가지고 온다.
 * 즉, 모든 조건이 거짓이어야지만 false이다.
 * true || true		=>	true
 * true || false	=>	true
 * falss || false	=>	false
 * 
 * NOT(!)	부정
 * 
 * !true	=>	false
 * !false	=>	true
 * 
 */

public class Operation2 {

	public static void main(String[] args) {
		int year = 1999;
		
		/*
		 * 윤년
		 * 해당 년도가 4의 배수이고 100의 배수가 아니거나 400의 배수인 경우에 윤년이다.
		 */
		
		System.out.println(year % 4 == 0 && year % 100 != 0 || year % 400 == 0);
	}

}
