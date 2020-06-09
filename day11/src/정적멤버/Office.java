package 정적멤버;

public class Office {

	public static void main(String[] args) {
		Worker worker1 = new Worker("임아무개","남",24);
		Worker worker2 = new Worker("박아무개","여",25);
		Worker worker3 = new Worker("김아무개","남",23);

		System.out.println(worker1);
		System.out.println(worker2);
		System.out.println(worker3);
		System.out.println("전체 직원 수는 " + Worker.count + "명");
		System.out.println("직원들의 평균 나이는 " + (Worker.totAge / Worker.count) + "세");
		
		System.out.println("전체 직원 수는 " + Worker.getCount() + "명");
		System.out.println("평균 나이는 " + Worker.getTotAge()/Worker.getCount() + "세");
	}

}
