package itheima;
import java.util.*;
import java.util.stream.Stream;
public class stream_text1 {

	public static void main(String[] args) {
		List<String>list = new ArrayList<>();
		list.add("lisi");
		list.add("zhansan");
		list.add("wangwu");
		//����һ��stream��
		Stream<String>stream = list.stream();
		
		//������н�ȡ
		Stream<String>stream1 = stream.filter(i ->i.startsWith("li"));
		Stream<String>stream2 = stream1.limit(2);
		
		//�������
		stream2.forEach(j->System.out.println(j));
		System.out.println("--------");
		
		//ͨ����ʽ��ɾۺϲ���
		list.stream().filter(i->i.startsWith("li")).limit(2)
		.forEach(j->System.out.println(j));
      
		
		
		
		
		
		
		
		
	}

}
