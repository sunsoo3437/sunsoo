package 정적멤버;

import java.io.FileWriter;
import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class 크롤링연습 {

	public static void main(String[] args) throws Exception {
		// 파일 입출력 처리할때, 외부자원과 연결하는 경우 반드시
		// 예외처리해야함 ->  throws Exception
		
		Document doc = Jsoup.connect("http://www.naver.com").get();
		// 체인식 코딩
		System.out.println(doc);
		
		//메타데이터(부가적인 데이터) : <> : tag(태그)
		//웹페이지는 tag가 주요 구성요소(element)
		//<span class = "date">20200609</span>
		Elements list = doc.select(".current");
		//select 안에 써서 검색할수 있는것
		//태그이름(태그이름), 클래스이름(.클래스이름), id이름(#id이름)
		System.out.println(list.size());
		FileWriter file = new FileWriter("naver.txt");
		for (Element e : list) {
			System.out.println(e.text());
			file.write(e.text() + "\n");
		}
		file.close();//stream
	}

}
