import java.util.Scanner;

public class FlowEx4_1 {

	public static void main(String[] args) {

//		if-else if��
//		if(���ǽ�1) {
//			���ǽ�1�� �������� true�϶� ����� �����
//		}else if(���ǽ�2){
//			���ǽ�2�� �������� true�϶� ����� ����� 
//		}else if(���ǽ�3){
//			���ǽ�3�� �������� true�϶� ����� ����� 
//		}else {
//			���� ��� ���ǽĵ� �������� ���� �� ����� �����
//		}
		
//		������ ������� ǥ���ϴ� ���α׷�
//		100������ 90�̻��̸� A
//		90�̸� 80�̻��̸� B
//		80�̸� 70�̻��̸� C
//		70�̸� 60�̻��̸� D
//		�������� F�� ������ �ű��
		
//		������ ����� Ű���� �Է��� �޴´�
		
//		����� ������ ??�̰� ����� ??�Դϴ�.
//		�� ����Ѵ�
		
		Scanner scan = new Scanner(System.in);

		System.out.println("������ �Է��ϼ���.");
		int score = scan.nextInt();
		String grade = "";

		if (score >= 90) {
			grade = "A";
			
			if(score >= 95) {
				grade = grade + "+";
			}
		
		} else if (score >= 80) {
			grade = "B";
		} else if (score >= 70) {
			grade = "C";
		} else if (score >= 60) {
			grade = "D";
		} else {
			grade = "F";
		}

		System.out.println("����� ������ " + score + "�� �Դϴ�." 
			+ "����� " + grade + " �Դϴ�.");
		
//		scan.close();
	}

}
