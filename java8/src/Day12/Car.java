package Day12;

public class Car {
	// �ʵ�
	String company = "���";
	String model = "�ҿ�";
	String color = "�Ķ�";
	int maxSpeed = 250;
	int speed = 0;
	
	// ������
	Car() {
//		this.company = "���";
//		this.color = "����";
//		this.maxSpeed = 300;
		this("���", "����", 300);
		//�����ڸ� �������� ������ �⺻ �����ڰ� �ڵ����� �ۼ���.
		//�����ڴ� �������� ���� ���� �� ���� (�����ε�)
	}
	
	Car(String company, String color, int maxSpeed) {
		this.company = company;    //���� �̸����� ��� �� ���� �ʵ�� �����ϱ� ���� �ʵ忡 this.�� ����
		this.color = color;      //���� �̸� �ٲٸ� this �Ƚᵵ �� company = com; �̷��� ��
		this.maxSpeed = maxSpeed;
	}
	
	Car(String color, int maxSpeed) {
		this("���", color, maxSpeed);
	}
	
	Car(int maxSpeed) {
		this("���", "����", maxSpeed);
	}
	

//	Car(int maxSpeed, String color, String company) {
//		 // �ڷ����� ���°� ������ �ȵ� 
//		// ������ ��Ʈ�� ��Ʈ�� ��Ʈ�� �Ʒ����� ��Ʈ�� ��Ʈ�� ��Ʈ �ȵȴ� �̸��̾�
//	}
	
	//�޼ҵ�
	void accel() {
		
		speed += 10;
		
		if(speed > maxSpeed)
		{
			speed = maxSpeed;
		}
		System.out.println("���� : " + speed);
	}
	
	void brake() {
		speed = 0;
		System.out.println("���� : " + speed);
	}
	

}
