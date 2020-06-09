package �������;

import java.io.FileWriter;
import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class ũ�Ѹ����� {

	public static void main(String[] args) throws Exception {
		// ���� ����� ó���Ҷ�, �ܺ��ڿ��� �����ϴ� ��� �ݵ��
		// ����ó���ؾ��� ->  throws Exception
		
		Document doc = Jsoup.connect("http://www.naver.com").get();
		// ü�ν� �ڵ�
		System.out.println(doc);
		
		//��Ÿ������(�ΰ����� ������) : <> : tag(�±�)
		//���������� tag�� �ֿ� �������(element)
		//<span class = "date">20200609</span>
		Elements list = doc.select(".current");
		//select �ȿ� �Ἥ �˻��Ҽ� �ִ°�
		//�±��̸�(�±��̸�), Ŭ�����̸�(.Ŭ�����̸�), id�̸�(#id�̸�)
		System.out.println(list.size());
		FileWriter file = new FileWriter("naver.txt");
		for (Element e : list) {
			System.out.println(e.text());
			file.write(e.text() + "\n");
		}
		file.close();//stream
	}

}
