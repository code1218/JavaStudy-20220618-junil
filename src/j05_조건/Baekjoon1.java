package j05_조건;

import java.util.Scanner;

public class Baekjoon1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int score = 0;
		
		System.out.print("성적을 입력하세요: ");
		score = scanner.nextInt();
		
		if(score < 0 || score > 100) {
			System.out.println("계산할 수 없는 점수입니다.(0 ~ 100만 입력가능)");
		}else if(score > 89) {
			System.out.println("A학점");
		}else if(score > 79) {
			System.out.println("B학점");
		}else if(score > 69) {
			System.out.println("C학점");
		}else if(score > 59) {
			System.out.println("D학점");
		}else {
			System.out.println("F학점");
		}
		
		/*
		 * score
		 * 
		 * 성적을 입력하세요: 
		 * 
		 * 조건
		 * 1. score가 0보다 작거나 score가 100보다 크면
		 * 출력: 계산할 수 없는 점수입니다.
		 * 2. 점수별로 A, B, C, D, F 학점을 출력
		 * 90 ~ 100 A
		 * 80 ~ 89	B
		 * 70 ~ 79	C
		 * 60 ~ 69	D
		 * 0  ~ 59	F
		 * 
		 */
		
		
	}

}
