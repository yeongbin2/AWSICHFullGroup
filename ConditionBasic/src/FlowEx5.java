import java.util.Scanner;

public class FlowEx5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		if-else�� if��
//		
//		if(���ǽ�1) {
//			���ǽ�1�� �������� true�϶� ����� �����
//		}else if(���ǽ�2){
//			���ǽ�2�� �������� true�϶� ����� �����
//		}else if(���ǽ�3){
//			���ǽ�3�� �������� true�϶� ����� �����
//		}else {
//			���� ��� ���ǽĵ� �������� ���� �� ����� �����
//
//		}
//		������ ������� ǥ���ϴ� ���α׷�
//		100������ 90���̻��̸� A
//		90���̸� 80�̻��̸� B
//		80�� 70�̻��̸� C
//		70�̸� 60�̻��̸� D
//		�������� F
		
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

		System.out.println("����� ������ " + gradeStr + "�Դϴ�." );
		
		
	}
}
	
