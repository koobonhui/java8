package Day12;

public class Car {
	// 필드
	String company = "기아";
	String model = "소울";
	String color = "파랑";
	int maxSpeed = 250;
	int speed = 0;
	
	// 생성자
	Car() {
//		this.company = "기아";
//		this.color = "검정";
//		this.maxSpeed = 300;
		this("기아", "검정", 300);
		//생성자를 생성하지 않으면 기본 생성자가 자동으로 작성됨.
		//생성자는 여러개를 같이 만들 수 있음 (오버로딩)
	}
	
	Car(String company, String color, int maxSpeed) {
		this.company = company;    //같은 이름으로 사용 할 때는 필드와 구분하기 위해 필드에 this.을 붙임
		this.color = color;      //변수 이름 바꾸면 this 안써도 됨 company = com; 이렇게 됨
		this.maxSpeed = maxSpeed;
	}
	
	Car(String color, int maxSpeed) {
		this("기아", color, maxSpeed);
	}
	
	Car(int maxSpeed) {
		this("기아", "검정", maxSpeed);
	}
	

//	Car(int maxSpeed, String color, String company) {
//		 // 자료형의 형태가 같으면 안됨 
//		// 위에서 스트링 스트링 인트면 아래에서 스트링 스트링 인트 안된다 이말이야
//	}
	
	//메소드
	void accel() {
		
		speed += 10;
		
		if(speed > maxSpeed)
		{
			speed = maxSpeed;
		}
		System.out.println("현속 : " + speed);
	}
	
	void brake() {
		speed = 0;
		System.out.println("현속 : " + speed);
	}
	

}
