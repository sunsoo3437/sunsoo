package 복습;

public class Tv {
	int channel;//멤버변수, 전역변수,자동초기화
	int volumne;//메소드영역
	boolean onOff;
	static int count;//static -> 정적변수(객체 상관없이 클래스 당 하나)-> 누적시킬 변수, 객체별로 접근하여 쓸 수 있음
	
	//생성자 오버로딩, 입력값만 다르게 하면 메소드 이를을 동하게 씀
	public Tv(int channel, int volumne, boolean onOff) {
		count++; //정적변수
//		System.out.println("객체 생성 개수는 " + count);
		this.channel = channel;
		this.volumne = volumne;
		this.onOff = onOff;
	}

	@Override
	public String toString() {
		return "Tv [channel=" + channel + ", volumne=" + volumne + ", onOff=" + onOff + "]";
	}
		
	
}
