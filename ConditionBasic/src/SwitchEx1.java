
public class SwitchEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		switch(���ǽ�) {
//		case ��1:
//			���ǽ��� ����� ��1�� ���� ��� ����� �����
//			break;
//		case ��2:
//			���ǽ��� ����� ��2�� ���� ��� ����� �����
//			break;
//			.
//			.
//			.
//			default:
//				������ ����� ��ġ�ϴ� case���� ���� �� ����� �����
//		}
//
//		switch���� ��������
//		���ǽ��� ������� �ݵ�� �������� �Ѵ�
//		���ǽ� ����� ���� �Ǵ� ���ڿ�
//		case���� ���� ���� ����� ����, �ߺ��Ǹ� �ȵȴ�

//		500���� ��ǰ�� ��ǻ���Դϴ�
//		100���̵� ���̵� �ڽ��� ��ȣ�� ����Ѵ�.
//		���� ��쿡�� "����� ��ȣ�� ??�Դϴ�. �� ���� ��ȸ�� ������ּ���"
//		
//		������ ���ڸ� �޾Ƽ� ��÷�� �Ѵ�
		
//		int choiceNum = 0;
//		
//		choiceNum = 1;
		
		
		int rndNum = 0;
		
		rndNum = (int) (Math.random() * 10);   // +1 �ϸ� 1~10  
		rndNum = rndNum * 100; // *101 �ϸ� 0~100
	   
		System.out.println("����� ��ȣ�� " + rndNum + "�Դϴ� ");
		
		switch (rndNum) {
			case 100:
				System.out.println("��ǰ�� �������Դϴ�"); 
				break;
			case 200:
				System.out.println("��ǰ�� TV�Դϴ�"); //break; ������ 100 200 �� ��� 
				break;
			case 300:
				System.out.println("��ǰ�� ��Ʈ���Դϴ�");
				break;
			case 400:
				System.out.println("��ǰ�� �ڵ����Դϴ�");
				break;
			case 500:
				System.out.println("��ǰ�� ��ǻ���Դϴ�");
				break;
			default:
				System.out.println("�� ���� ��ȸ�� ������ּ���");
				break;
		}
		
		
		System.out.println("���α׷��� �����մϴ�");
		
		
		
		
		}
}


