import java.util.Scanner;

public class FlowEx6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		if-else문 if문
//		
//		if(조건식1) {
//			조건식1의 연산결과가 true일때 수행될 문장들
//		}else if(조건식2){
//			조건식2의 연산결과가 true일때 수행될 문장들
//		}else if(조건식3){ 
//			조건식3의 연산결과가 true일때 수행될 문장들
//		}else {
//			위의 어느 조건식도 만족하지 않을 때 수행될 문장들
//
//		}
//		학점을 등급으로 표현하는 프로그램
//		100점이하 90점이상이면 A
//		90점미만 80이상이면 B
//		80점 70이상이면 C
//		70미만 60이상이면 D
//		나머지는 F
//		
//		점수는 사용자 키보드 입려글 받는다
		
//		출력은
//		당신의 점수는 ??이고 등급은 ??입니다
		
		Scanner scan = new Scanner(System.in);
		System.out.println("점수를 입력하세요");
		
		int score = scan.nextInt();
		
		String gradeStr = "";
		
		if(score <= 100 && score >= 90) {	// = score >= 90) 90~
			gradeStr = "A";
		}else if(score < 90 && score >= 80) {	// = score >= 80) 80~
			gradeStr = "B";
		}else if(score < 80 && score >= 70) {	// = score >= 70) 70~
			gradeStr = "C";
		}else if(score < 70 && score >= 60) {	// = score >= 60) 60~
			gradeStr = "D";
		}else {
			gradeStr = "F";
		}

		System.out.println("당신의 점수는 " + score +
				" 등급은 " + gradeStr + "입니다." );
		
		
	}
}
	
