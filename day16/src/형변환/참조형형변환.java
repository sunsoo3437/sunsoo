package ����ȯ;

import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JLabel;

public class ����������ȯ {

	public static void main(String[] args) {
		//�迭�� ����ȯ�� ����.
		//Ŭ������, Ŭ������ �������̽��� ����
		//���, �������迡���� ����
		//�ڵ���Ÿ�̾�(����,��) <- �ѱ�Ÿ�̾�,��ȣŸ�̾�
		//�峭��Ÿ�̾�(����,��) <- ����ȯ �Ұ�
		//�ڵ���Ÿ�̾�(ū)<- �ѱ�Ÿ�̾�(��) / �ڵ�����ȯ
		//�ڵ���Ÿ�̾�(ū)-> �ѱ�Ÿ�̾�(��) / ��������ȯ
		//��Ӱ��迡���� ��Ҵ� �������� ����!
		//�ڵ���Ÿ�̾ �� ū ����.
		
		//������ �����̸� �ȴ�.
		//����<-���ڼ���18,���ڼ���18
		//����, ��Ӱ��谡 �ƴϱ� ������ �������� ���� �� ����.
		//f.add(Component c) <- 26���� �ڽĵ��� �� ���� �� ����
		//�ڵ�����ȯ,��ĳ����
		//��������ȯ,�ٿ�ĳ���� : �Ұ�ȣ�� ����ض�!!
		
		ArrayList list= new ArrayList();
		//�ƹ��ų� �� ����, ũ�⵵ ��������
		//Object�� ��� Ŭ������ �ֻ��� �θ�
		//��ĳ���õǾ� ��.
		//�θ��ڸ��� ���������, �� �Ʒ��� �ִ� �ڽñ⳪ �ļ��� �θ��ڸ��� �� �� �� �ִ�.
		//�ڵ�����ȯ
		list.add("����");
		list.add(100); //Integer(����Ŭ����,rapper class)
		//�⺻��--����ڽ�-->����Ŭ����--��ĳ����-->Object(����ŭ)
		
		//�⺻��---(����, boxing)---> ����Ŭ����
		//�⺻��<---(����x, unboxing)-- ����Ŭ����
		//�ڵ��ڽ�, ��ڽ�(auto boxing, unboxing)
		list.add(11.22); //Double
		list.add(true); //Boolean
		list.add(new JButton());
		list.add(new JLabel());
		
		Object food = list.get(0);//Object
		String food2 = (String)list.get(0);
		
	}

}
