package jihe;

import java.util.ArrayList;
import java.util.List;

public class Ex6_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		2.��һ���б��д洢����Ԫ��:
//	    apple,grape,banana,pear
//		���ؼ��������ĺ���С��Ԫ��
//		�����Ͻ�������,��������Ľ����ӡ�ڿ���̨��
		
		List<String> list = new ArrayList<String>();
		list.add("apple");
		list.add("grape");
		list.add("banana");
		list.add("pear");
		
		for(int j=0;j<list.size()-1;j++){
			for(int i=0;i<list.size()-1-j;i++){
				if(list.get(i).compareTo(list.get(i))>0){
					String temp = list.get(i);
					list.set(i,list.get(i+1));
					list.set(i+1,temp);
				}
			}
		}

		
		System.out.println("������˳����:");
		for(int i=0;i<list.size();i++){
			System.out.print(list.get(i)+" ");	
		}
		
		System.out.println();
		System.out.println("����������Ԫ����:"+list.get(0));
		System.out.println("��������С��Ԫ����:"+list.get(3));
	}

}
