package ��ӻ�����;

public class ���ǰԽ��� extends �ϹݰԽ���{
	String reply;

//	public ���ǰԽ���() {
//		super();// ������
//		//�⺻������ ȣ���� ���������� �� �� ����
//	}
//	
//	public ���ǰԽ���(String reply) {
//		super();
//		this.reply = reply;
//	}
//	
	public ���ǰԽ���(int no, String title, String content, String writer, String reply) {
		super(no, title, content, writer);
		//����Ŭ������ �Ķ���� ������
		//����Ŭ������ �����ڴ� �ݵ�� �ڽ�Ŭ���� ������ ù��!!
		//�Ķ������ִ� �����ڴ� ��������� ȣ��!
		this.reply = reply;
	}

	@Override
	public String toString() {
		return "���ǰԽ��� [reply=" + reply + ", no=" + no + ", title=" + title + ", content=" + content + ", writer="
				+ writer + "]";
	}
	
}
