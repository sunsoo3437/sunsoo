package �������;

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
	
	// �ν��Ͻ� ������ ������ ���� ���� �� ���!
	// ��ü ���� ��, �Ϲ� �޼ҵ�� ȣ���Ͽ� ����� �� ����
	// worker.getName()
	public String getName() {
		return name;
	}
	
	// ����ƽ ������ ������ ���� ���� �� ���!
	// ����ƽ => ��ü �������� �ʾƵ� Ŭ���� �̸����� �ٷ� �����Ͽ� ��� ����!
	// Ŭ�����̸�.����ƽ���� , Ŭ�����̸�.����ƽ�޼ҵ�
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
