package 정적멤버;

public class Worker {
	String name;
	String gender;
	int age;
	
	static int totAge;
	static int count;
	
	public Worker(String name, String gender, int age) {
		count++;
		totAge += age;
		this.name = name;
		this.gender = gender;
		this.age = age;
	}
	
	// 인스턴스 변수를 가지고 오고 싶을 때 사용!
	// 객체 생성 후, 일반 메소드는 호출하여 사용할 수 있음
	// worker.getName()
	public String getName() {
		return name;
	}
	
	// 스태틱 변수를 가지고 오고 싶을 때 사용!
	// 스태틱 => 객체 생성하지 않아도 클래스 이름으로 바로 접근하여 사용 가능!
	// 클래스이름.스태틱변수 , 클래스이름.스태틱메소드
	// Worker.getTotAge()
	public static int getTotAge() {
		return totAge;
	}
	
	public static int getCount() {
		return count;
	}
	
	@Override
	public String toString() {
		return "Worker [name=" + name + ", gender=" + gender + ", age=" + age + "]";
	}
	
	
	
	
}
