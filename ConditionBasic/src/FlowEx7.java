import java.util.Scanner;

public class FlowEx7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		��ø if��
//		
//		if(���ǽ�1) {
//			���ǽ�1�� �������� true�� ��
//			if(���ǽ�2) {
//			���ǽ�2�� �������� true�� ��
//		}else {
//			���ǽ�1�� true�̰�, ���ǽ�2�� false�� ��
//		}
//		
//		}else {
//			���ǽ�1�� false�� ��
//		}
		
//		95���̻��̸� A+���
//		93��~94���� A���
//		92�����ϸ�	 A-���
		
		Scanner scan = new Scanner(System.in);

		System.out.println("������ �Է��ϼ���.");
		int score = scan.nextInt();
		String grade = "";

//		if(score > 100) {
//			System.out.println("������ 100���� ���� �� �����ϴ�");
//		}
		
		
		if (score >= 90) {
			grade = "A";
		
			if(score >= 95) {
				grade = grade + "+";

			}else if(score <= 92) {
					grade = grade + "-";
			}
		
		} else if (score >= 80) {
			grade = "B";
		
			if(score >= 85) {
				grade = grade + "+";

			}else if(score <= 82) {
					grade = grade + "-";
			}
		}

		System.out.println("����� ������ " + score + "�� �Դϴ�." 
			+ "����� " + grade + " �Դϴ�.");
		
//		scan.close();
			}
	}		


	
