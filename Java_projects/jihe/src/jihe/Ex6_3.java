package jihe;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
public class Ex6_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
       //1.���Ա��д洢5����������  ����ÿ��Ԫ�ز���ӡ���
		List<Integer>list  = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		Iterator<Integer> it = list.iterator();
		
		//��������
		while(it.hasNext()){
			System.out.println(it.next());
		}
		
		//forѭ������
		for(int i=0;i<list.size();i++){
			System.out.println(list.get(i));
		}
		
		//��ǿforѭ��
		for(Integer i:list){
			System.out.println(i);
		}
	}
	
	
	

}
