package �������;

public class Day {
	//�ν��Ͻ� ����
	String doing;
	int time;
	String location;
	//����ƽ ����
	static int count;
	static int totalTime;
	
	public Day(String doing, int time, String location) {
		count++;
		totalTime += time; // totalTime  = totalTime + time; 
		this.doing = doing;
		this.time = time;
		this.location = location;
	}

	@Override
	public String toString() {
		return "Day [doing=" + doing + ", time=" + time + ", location=" + location + "]";
	}
	
}
