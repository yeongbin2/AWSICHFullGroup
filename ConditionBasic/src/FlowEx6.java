import java.util.Scanner;

public class FlowEx6 {

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
//		
//		������ ����� Ű���� �Է��� �޴´�
		
//		�����
//		����� ������ ??�̰� ����� ??�Դϴ�
		
		Scanner scan = new Scanner(System.in);
		System.out.println("������ �Է��ϼ���");
		
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

		System.out.println("����� ������ " + score +
				" ����� " + gradeStr + "�Դϴ�." );
		
		
	}
}
	
