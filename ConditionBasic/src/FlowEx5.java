import java.util.Scanner;

public class FlowEx5 {

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
		
		int score = 0;
		String gradeStr = "";
		
		score = 90;
		
		if(score >= 90) {
			gradeStr = "A";
		}else if(score >= 80) {
			gradeStr = "B";
		}else {
			gradeStr = "F";
		}

		System.out.println("당신의 학점은 " + gradeStr + "입니다." );
		
		
	}
}
	
